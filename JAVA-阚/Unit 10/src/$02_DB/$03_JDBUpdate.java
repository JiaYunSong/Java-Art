package $02_DB;

import java.sql.*;

public class $03_JDBUpdate {

	public static void main(String[] args) {
		try {
			String dbDriver="org.apache.derby.jdbc.EmbeddedDriver";
			Class.forName(dbDriver);
			System.out.println(dbDriver+"loaded.");
			String dbURL="jdbc:derby:E:\\1.课内资料\\1-大一下课程\\自-Java/cau;create=true";
			Connection con=DriverManager.getConnection(dbURL);
			System.out.println(dbURL+"connected.");
			
			Statement s=con.createStatement();
			String sqlUpdate="UPDATE student "+
					"SET sName='章同学' WHERE sNo='20180001'";
			s.executeUpdate(sqlUpdate);
			System.out.println("A student recond updated.");
			
			String sqlDelete="DELETE FROM student "+
					"WHERE sNo='20180002'";
			s.executeUpdate(sqlDelete);
			System.out.println("A student recond deleted.");
			s.close();
			con.close();
		}catch(ClassNotFoundException e) {e.printStackTrace();}
		catch (SQLException e) {e.printStackTrace();}
	}

}
