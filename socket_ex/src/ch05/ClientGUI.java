package ch05;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import lombok.Getter;

@Getter
public class ClientGUI extends JFrame implements ActionListener {
	ClientGUI cContext = this;
	ServerGUI mContext;
	Client client;
	Server server;
	// GUI자원
	private JPanel backgroundPanel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;

	private JTabbedPane jTab;
	private JTextField insertIP;
	private JTextField inputPortNumber;
	private JTextField inputUserID;
	private JTextField inputChatArea;
	private JTextArea chatArea;
	private JButton connectBtn;
	private JButton confirm_btn;
	private JButton sendNote_btn;
	private JButton joinRoom_btn;
	private JButton createRoom_btn;
	private JButton roomOutBtn;
	private JButton btn_end;
	private JList userTotalList; // 전체접속자 리스트
	private Vector<String> userAllList = new Vector<String>();
	public Vector<String> roomAllList = new Vector<String>();
	private String roomName;
	private JList roomTotalList; // 방 리스트

	private JScrollPane jScrollPane;
	private JLabel ipText;
	private JLabel portText;
	private JLabel userIdText;
	private JLabel userList;
	public JLabel roomList;

	// network 자원
	public static int portNumber;
	private String userId;
	private String hostIp;

	public ClientGUI() {
		init();
		setInitLayout();
		addListener();
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	private void setInitLayout() {
		setBounds(100, 100, 474, 483);
		backgroundPanel.setLayout(null);
		backgroundPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		jTab.setBounds(12, 27, 328, 407);
		ipText.setBounds(12, 25, 91, 15);
		insertIP.setBounds(112, 21, 199, 21);
		portText.setBounds(12, 72, 91, 15);
		userIdText.setBounds(12, 122, 91, 15);
		inputPortNumber.setBounds(112, 69, 199, 21);
		inputUserID.setBounds(112, 119, 199, 21);

		panel_2.setLayout(null);
		userList.setHorizontalAlignment(SwingConstants.CENTER);
		roomList.setHorizontalAlignment(SwingConstants.CENTER);
		userList.setBounds(12, 28, 102, 15);
		roomList.setBounds(209, 27, 102, 15);
		userTotalList.setBounds(12, 69, 102, 257);
		roomTotalList.setBounds(209, 69, 102, 257);
		sendNote_btn.setBounds(12, 345, 102, 23);
		joinRoom_btn.setBounds(209, 345, 102, 23);

		panel_3.setLayout(null);
		chatArea.setBounds(0, 0, 323, 337);
		inputChatArea.setBounds(0, 347, 214, 21);
		confirm_btn.setBounds(226, 346, 97, 23);
		jScrollPane.setBounds(0, 0, 323, 337);

		createRoom_btn.setBounds(352, 93, 97, 23);
		roomOutBtn.setBounds(352, 150, 97, 23);
		btn_end.setBounds(352, 398, 97, 23);
		roomOutBtn.setEnabled(false);
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backgroundPanel = new JPanel();
		setContentPane(backgroundPanel);
		// tab
		jTab = new JTabbedPane(JTabbedPane.TOP);
		backgroundPanel.add(jTab);
		// 로그인 탭
		panel_1 = new JPanel();
		jTab.addTab("로그인", null, panel_1, null);
		panel_1.setLayout(null);
		// label
		ipText = new JLabel("HOST IP");
		ipText.setFont(new Font("휴먼모음T", Font.BOLD, 13));
		panel_1.add(ipText);
		portText = new JLabel("Server_Port");
		portText.setFont(new Font("휴먼모음T", Font.BOLD, 13));
		panel_1.add(portText);
		userIdText = new JLabel("User_ID");
		userIdText.setFont(new Font("휴먼모음T", Font.BOLD, 13));
		panel_1.add(userIdText);
		// textfield
		insertIP = new JTextField();
		insertIP.setFont(new Font("휴먼모음T", Font.BOLD, 13));
		panel_1.add(insertIP);
		insertIP.setText(mContext.HOST_IP);
		insertIP.setColumns(10);

		inputPortNumber = new JTextField("20000");
		inputPortNumber.setFont(new Font("휴먼모음T", Font.BOLD, 13));
		panel_1.add(inputPortNumber);
		inputPortNumber.setColumns(10);

		inputUserID = new JTextField();
		panel_1.add(inputUserID);
		inputUserID.setColumns(10);
		// JButton
		connectBtn = new JButton("connect");
		connectBtn.setFont(new Font("휴먼모음T", Font.BOLD, 12));
		connectBtn.setBounds(214, 162, 97, 23);
		panel_1.add(connectBtn);

		panel_2 = new JPanel();
		jTab.addTab("대기실", null, panel_2, null);
		// userList
		userList = new JLabel("전체접속자");
		userList.setFont(new Font("휴먼모음T", Font.BOLD, 13));
		panel_2.add(userList);
		// roomList
		roomList = new JLabel("방 리스트");
		roomList.setFont(new Font("휴먼모음T", Font.BOLD, 13));
		panel_2.add(roomList);

		userTotalList = new JList();
		panel_2.add(userTotalList);

		roomTotalList = new JList();
		panel_2.add(roomTotalList);

		sendNote_btn = new JButton("쪽지보내기");
		sendNote_btn.setFont(new Font("휴먼모음T", Font.BOLD, 12));
		panel_2.add(sendNote_btn);

		joinRoom_btn = new JButton("채팅방참여");
		joinRoom_btn.setFont(new Font("휴먼모음T", Font.BOLD, 12));
		panel_2.add(joinRoom_btn);

		panel_3 = new JPanel();
		jTab.addTab("채팅", null, panel_3, null);

		chatArea = new JTextArea();
		chatArea.setEnabled(false);
		chatArea.setEditable(false);
		chatArea.setFont(new Font("휴먼모음T", Font.BOLD, 12));
		panel_3.add(chatArea);

		inputChatArea = new JTextField();
		inputChatArea.setFont(new Font("휴먼모음T", Font.BOLD, 11));
		panel_3.add(inputChatArea);
		inputChatArea.setColumns(10);

		confirm_btn = new JButton("전 송");
		confirm_btn.setFont(new Font("휴먼모음T", Font.BOLD, 12));
		panel_3.add(confirm_btn);

		jScrollPane = new JScrollPane();
		jScrollPane.setEnabled(false);
		panel_3.add(jScrollPane);

		createRoom_btn = new JButton("방 만들기");
		createRoom_btn.setFont(new Font("휴먼모음T", Font.BOLD, 11));
		backgroundPanel.add(createRoom_btn);

		roomOutBtn = new JButton("방 나가기");
		roomOutBtn.setFont(new Font("휴먼모음T", Font.BOLD, 12));

		backgroundPanel.add(roomOutBtn);
		btn_end = new JButton("종료");
		btn_end.setFont(new Font("휴먼모음T", Font.BOLD, 12));
		backgroundPanel.add(btn_end);
		setVisible(true);
	}

	// 이벤트리스너
	private void addListener() {
		connectBtn.addActionListener(this);
		confirm_btn.addActionListener(this);
		sendNote_btn.addActionListener(this);
		joinRoom_btn.addActionListener(this);
		inputChatArea.addActionListener(this);
		btn_end.addActionListener(this);
		createRoom_btn.addActionListener(this);
		roomOutBtn.addActionListener(this);
	}

	// 서버에 내 이름을 뿌린다 -> 서버는 모든 사용자한테 이름들을 뿌린다.....
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == connectBtn) {
			if (insertIP.getText().length() == 0) {
				insertIP.setText("IP를 입력하세요");
			} else if (inputPortNumber.getText().length() == 0) {
				inputPortNumber.setText("포트번호를 입력하세요");
			} else if (inputUserID.getText().length() == 0) {
				inputUserID.setText("id 를 입력하세요");
			} else {
				hostIp = insertIP.getText();
				try {
					portNumber = Integer.parseInt(inputPortNumber.getText().trim());
				} catch (Exception e2) {
					inputPortNumber.setText("잘못 입력하였습니다.");
				}
				client = new Client(ServerGUI.HOST_IP, portNumber, this);
				userId = inputUserID.getText();
				setTitle("[" + userId + " ] 님 코코톡에 오신걸 환경합니다.");
				connectBtn.setEnabled(false);
			}
		} else if (e.getSource() == createRoom_btn) {
			System.out.println("누름");
			roomName = JOptionPane.showInputDialog("방 이름을 입력하세요");
			if (roomName != null) {
				System.out.println("방 생성 완료");
				client.sendMessage("CreateRoom/" + roomName);
				roomOutBtn.setEnabled(true);
				createRoom_btn.setEnabled(false);
			}
		} else if (e.getSource() == joinRoom_btn) {
			System.out.println("방 입장 버튼 클릭");
		}
	}

	public static void main(String[] args) {
		new ServerGUI();
		new ClientGUI();
		new ClientGUI();
	}
}
