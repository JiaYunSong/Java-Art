package $02_DB;

import java.sql.*;

public class $02_JDBSelect {

	public static void main(String[] args) {
		try {
			String dbDriver="org.apache.derby.jdbc.EmbeddedDriver";
			Class.forName(dbDriver);
			System.out.println(dbDriver+"loaded.");
			String dbURL="jdbc:derby:E:\\1.��������\\1-��һ�¿γ�\\��-Java/cau;create=true";
			Connection con=DriverManager.getConnection(dbURL);
			System.out.println(dbURL+"connected.");
			
			Statement s=con.createStatement();
			String sqlSelect="SELECT * FROM student";
			ResultSet rs=s.executeQuery(sqlSelect);
			
			System.out.println("ѧ����student�е�ȫ����¼���£�");
			while(rs.next()) {
				System.out.print(rs.getString("sNo")+"\t");
				System.out.print(rs.getString("sName")+"\t");
				System.out.print(rs.getString("college")+"\t");
				System.out.println(rs.getString("class"));
			}
			
			sqlSelect="SELECT sNo,sName FROM student "+
					"WHERE class='����181'";
			rs=s.executeQuery(sqlSelect);
			System.out.println("ѧ����student�С�����181����ͬѧ��ѧ�ź�������");
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
