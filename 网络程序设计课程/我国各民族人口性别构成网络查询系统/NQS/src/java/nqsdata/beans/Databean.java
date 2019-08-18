package nqsdata.beans;

import java.sql.*;
import nqsdata.NQSDatabean;

public class Databean extends NQSDatabean {
	
	/**
	 * 连接数据库，更新con
	 * @author 贾云嵩
	 */
	public Databean() {
		super();
	}
	
	//------function-all------
	/**
	 * 按"民族"查询:admin.jsp & ordin.jsp
	 * @author 贾云嵩
	 * @param NationName
	 * @return { , , } || null
	 */
	public String[] queNationName(String NationName){
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			ResultSet rs=sqlSelect(s, "Data", "NationName='"+NationName+"'", "NationName,MenPop,WomPop");
			if(rs.next()) {
				String[] data= {"NationName","MenPop","WomPop"};
				data[0]=rs.getString("NationName").replaceAll("\\s*", "");
				data[1]=rs.getString("MenPop").replaceAll("\\s*", "");
				data[2]=rs.getString("WomPop").replaceAll("\\s*", "");
				return data;
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 按"男性人口"查询:admin.jsp & ordin.jsp
	 * @author 贾云嵩
	 * @param MenPop
	 * @return { , , } || null
	 */
	public String[] queMenPop(String MenPop){
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			ResultSet rs=sqlSelect(s, "Data", "MenPop='"+MenPop+"'", "NationName,MenPop,WomPop");
			if(rs.next()) {
				String[] data= {"NationName","MenPop","WomPop"};
				data[0]=rs.getString("NationName").replaceAll("\\s*", "");
				data[1]=rs.getString("MenPop").replaceAll("\\s*", "");
				data[2]=rs.getString("WomPop").replaceAll("\\s*", "");
				return data;
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 按"女性人口"查询:admin.jsp & ordin.jsp
	 * @author 贾云嵩
	 * @param WomPop
	 * @return { , , } || null
	 */
	public String[] queWomPop(String WomPop){
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			ResultSet rs=sqlSelect(s, "Data", "WomPop='"+WomPop+"'", "NationName,MenPop,WomPop");
			if(rs.next()) {
				String[] data= {"NationName","MenPop","WomPop"};
				data[0]=rs.getString("NationName").replaceAll("\\s*", "");
				data[1]=rs.getString("MenPop").replaceAll("\\s*", "");
				data[2]=rs.getString("WomPop").replaceAll("\\s*", "");
				return data;
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//------function-admin------
	/**
	 * 添加数据:admin.jsp
	 * @author 贾云嵩
	 * @param NationName
	 * @param MenPop
	 * @param WomPop
	 * @return "success"||"existing"
	 */
	public String addData(String NationName,String MenPop,String WomPop){
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			if(sqlSelect(s, "Data", "NationName='"+NationName+"'", "MenPop,WomPop").next())
				return "existing";
			
			//添加用户
			sqlInsert(s, "Data", "'"+NationName+"','"+MenPop+"','"+WomPop+"'");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	/**
	 * 通过民族名删除数据:admin.jsp
	 * @author 贾云嵩
	 * @param NationName
	 * @return "success"||"non-exist"
	 */
	public String delData(String NationName){
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			if(sqlSelect(s, "Data", "NationName='"+NationName+"'", "MenPop,WomPop").next()) {
				sqlDelete(s, "Data", "NationName='"+NationName+"'");
				return "success";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "non-existent";
	}
	
	/**
	 * 以民族名为key修改数据:admin.jsp
	 * @author 贾云嵩
	 * @param NationName
	 * @param MenPop
	 * @param WomPop
	 * @return "success"||"non-exist"
	 */
	public String revData(String NationName,String MenPop,String WomPop){
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			ResultSet rs=sqlSelect(s, "Data", "NationName='"+NationName+"'", "MenPop,WomPop");
			if(rs.next()){
				sqlUpdate(s, "Data", "NationName='"+NationName+"'", "MenPop='"+MenPop+"',WomPop='"+WomPop+"'");
				return "success";
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "non-existent";
	}
	
}
