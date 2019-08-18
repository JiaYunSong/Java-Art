package in_out;

import java.io.*;
import javax.swing.*;

public class File_0x_IO {
	//可以继续包装
	//FileOutputStream->BufferedOutputStream->ObjectOutputStream
	//FileInputStream->BufferedInputStream->ObjectInputStream
	public static void main(String[] args){
		try {
			File f=new File(".\\in_using\\in_out");
			JFileChooser fc=new JFileChooser(f);
			fc.showOpenDialog(null);
			f=fc.getSelectedFile();
			String fi=f.toString();
			
			FileOutputStream fos=new FileOutputStream(fi);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			int x=10; double y=15.8; String str="abcd中国";
			oos.writeInt(x);
			oos.writeDouble(y);
			oos.writeUTF(str);
			
			Clock c1=new Clock(8,20,40);
			Clock c2=new Clock(9,7,8);
			oos.writeObject(c1);
			oos.writeObject(c2);
			
			oos.close();
			System.out.println(fi+"输出成功！");
			
			FileInputStream fis=new FileInputStream(fi);
			ObjectInputStream ois=new ObjectInputStream(fis);
			x=ois.readInt();
			y=ois.readDouble();
			str=ois.readUTF();
			System.out.println(x+" "+y+" "+str);
			
			Clock c3=(Clock)ois.readObject();
			Clock c4=(Clock)ois.readObject();
			c3.show();
			c4.show();
			ois.close();
			
		}
		catch(IOException e) {
			System.out.println("e");
		}
		catch(ClassNotFoundException a) {
			System.out.println("a");
		}
	}
}

class Clock implements Serializable{
	private static final long serialVersionUID = 20190707L;
	private int h,m;
	
	transient int s;//拒绝序列化的标识符
	
	public Clock()
	{
		h=0;m=0;s=0;
	}
	public Clock(int hh,int mm,int ss)
	{
		h=hh;m=mm;s=ss;
	}
	
	public void set(int hh,int mm, int ss)
	{
		h=hh;
		m=mm;
		s=ss;
	}
	public void set(Clock t)
	{
		h=t.h;
		m=t.m;
		s=t.s;
	}
	public void show()  //如果加上final则不能在继承时更改
	{
		System.out.println(h+":"+m+":"+s);
	}
}