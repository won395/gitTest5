package day15;

import java.io.*;
import java.net.*;

public class EchoClient2 {
	private String ip;
	private int port;
	private BufferedReader file;
	private BufferedWriter bufferW;
	private BufferedReader bufferR;
	private Socket tcpSocket;

	public EchoClient2(String ip, int port) {
		this.ip = ip;
		this.port = port;
		try {
			tcpSocket = new Socket(ip, port);  // 소켓 생성
			OutputStream os_socket = tcpSocket.getOutputStream();
			InputStream is_socket = tcpSocket.getInputStream();

			bufferW = new BufferedWriter(new OutputStreamWriter(os_socket));
			bufferR = new BufferedReader(new InputStreamReader(is_socket));
			file = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				System.out.print("입력: ");
				String str = file.readLine();  // 사용자 입력 받기
				if (str.equalsIgnoreCase("exit")) {  // "exit" 입력 시 반복문 종료
					closeResources();  // 자원 정리
					break;
				}
				str += System.getProperty("line.separator"); 	// 줄바꿈 추가
				bufferW.write(str);  							// 서버로 전송
				bufferW.flush();

				str = bufferR.readLine();  // 서버로부터 응답 받기
				if (str != null) {
					System.out.println("Echo Result: " + str);  	// 상대 클라이언트가 내 서버로 통해 메세지 보낸거 출력
				} else {
					System.out.println("서버 연결이 종료되었습니다.");	// null이면 출력
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();						// IOException, 스택 추적 인쇄(실행 오류 출력)
		}
	}

	private void closeResources() {						// closeResources() 메서드
		try {
			if (file != null) file.close();
			if (bufferW != null) bufferW.close(); 		// bufferW가 null이 아닐시 닫기
			if (bufferR != null) bufferR.close();		// bufferR가 null이 아닐시 닫기
			if (tcpSocket != null) tcpSocket.close();	// tcpSocket가 null이 아닐시 닫기
		} catch (IOException e) {
			e.printStackTrace();						// IOException, 스택 추적 인쇄(실행 오류 출력)
		}
	}

	public static void main(String[] args) {
		new EchoClient2("192.168.40.69", 3002); //IP에 포트번호 EchoClient2 인스턴스 생성
	}
}