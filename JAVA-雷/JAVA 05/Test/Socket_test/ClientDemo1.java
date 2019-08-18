package Socket_test;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class ClientDemo1 {
    public static void main(String args[]) throws IOException {
        Socket s1;
        InputStream s1In;
        DataInputStream dis;
        OutputStream s1out;
        DataOutputStream dos;
        s1 = new Socket("202.205.95.151", 9090);
        Scanner sc=new Scanner(System.in);
        String message="";
        message = sc.nextLine();
        s1out = s1.getOutputStream();
        dos = new DataOutputStream(s1out);
        dos.writeUTF(message);
        s1In = s1.getInputStream();
        dis = new DataInputStream(s1In);
        String st = dis.readUTF();
        System.out.println(st);
        s1out.close();
        s1In.close();
        s1.close();    
        sc.close();
    }
}
