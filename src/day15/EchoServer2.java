package day15;

import java.io.*;
import java.net.*;

public class EchoServer2 {
	private ServerSocket serverS;

	public EchoServer2(int port) {
		try {
			serverS = new ServerSocket(port);						// 포트번호로 ServerSocket 초기화
			System.out.println("서버가 시작되었습니다. 포트: " + port); 	// 포트번호 출력
		} catch (IOException ioe) {
			ioe.printStackTrace();									// 스택 추적 인쇄(실행 오류 출력)
			System.exit(0);											// 더이상 쓸 필요가 없으니 종료시킨다
		}

		while (true) {											// 무한 루프 시작
			Socket tcpSocket = null;							// tcpSocket = null로 초기화 함
			try {
				tcpSocket = serverS.accept(); 					// 클라이언트 연결 수락
				System.out.println("입장 IP : " + tcpSocket.getInetAddress().getHostAddress()); 
				//소켓객체를 getInetAddress, getHostAddress 객체를 반환한다 // 클라이언트의 IP주소 출력함

				handleClient(tcpSocket);						// 클라이언트 소켓을 처리하는 메서드 호출
			} catch (IOException ioe) {							// IOException가 실행되면
				ioe.printStackTrace();							// 스택 추적 인쇄(실행 오류 출력)
			} finally {
				if (tcpSocket != null) {						// tcpSocket이 null이 아닐시
					try {										//
						tcpSocket.close(); 						// 클라이언트 소켓 닫기
					} catch (IOException e) {					// IOException가 실행되면 
						e.printStackTrace();					// 스택 추적 인쇄(실행 오류 출력)
					}
				}
			}
		}
	}

	private void handleClient(Socket clientSocket) {	// handleClient 메서드
		try (BufferedReader bufferR = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 	
			// 클라이언트 소켓에 입력 받은 것을 bufferR로 넣음 // BufferedReader == Scanner와 유사함
			 BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))) { 
			// 클라이언트 소켓에 있는 데이터를 bufferW로 통해 출력 함 // BufferedWriter == System.out.println()과 유사함  

			String message; 										//message 변수선언
			while ((message = bufferR.readLine()) != null) {		
				if ("exit".equalsIgnoreCase(message.trim())) {		 
					break; 											// "exit" 입력 시 연결 종료
				}
				System.out.println("Received message: " + message); // 받은 메시지를 출력함
				message += System.getProperty("line.separator");
				bufferW.write(message);								// 클라이언트로 메시지를 다시 보냄 
				bufferW.flush();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();	//IOException, 스택 추적 인쇄
		}
	}

	public static void main(String[] args) {
		new EchoServer2(3002);		// main 메서드에서 포트 3002로 EchoServer2 인스턴스를 생성 
	}
}