package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

public class Client {
	Server mContext;
	ClientGUI cContext;
	private boolean isRun = true;
	private String endLine = "\n";
	private String userId;
	private String nickName;
	private Socket socket;
	private BufferedReader bufferedReader;
	private BufferedReader keyboardReader;
	private BufferedWriter bufferedWriter;
	private StringTokenizer tokenizer;
	RoomInfo info;
	Vector<String> roomName = new Vector<>();

	boolean flag = true;
	// 네트워크
	int port;
	String id;

	public Client(String id, int port, ClientGUI cContext) {
		this.port = port;
		this.id = cContext.getInputUserID().getText();
		this.cContext = cContext;
		initData();
		network();
	}

	private void initData() {
		System.out.println("[클라이언트 소켓 시;작]");
		try {
			socket = new Socket(ServerGUI.HOST_IP, ClientGUI.portNumber); // 클라이언트 접속
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			keyboardReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			nickName = cContext.getInputUserID().getText().trim();
			// sendMessage(nickName);
			System.out.println("nickName : " + nickName);

			bufferedWriter.write(nickName + endLine);
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void inMessage(String serverMsg) {
		tokenizer = new StringTokenizer(serverMsg, "/");
		System.out.println("message : " + serverMsg);
//		System.out.println("userName : "  + tokenizer);

		String protocol = tokenizer.nextToken();
		System.out.println("클라이언트protocol : " + protocol);
		String message = tokenizer.nextToken();
		System.out.println("클라이언트message : " + message);

		if (protocol.equals("NewUser")) {
			cContext.getUserAllList().add(message);
			System.out.println(cContext.getUserTotalList());
			System.out.println(message + "입니다.message");
			System.out.println(cContext.getUserAllList() + "  2");
			cContext.getUserTotalList().setListData(cContext.getUserAllList());
		} else if (protocol.equals("OldUser")) {
			cContext.getUserAllList().add(message);
			cContext.getUserTotalList().setListData(cContext.getUserAllList());
		} else if (protocol.equals("CreateRoom")) {
			cContext.roomAllList.add(message);
			cContext.getRoomTotalList().setListData(cContext.roomAllList);
		}
	}

	private void network() {
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//			userId = cContext.getInputUserID().getText();
			String test2 = "NewUser/" + nickName;
			sendMessage(test2);
			System.out.println("nickname이 보내는 메시지 : " + nickName);
			cContext.getUserAllList().add(nickName);
			cContext.getUserTotalList().setListData(cContext.getUserAllList());

			Thread reader = new Thread(new Runnable() {
				@Override
				public void run() {
					while (flag) {
						try {
							nickName = bufferedReader.readLine();
							inMessage(nickName);
						} catch (IOException e) {
							flag = false;
							e.printStackTrace();
						}
					}

				}
			});
			reader.start();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void sendMessage(String msg) {
		try {
			System.out.println("msg : " + msg);
			bufferedWriter.write(msg + "\n");
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
