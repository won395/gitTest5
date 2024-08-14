package test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.List;

public class DevRemoveServer_1 {
    private MulticastSocket socket;
    private InetAddress group;
    private static final int PORT = 5000;
    private static final String HOST = "239.255.255.250";  // 멀티캐스트 주소
    private List<String> list = new ArrayList<String>();

    public DevRemoveServer_1() {
        try {
            group = InetAddress.getByName(HOST);
            socket = new MulticastSocket(PORT);
            socket.setTimeToLive(0);                       // 같은 로컬 네트워크 내에서만
            socket.joinGroup(group);
            System.out.println("서버 시작중...");

            while (true) {
                byte[] buffer = new byte[256];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                String received = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received from client: " + received);

                // 메시지를 리스트에 추가
                if (received.startsWith("ADD:")) {
                    String messageToAdd = received.substring(4).trim();
                    list.add(messageToAdd);
                    System.out.println("Message added: " + messageToAdd);
                } 
                // 메시지를 리스트에서 삭제
                else if (received.startsWith("REMOVE:")) {
                    String messageToRemove = received.substring(7).trim();
                    if (list.remove(messageToRemove)) {
                        System.out.println("Message removed: " + messageToRemove);
                    } else {
                        System.out.println("Message not found: " + messageToRemove);
                    }
                }

                // 여기에서 멀티캐스트 그룹에 다시 전송하거나 기타 작업을 수행할 수 있습니다.
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.leaveGroup(group);
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new DevRemoveServer_1();
    }
}
