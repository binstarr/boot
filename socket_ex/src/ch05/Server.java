package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JOptionPane;

import lombok.Getter;

@Getter
public class Server {
	ServerGUI mContext;
	ClientGUI cContext;
	ServerSocket serverSocket;
	UserSocket socket2;
	Vector<UserSocket> vectors = new Vector<UserSocket>();
	Vector<RoomInfo> roomVectors = new Vector<RoomInfo>();
	ServerGUI gui;
	private String userId;
	private Server server;
	private Socket socket;
	private String nickName;
	int port;

	private InputStream is;
	private OutputStream os;
	private DataInputStream dis;
	private DataOutputStream dos;
	private BufferedReader bufferedReader;
	private BufferedWriter bufferedWriter;

	public Server(int port, ServerGUI serverGUI) {
		this.port = port;
		this.mContext = serverGUI;
	}

	public void startNetwork() {
		try {
			serverSocket = new ServerSocket(ServerGUI.portNumber);
			mContext.getInfoText().append("서버 시작");
			connect();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void connect() {
		System.out.println("서버 연결 시작 \n");
		new Thread(() -> {
			while (true) {
				try {
					System.out.println("클라이언트 접속 대기 중");
					socket = serverSocket.accept(); // 서버 여는거
					mContext.getInfoText().append("사용자접속 \n");
					UserSocket userSocket = new UserSocket(socket, mContext);
					userSocket.start();

					// System.out.println(userSocket);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	public void broardCast(String msg) {
		System.out.println("2번 : " + msg);
		for (int i = 0; i < vectors.size(); i++) {
			vectors.get(i).sendMessage(msg);
		}
	}

}
