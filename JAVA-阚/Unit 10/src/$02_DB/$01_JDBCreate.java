package $02_DB;

import java.sql.*;

public class $01_JDBCreate {

	public static void main(String[] args) {
		try {
			String dbDriver="org.apache.derby.jdbc.EmbeddedDriver";
			Class.forName(dbDriver);
			System.out.println(dbDriver+"loaded.");
			String dbURL="jdbc:derby:E:\\1.课内资料\\1-大一下课程\\自-Java/cau;create=true";
			Connection con=DriverManager.getConnection(dbURL);
			System.out.println(dbURL+"connected");
			
			Statement s=con.createStatement();
			String sqlCreateTable="CREATE TABLE student("+
				"sNo CHAR(10) PRIMARY KEY,sName CHAR(10),"+
				"college VARCHAR(20),class VARCHAR(20))";
			s.executeUpdate(sqlCreateTable);
			System.out.println("TABLE student created."); 
			
			String sqlInsert="INSERT INTO student VALUES("+
					"'20180001','张同学','信电学院','计算181')";
			s.executeUpdate(sqlInsert);
			
			sqlInsert="INSERT INTO student VALUES("+
					"'20180002','李同学','信电学院','计算181')";
			s.executeUpdate(sqlInsert);
			
			sqlInsert="INSERT INTO student VALUES("+
					"'20180003','王同学','信电学院','计算182')";
			s.executeUpdate(sqlInsert);
			
			sqlInsert="INSERT INTO student VALUES("+
					"'20180004','赵同学','信电学院','计算182')";
			s.executeUpdate(sqlInsert);
			
			System.out.print("4 student records inserted.");
			s.close();
			con.close();
		}catch(ClassNotFoundException e) {e.printStackTrace();}
		catch (SQLException e) {e.printStackTrace();}
	}

}
