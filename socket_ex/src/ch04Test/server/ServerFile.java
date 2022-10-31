package ch04Test.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ServerFile {
	ServerFile mContext = this;
	ServerSocket serverSocket;
	public static final String HOST_IP = "localhost";
	public static final int HOST_PORT = 20000;
	Vector<UserSocketThread> vectors = new Vector<>();
	
	public ServerFile() {
		initData();
	}

	private void initData() {
		try {
			System.out.println(">>>>> 서버 시작 <<<<<");
			serverSocket = new ServerSocket(HOST_PORT);
			
			new Thread(() -> {
				while(true) {
					try {
						Socket socket = serverSocket.accept();
						// 여기서 usersocketthread 생성
						UserSocketThread userSocketThread = new UserSocketThread(vectors.size(), socket, mContext);
						userSocketThread.start();
						vectors.add(userSocketThread);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void broadCast(String msg) {
		for(int i = 0; i < vectors.size(); i++) {
			vectors.get(i).sendMessage(msg);
		}
	}
	
}
