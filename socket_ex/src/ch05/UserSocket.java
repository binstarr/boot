package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class UserSocket extends Thread {

	private boolean isRun = true;
	private Socket socket;
	ServerGUI mContext;
	Server server;
	String nickName;
	String currentRoomName;
	Client client;
	StringTokenizer tokenizer;
	UserSocket info;
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;
	Boolean roomCheck = true;

	public UserSocket(Socket socket, ServerGUI mContext) {
		this.socket = socket;
		this.mContext = mContext;
		System.out.println("유저 연결됨");
		this.server = mContext.server;
		initData();
		network();

	}

	private void initData() {
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void sendMessage(String msg) {
		System.out.println(msg + "  :마지막 확인");
		try {
			bufferedWriter.write(msg + "\n");
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void network() {
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			nickName = bufferedReader.readLine();
//			String roomName = bufferedReader.readLine();

			mContext.getInfoText().append(nickName + "입장 완료");
//			mContext.getInfoText().append(roomName + "생성 완료");

			System.out.println("======================");
//			System.out.println("NewUser/" + nickName);
			String userInfo = "NewUser/" + nickName;
//			String roomInfo = "CreateRoom/" + roomName;
			System.out.println(userInfo);
			server.broardCast(userInfo);
//			server.broardCast(roomInfo);

//			server.vectors.add(this);
			for (int i = 0; i < server.vectors.size(); i++) {
				info = server.vectors.elementAt(i);
				sendMessage("OldUser/" + info.nickName);
			}
			server.vectors.add(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		new Thread(() -> {
			while (isRun) {
				try {
					String msg = bufferedReader.readLine();
					System.out.println(" 넘겨 받은 메세지 : " + msg);
					// TODO boardCast 해야함
//					server.broardCast(msg); inmessage에서 서버로 어떻게 보낼지 설정해야함 ㅡㅡ
					inMessage(msg);
					System.out.println("msg : " + msg);
					System.out.println();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	public void inMessage(String serverMsg) {
		// /a/y/ghh
		tokenizer = new StringTokenizer(serverMsg, "/");
		System.out.println("message 여기: " + serverMsg);
//		System.out.println("userName : "  + tokenizer);

		String protocol = tokenizer.nextToken();
		String message = tokenizer.nextToken();

		System.out.println("서버protocol : " + protocol);
		System.out.println("서버message : " + message);

		if (protocol.equals("CreateRoom")) {
			for (int i = 0; i < server.getRoomVectors().size(); i++) {
				RoomInfo room = server.getRoomVectors().elementAt(i);
				if (room.getRoomName().equals(message)) {
					sendMessage("CreateRoomFail/ok");
					roomCheck = false;
					break;
				} else {
					roomCheck = true;
				}
			}
			if (roomCheck == true) {
				RoomInfo newRoom = new RoomInfo(message, this);
				server.getRoomVectors().add(newRoom);
				server.broardCast("CreateRoom/" + message);
//				server.broardCast("new_Room/" + message);
			}

		}

	}

}
