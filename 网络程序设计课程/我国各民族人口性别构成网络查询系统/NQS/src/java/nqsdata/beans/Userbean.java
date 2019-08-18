package nqsdata.beans;

import java.sql.*;
import nqsdata.NQSDatabean;

public class Userbean extends NQSDatabean {
	
	/**
	 * 连接数据库，更新con
	 * @author 贾云嵩
	 */
	public Userbean() {
		super();
	}

	//------function-validate------
	/**
	 * 检验登入用户信息:validate.jsp
	 * @author 贾云嵩
	 * @param UserName
	 * @param PassWord
	 * @return "fail"||"admin"||"ordin"
	 */
	public String login(String UserName,String PassWord){
		if(con==null)
			return "loss";
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			ResultSet rs=sqlSelect(s, "Cust", "UserName='"+UserName+"'", "PassWord,UserType");
			if(rs.next())
				if(rs.getString("PassWord").replaceAll("\\s*", "").equals(PassWord))
					return rs.getString("UserType").replaceAll("\\s*", "");
			
		} catch (SQLException e) {
			return "loss";
		}
		return "fail";
	}
	
	//------function-admin------
	/**
	 * 添加用户:admin.jsp
	 * @author 贾云嵩
	 * @param UserName
	 * @param PassWord
	 * @param UserType
	 * @return "success"||"existing"
	 */
	public String addUser(String UserName,String PassWord,String UserType){
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			if(sqlSelect(s, "Cust", "UserName='"+UserName+"'", "PassWord,UserType").next())
				return "existing";
			
			//添加用户
			sqlInsert(s, "Cust", "'"+UserName+"','"+PassWord+"','"+UserType+"'");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	/**
	 * 删除用户:admin.jsp
	 * @author 贾云嵩
	 * @param UserName
	 * @return "success"||"non-existent"
	 */
	public String delUser(String UserName){
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			if(sqlSelect(s, "Cust", "UserName='"+UserName+"'", "PassWord,UserType").next()) {
				sqlDelete(s, "Cust", "UserName='"+UserName+"'");
				return "success";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "non-existent";
	}
	
	/**
	 * 查询用户密码:admin.jsp
	 * @author 贾云嵩
	 * @param UserName
	 * @return PassWord||"non-existent"
	 */
	public String getPassWord(String UserName){
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			ResultSet rs=sqlSelect(s, "Cust", "UserName='"+UserName+"'", "PassWord,UserType");
			if(rs.next())
				return rs.getString("PassWord").replaceAll("\\s*", "");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "non-existent";
	}
	
	/**
	 * 查询用户类型:admin.jsp
	 * @author 贾云嵩
	 * @param UserName
	 * @return UserType||"non-existent"
	 */
	public String getUserType(String UserName){
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			ResultSet rs=sqlSelect(s, "Cust", "UserName='"+UserName+"'", "PassWord,UserType");
			if(rs.next())
				return rs.getString("UserType").replaceAll("\\s*", "");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "non-existent";
	}
	
	/**
	 * 修改用户密码:admin.jsp
	 * @author 贾云嵩
	 * @param UserName
	 * @return "success"||"non-existent"
	 */
	public String revPassWord(String UserName,String PassWord){
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			ResultSet rs=sqlSelect(s, "Cust", "UserName='"+UserName+"'", "PassWord,UserType");
			if(rs.next()) {
				sqlUpdate(s, "Cust", "UserName='"+UserName+"'", "PassWord='"+PassWord+"'");
				return "success";
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "non-existent";
	}
	
	/**
	 * 修改用户类型:admin.jsp
	 * @author 贾云嵩
	 * @param UserName
	 * @return "success"||"non-existent"
	 */
	public String revUserType(String UserName,String UserType){
		try {
			Statement s=con.createStatement();
			
			//与数据库比对信息
			ResultSet rs=sqlSelect(s, "Cust", "UserName='"+UserName+"'", "PassWord,UserType");
			if(rs.next()){
				sqlUpdate(s, "Cust", "UserName='"+UserName+"'", "UserType='"+UserType+"'");
				return "success";
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "non-existent";
	}
	
}
