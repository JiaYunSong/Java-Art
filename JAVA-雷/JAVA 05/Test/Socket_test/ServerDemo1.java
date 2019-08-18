package Socket_test;
import java.net.*;
import java.io.*;
public class ServerDemo1 {

    public static void main(String args[]) {
        ServerSocket s = null;
        Socket s1;
        String sendString = "Access No.";
        String reciveString;
        OutputStream s1out;
        InputStream s1in;
        DataOutputStream dos;
        DataInputStream dis;

        try {
            s = new ServerSocket(9090);
            System.out.println("Server start in port 9000!");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        int count = 0;
        while (true) {
            try {
                s1 = s.accept();

                s1out = s1.getOutputStream();
                dos = new DataOutputStream(s1out);
                s1in  = s1.getInputStream();
                dis = new DataInputStream(s1in);
                
                reciveString = dis.readUTF();
                System.out.println(reciveString);

                count++;
                sendString = reciveString + " Access No." + count;
                dos.writeUTF(sendString);

                s1in.close();
                s1out.close();
                s1.close();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
