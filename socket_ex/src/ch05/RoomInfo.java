package ch05;

import java.util.Vector;

import lombok.Getter;

@Getter
public class RoomInfo {
	
	ServerGUI mContext;
	String roomName;
	ClientGUI cContext;
	Vector<UserSocket> roomAllList = new Vector<>();
	
	
	public RoomInfo(String roomName, UserSocket userSocket) {
		this.roomName = roomName;
		this.roomAllList.add(userSocket.info);
		userSocket.currentRoomName = roomName;
	}
	private void roomBroadCast(String str) {
		for(int i = 0; i < roomAllList.size(); i++) {
			UserSocket userInfo = roomAllList.elementAt(i);
			userInfo.sendMessage(str);
			
		}
	}
}
