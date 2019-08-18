package nqsdata;

import java.sql.*;

/**
 * NQSDatabean
 * -整合了SQL语言和Databean与Userbean的交集部分
 * -可以重新生成NQSData
 * @author 贾云嵩
 */
public class NQSDatabean {
	/**
	 * Java DB的JDBC驱动程序类名
	 * @author 贾云嵩
	 */
	protected String dbDriver="org.apache.derby.jdbc.EmbeddedDriver";
	/**
	 * NQSData的路径
	 * @author 贾云嵩
	 */
	protected String URL="E:\\1.课内资料\\1-大一下课程\\主-JAVA小学期\\03-实验作业\\网络程序设计课程考核\\我国各民族人口性别构成网络查询系统";
	
	protected Connection con;
	
	protected String sqlCreateTable;	//字符串-建立表用
//	String sqlInsert;		//字符串-插入数据用
//	String sqlSelect;		//字符串-查询数据用
//	String sqlUpdate;		//字符串-更新数据用
//	String sqlDelete;		//字符串-删除数据用
	
	/**
	 * sqlInsert
	 * @author 贾云嵩
	 * @param s —— Statement
	 * @param table —— 表名
	 * @param data —— 数据，格式为'data1','data2'...
	 * @throws SQLException
	 */
	protected void sqlInsert(Statement s,String table, String data) throws SQLException {
		String sqlInsert="INSERT INTO "+table+" VALUES("+data+")";
		s.executeUpdate(sqlInsert);
	}
	
	/**
	 * sqlSelete:查询表中所有信息
	 * @author 贾云嵩
	 * @param s —— Statement
	 * @param table —— 表名
	 * @return ResultSet
	 * @throws SQLException
	 */
	protected ResultSet sqlSelect(Statement s,String table) throws SQLException {
		return s.executeQuery("SELECT * FROM "+table);
	}
	
	/**
	 * sqlSelete:查询表中指定信息
	 * @author 贾云嵩
	 * @param s —— Statement
	 * @param table —— 表名
	 * @param key —— 关键词，格式为：column='value'
	 * @param data —— 数据，格式为：column1,column2...
	 * @return ResultSet
	 * @throws SQLException
	 */
	protected ResultSet sqlSelect(Statement s,String table, String key, String data) throws SQLException {
		String sqlSelect="SELECT "+data+" FROM "+table+" WHERE "+key;
		return s.executeQuery(sqlSelect);
	}
	
	/**
	 * sqlUpdata
	 * @author 贾云嵩
	 * @param s —— Statement
	 * @param table —— 表名
	 * @param key —— 关键词，格式为：column='value'
	 * @param data —— 数据，格式为：column1='value1',column2='value2'...
	 * @throws SQLException
	 */
	protected void sqlUpdate(Statement s,String table, String key, String data) throws SQLException {
		String sqlUpdate="UPDATE "+table+" SET "+data+" WHERE "+key;
		s.executeUpdate(sqlUpdate);
	}
	
	/**
	 * sqlDelete
	 * @author 贾云嵩
	 * @param s —— Statement
	 * @param table —— 表名
	 * @param key —— 关键词，格式为：column='value'
	 * @throws SQLException
	 */
	protected void sqlDelete(Statement s,String table, String key) throws SQLException {
		String sqlDelete="DELETE FROM "+table+" WHERE "+key;
		s.executeUpdate(sqlDelete);
	}
	
	/**
	 * 连接数据库，更新con
	 * @author 贾云嵩
	 */
	public NQSDatabean() {
		try {
			//加载Java DB驱动
			Class.forName(dbDriver);
			System.out.println(dbDriver+" loaded.");
			
			//建立数据库连接，如果不存在，则新建数据库
			con=DriverManager.getConnection("jdbc:derby:"+URL+"/NQSData;create=true");
			System.out.println("NQSData connected.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 还原数据库信息至原始数据
	 * @author 贾云嵩
	 */
	final public void setNQSData() {
		if(con==null)
			return;
		try {
			Statement s=con.createStatement();
			
			//建立User Table及内部结构
			sqlCreateTable=
				"CREATE TABLE Cust("+
					"UserName CHAR(20) PRIMARY KEY,"+
					"PassWord CHAR(20),"+
					"UserType CHAR(20))";
			s.executeUpdate(sqlCreateTable);
			System.out.println("TABLE Cust created.");
			{
				//默认管理员
				sqlInsert(s, "Cust", "'CIEE','123456','admin'");
				
				//默认普通用户
				sqlInsert(s, "Cust", "'RSMX','666666','ordin'");
			}
			
			/**
			 * 建立Data Table及内部结构
			 */
			sqlCreateTable=
				"CREATE TABLE Data("+
					"NationName CHAR(20) PRIMARY KEY,"+
					"MenPop CHAR(20),"+
					"WomPop CHAR(20))";
			s.executeUpdate(sqlCreateTable);
			System.out.println("TABLE Data created.");
			{
				//默认数据
				sqlInsert(s, "Data", "'汉族','625032848','650481765'");
				sqlInsert(s, "Data", "'壮族','8689488','8236893'");
				sqlInsert(s, "Data", "'满族','5401812','4986146'");
				sqlInsert(s, "Data", "'回族','5373741','5212346'");
				sqlInsert(s, "Data", "'维吾尔族','5097594','4971752'");
				sqlInsert(s, "Data", "'苗族','4870328','4555679'");
				sqlInsert(s, "Data", "'彝族','4456382','4258011'");
				sqlInsert(s, "Data", "'土家族','4307260','4046652'");
				sqlInsert(s, "Data", "'藏族','3155625','3126562'");
				sqlInsert(s, "Data", "'蒙古族','2999520','2982320'");
				sqlInsert(s, "Data", "'侗族','1511959','1368015'");
			}
			
			System.out.print("NQSData Java DB created.");
			s.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}