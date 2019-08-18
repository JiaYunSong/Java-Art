package $02_DB;

import java.sql.*;

public class $02_JDBSelect {

	public static void main(String[] args) {
		try {
			String dbDriver="org.apache.derby.jdbc.EmbeddedDriver";
			Class.forName(dbDriver);
			System.out.println(dbDriver+"loaded.");
			String dbURL="jdbc:derby:E:\\1.课内资料\\1-大一下课程\\自-Java/cau;create=true";
			Connection con=DriverManager.getConnection(dbURL);
			System.out.println(dbURL+"connected.");
			
			Statement s=con.createStatement();
			String sqlSelect="SELECT * FROM student";
			ResultSet rs=s.executeQuery(sqlSelect);
			
			System.out.println("学生表student中的全部记录如下：");
			while(rs.next()) {
				System.out.print(rs.getString("sNo")+"\t");
				System.out.print(rs.getString("sName")+"\t");
				System.out.print(rs.getString("college")+"\t");
				System.out.println(rs.getString("class"));
			}
			
			sqlSelect="SELECT sNo,sName FROM student "+
					"WHERE class='计算181'";
			rs=s.executeQuery(sqlSelect);
			System.out.println("学生表student中“计算181”班同学的学号和姓名：");
			while(rs.next()) {
				System.out.print(rs.getString("sNo")+"\t");
				System.out.println(rs.getString("sName"));
			}
			s.close();
			con.close();
		}catch(ClassNotFoundException e) {e.printStackTrace();}
		catch (SQLException e) {e.printStackTrace();}
	}

}
