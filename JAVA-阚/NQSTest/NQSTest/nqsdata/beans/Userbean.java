package nqsdata.beans;

import java.sql.*;
import nqsdata.NQSDatabean;

public class Userbean extends NQSDatabean {
	
	/**
	 * �������ݿ⣬����con
	 * @author ������
	 */
	public Userbean() {
		super();
	}

	//------function-validate------
	/**
	 * ��������û���Ϣ:validate.jsp
	 * @author ������
	 * @param UserName
	 * @param PassWord
	 * @return "fail"||"admin"||"ordin"
	 */
	public String login(String UserName,String PassWord){
		if(con==null)
			return "fail";
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
			ResultSet rs=sqlSelect(s, "Cust", "UserName='"+UserName+"'", "PassWord,UserType");
			if(rs.next())
				if(rs.getString("PassWord").replaceAll("\\s*", "").equals(PassWord))
					return rs.getString("UserType").replaceAll("\\s*", "");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "fail";
	}
	
	//------function-admin------
	/**
	 * ����û�:admin.jsp
	 * @author ������
	 * @param UserName
	 * @param PassWord
	 * @param UserType
	 * @return "success"||"existing"
	 */
	public String addUser(String UserName,String PassWord,String UserType){
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
			if(sqlSelect(s, "Cust", "UserName='"+UserName+"'", "PassWord,UserType").next())
				return "existing";
			
			//����û�
			sqlInsert(s, "Cust", "'"+UserName+"','"+PassWord+"','"+UserType+"'");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	/**
	 * ɾ���û�:admin.jsp
	 * @author ������
	 * @param UserName
	 * @return "success"||"non-existent"
	 */
	public String delUser(String UserName){
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
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
	 * ��ѯ�û�����:admin.jsp
	 * @author ������
	 * @param UserName
	 * @return PassWord||"non-existent"
	 */
	public String getPassWord(String UserName){
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
			ResultSet rs=sqlSelect(s, "Cust", "UserName='"+UserName+"'", "PassWord,UserType");
			if(rs.next())
				return rs.getString("PassWord").replaceAll("\\s*", "");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "non-existent";
	}
	
	/**
	 * ��ѯ�û�����:admin.jsp
	 * @author ������
	 * @param UserName
	 * @return UserType||"non-existent"
	 */
	public String getUserType(String UserName){
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
			ResultSet rs=sqlSelect(s, "Cust", "UserName='"+UserName+"'", "PassWord,UserType");
			if(rs.next())
				return rs.getString("UserType").replaceAll("\\s*", "");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "non-existent";
	}
	
	/**
	 * �޸��û�����:admin.jsp
	 * @author ������
	 * @param UserName
	 * @return "success"||"non-existent"
	 */
	public String revPassWord(String UserName,String PassWord){
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
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
	 * �޸��û�����:admin.jsp
	 * @author ������
	 * @param UserName
	 * @return "success"||"non-existent"
	 */
	public String revUserType(String UserName,String UserType){
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
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
