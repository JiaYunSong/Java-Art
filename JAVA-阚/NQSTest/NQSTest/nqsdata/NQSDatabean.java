package nqsdata;

import java.sql.*;

public class NQSDatabean {
	/**
	 * Java DB��JDBC������������
	 * @author ������
	 */
	protected String dbDriver="org.apache.derby.jdbc.EmbeddedDriver";
	/**
	 * NQSData��·��
	 * @author ������
	 */
	protected String URL="E:\\1.��������\\1-��һ�¿γ�\\��-JAVAСѧ��\\03-ʵ����ҵ\\���������ƿγ̿���\\�ҹ��������˿��Ա𹹳������ѯϵͳ";
	
	protected Connection con;
	
	protected String sqlCreateTable;	//�ַ���-��������
//	protected String sqlSelect;		//�ַ���-��ѯ������
//	protected String sqlUpdate;		//�ַ���-����������
//	protected String sqlDelete;		//�ַ���-ɾ��������
	
	/**
	 * sqlInsert
	 * @author ������
	 * @param s ���� Statement
	 * @param table ���� ����
	 * @param data ���� ���ݣ���ʽΪ'data1','data2'...
	 * @throws SQLException
	 */
	protected void sqlInsert(Statement s,String table, String data) throws SQLException {
		String sqlInsert="INSERT INTO "+table+" VALUES("+data+")";
		s.executeUpdate(sqlInsert);
	}
	
	/**
	 * sqlSelete:��ѯ����������Ϣ
	 * @author ������
	 * @param s ���� Statement
	 * @param table ���� ����
	 * @return ResultSet
	 * @throws SQLException
	 */
	protected ResultSet sqlSelect(Statement s,String table) throws SQLException {
		return s.executeQuery("SELECT * FROM "+table);
	}
	
	/**
	 * sqlSelete:��ѯ����ָ����Ϣ
	 * @author ������
	 * @param s ���� Statement
	 * @param table ���� ����
	 * @param key ���� �ؼ��ʣ���ʽΪ��column='value'
	 * @param data ���� ���ݣ���ʽΪ��column1,column2...
	 * @return ResultSet
	 * @throws SQLException
	 */
	protected ResultSet sqlSelect(Statement s,String table, String key, String data) throws SQLException {
		String sqlSelect="SELECT "+data+" FROM "+table+" WHERE "+key;
		return s.executeQuery(sqlSelect);
	}
	
	/**
	 * sqlUpdata
	 * @author ������
	 * @param s ���� Statement
	 * @param table ���� ����
	 * @param key ���� �ؼ��ʣ���ʽΪ��column='value'
	 * @param data ���� ���ݣ���ʽΪ��column1='value1',column2='value2'...
	 * @throws SQLException
	 */
	protected void sqlUpdate(Statement s,String table, String key, String data) throws SQLException {
		String sqlUpdate="UPDATE "+table+" SET "+data+" WHERE "+key;
		s.executeUpdate(sqlUpdate);
	}
	
	/**
	 * sqlDelete
	 * @author ������
	 * @param s ���� Statement
	 * @param table ���� ����
	 * @param key ���� �ؼ��ʣ���ʽΪ��column='value'
	 * @throws SQLException
	 */
	protected void sqlDelete(Statement s,String table, String key) throws SQLException {
		String sqlDelete="DELETE FROM "+table+" WHERE "+key;
		s.executeUpdate(sqlDelete);
	}
	
	/**
	 * �������ݿ⣬����con
	 * @author ������
	 */
	public NQSDatabean() {
		try {
			//����Java DB����
			Class.forName(dbDriver);
			System.out.println(dbDriver+" loaded.");
			
			//�������ݿ����ӣ���������ڣ����½����ݿ�
			con=DriverManager.getConnection("jdbc:derby:"+URL+"/NQSData;create=true");
			System.out.println("NQSData connected.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ԭ���ݿ���Ϣ��ԭʼ����
	 * @author ������
	 */
	final public void setNQSData() {
		if(con==null)
			return;
		try {
			Statement s=con.createStatement();
			
			//����User Table���ڲ��ṹ
			sqlCreateTable=
				"CREATE TABLE Cust("+
					"UserName CHAR(20) PRIMARY KEY,"+
					"PassWord CHAR(20),"+
					"UserType CHAR(20))";
			s.executeUpdate(sqlCreateTable);
			System.out.println("TABLE Cust created.");
			{
				//Ĭ�Ϲ���Ա
				sqlInsert(s, "Cust", "'CIEE','123456','admin'");
				
				//Ĭ����ͨ�û�
				sqlInsert(s, "Cust", "'RSMX','666666','ordin'");
			}
			
			/**
			 * ����Data Table���ڲ��ṹ
			 */
			sqlCreateTable=
				"CREATE TABLE Data("+
					"NationName CHAR(20) PRIMARY KEY,"+
					"MenPop CHAR(20),"+
					"WomPop CHAR(20))";
			s.executeUpdate(sqlCreateTable);
			System.out.println("TABLE Data created.");
			{
				//Ĭ������
				sqlInsert(s, "Data", "'����','625032848','650481765'");
				sqlInsert(s, "Data", "'׳��','8689488','8236893'");
				sqlInsert(s, "Data", "'����','5401812','4986146'");
				sqlInsert(s, "Data", "'����','5373741','5212346'");
				sqlInsert(s, "Data", "'ά�����','5097594','4971752'");
				sqlInsert(s, "Data", "'����','4870328','4555679'");
				sqlInsert(s, "Data", "'����','4456382','4258011'");
				sqlInsert(s, "Data", "'������','4307260','4046652'");
				sqlInsert(s, "Data", "'����','3155625','3126562'");
				sqlInsert(s, "Data", "'�ɹ���','2999520','2982320'");
				sqlInsert(s, "Data", "'����','1511959','1368015'");
			}
			
			System.out.print("NQSData Java DB created.");
			s.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}