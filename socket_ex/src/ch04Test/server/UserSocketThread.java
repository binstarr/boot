package ch04Test.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UserSocketThread extends Thread {
	ServerFile mContext;
	Socket socket;
	int id;
	private boolean isRun = true;
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;
	
	public UserSocketThread(int id, Socket socket, ServerFile serverFile) {
		this.id = id;
		this.socket = socket;
		this.mContext = serverFile;
		initData();
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
		try {
			bufferedWriter.write(msg + "\n");
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		new Thread(() -> {
			while(isRun) {
				try {
					String msg = bufferedReader.readLine();
					System.out.println(id + ": 가 받은 메세지 : " + msg);
					
					mContext.broadCast(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						bufferedReader.close();
						bufferedWriter.close();
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	
}
