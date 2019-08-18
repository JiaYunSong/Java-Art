package $02_DB;

import java.sql.*;

public class $01_JDBCreate {

	public static void main(String[] args) {
		try {
			String dbDriver="org.apache.derby.jdbc.EmbeddedDriver";
			Class.forName(dbDriver);
			System.out.println(dbDriver+"loaded.");
			String dbURL="jdbc:derby:E:\\1.��������\\1-��һ�¿γ�\\��-Java/cau;create=true";
			Connection con=DriverManager.getConnection(dbURL);
			System.out.println(dbURL+"connected");
			
			Statement s=con.createStatement();
			String sqlCreateTable="CREATE TABLE student("+
				"sNo CHAR(10) PRIMARY KEY,sName CHAR(10),"+
				"college VARCHAR(20),class VARCHAR(20))";
			s.executeUpdate(sqlCreateTable);
			System.out.println("TABLE student created."); 
			
			String sqlInsert="INSERT INTO student VALUES("+
					"'20180001','��ͬѧ','�ŵ�ѧԺ','����181')";
			s.executeUpdate(sqlInsert);
			
			sqlInsert="INSERT INTO student VALUES("+
					"'20180002','��ͬѧ','�ŵ�ѧԺ','����181')";
			s.executeUpdate(sqlInsert);
			
			sqlInsert="INSERT INTO student VALUES("+
					"'20180003','��ͬѧ','�ŵ�ѧԺ','����182')";
			s.executeUpdate(sqlInsert);
			
			sqlInsert="INSERT INTO student VALUES("+
					"'20180004','��ͬѧ','�ŵ�ѧԺ','����182')";
			s.executeUpdate(sqlInsert);
			
			System.out.print("4 student records inserted.");
			s.close();
			con.close();
		}catch(ClassNotFoundException e) {e.printStackTrace();}
		catch (SQLException e) {e.printStackTrace();}
	}

}
