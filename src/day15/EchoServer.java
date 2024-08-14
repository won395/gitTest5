package day15;

import java.io.*; 
import java.net.*; 
public class EchoServer{ 
	private BufferedReader bufferR; 
	private BufferedWriter bufferW; 
	private InputStream is; 
	private OutputStream os; 
	private ServerSocket serverS; 
	public EchoServer(int port){ 
		try{ 
			serverS = new ServerSocket(port); 
		}catch(IOException ioe){ 
			ioe.printStackTrace(); 
			System.exit(0); 
		} 
		while(true){ 
			try{ 
				System.out.println("client가 접속했습니다."); 
				Socket tcpSocket = serverS.accept(); 
				System.out.println("사용 IP : "+ 
						tcpSocket.getInetAddress().getHostAddress()); 
				is = tcpSocket.getInputStream(); 
				os = tcpSocket.getOutputStream(); 
				bufferR = new BufferedReader( 
						new InputStreamReader(is)); 
				bufferW = new BufferedWriter( 
						new OutputStreamWriter(os)); 
				String message = bufferR.readLine(); 
				System.out.println("message : "+ message); 
				message += System.getProperty("line.separator"); 
				bufferW.write(message); 
				bufferW.flush(); 
				bufferR.close(); 
				bufferW.close(); 
				tcpSocket.close(); 
			}catch(IOException ioe){ 
				ioe.printStackTrace(); 
			} 
		} 
	} 
	public static void main(String[] args){ 
		new EchoServer(3000); 
	} 
}