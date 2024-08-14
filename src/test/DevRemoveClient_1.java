package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class DevRemoveClient_1 extends JFrame {
    private JTextArea txtAreaDisplay;
    private JTextField txtMessage;
    private JButton btnSend;
    private JButton btnRemove;
    private MulticastSocket socket;
    private InetAddress group;
    private static final int PORT = 5000;
    private static final String HOST = "239.255.255.250";
    private String clientId;

    public DevRemoveClient_1(String clientId) {
        super("Multicast Client - " + clientId);
        this.clientId = clientId;

        txtAreaDisplay = new JTextArea(16, 30);
        txtAreaDisplay.setEditable(false);
        txtMessage = new JTextField(20);
        btnSend = new JButton("Send");
        btnRemove = new JButton("Remove");
        JScrollPane scrollPane = new JScrollPane(txtAreaDisplay);

        add(scrollPane, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(txtMessage, BorderLayout.CENTER);
        bottomPanel.add(btnSend, BorderLayout.EAST);
        bottomPanel.add(btnRemove, BorderLayout.WEST);
        add(bottomPanel, BorderLayout.SOUTH);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);

        // Socket setup
        try {
            group = InetAddress.getByName(HOST);
            socket = new MulticastSocket(PORT);
            socket.joinGroup(group);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Send button action
        btnSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = "ADD:" + clientId + ": " + txtMessage.getText();
                byte[] buffer = message.getBytes();
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, group, PORT);
                try {
                    socket.send(packet);
                    txtMessage.setText("");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Remove button action
        btnRemove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = "REMOVE:" + clientId + ": " + txtMessage.getText();
                byte[] buffer = message.getBytes();
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, group, PORT);
                try {
                    socket.send(packet);
                    txtMessage.setText("");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Receiving messages
        Thread receiveThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    byte[] buffer = new byte[256];
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                    try {
                        socket.receive(packet);
                        String received = new String(packet.getData(), 0, packet.getLength());
                        txtAreaDisplay.append(received + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        receiveThread.start();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    socket.leaveGroup(group);
                    socket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                } finally {
                    System.exit(0);
                }
            }
        });
    }

    public static void main(String[] args) {
        String clientId = JOptionPane.showInputDialog("Enter your Client ID:");
        if (clientId != null && !clientId.isEmpty()) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new DevRemoveClient_1(clientId);
                }
            });
        } else {
            System.out.println("No Client ID provided. Exiting...");
            System.exit(1);
        }
    }
}
