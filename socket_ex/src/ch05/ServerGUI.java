package ch05;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import lombok.Getter;

@Getter
public class ServerGUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextArea infoText;
	private JTextField guestPortNum;
	private JButton serverStartButton;
	private JButton serverEndButton;

	public static final String HOST_IP = "localhost";
	public static int portNumber;
	Server server;
	Socket socket;
	ServerSocket serverSocket;
	BufferedReader bufferedReader;
	ServerGUI mContext = this;

	public ServerGUI() {
		initData();
		setInitLayout();
		addListener();
	}

	private void setInitLayout() {
		setBounds(100, 100, 450, 446);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		guestPortNum.setBounds(203, 300, 113, 21);
		guestPortNum.setColumns(10);
		infoText.setBounds(41, 40, 368, 203);
	}

	private void initData() {
		setTitle("KokoTalk");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		infoText = new JTextArea();
		contentPane.add(infoText);
		infoText.setColumns(10);

		guestPortNum = new JTextField("20000");

		contentPane.add(guestPortNum);

		JLabel lblNewLabel = new JLabel("Port Number : ");
		lblNewLabel.setBounds(100, 303, 91, 15);
		contentPane.add(lblNewLabel);

		serverStartButton = new JButton("서버실행");
		serverStartButton.setBounds(66, 361, 91, 23);
		contentPane.add(serverStartButton);

		serverEndButton = new JButton("서버중지");
		serverEndButton.setBounds(278, 361, 91, 23);
		contentPane.add(serverEndButton);

	}

	private void addListener() {
		serverStartButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == serverStartButton) {
			if(guestPortNum.getText().length() == 0) {
				System.out.println("값을 입력 하세요.");
			}else if(guestPortNum.getText().length() != 0) {
				portNumber = Integer.parseInt(guestPortNum.getText());
				server = new Server(portNumber, this);
				server.startNetwork();
				infoText.append(guestPortNum.getText() + "서버를 시작합니다. \n");
				serverStartButton.setEnabled(false);
			}
		}else if(e.getSource() == serverEndButton) {
			serverStartButton.setEnabled(true);
		}
	} // end of actionPerformed

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerGUI frame = new ServerGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}// end of class
