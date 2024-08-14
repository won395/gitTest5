package test;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.40.33:3306/blue_iscream";
        String user = "won";
        String pw = "1234";

        DatabaseManager dbManager = new DatabaseManager(url, user, pw);
        new DatabaseFrame(dbManager);
    }
}
