package nqsdata.beans;

import java.sql.*;
import nqsdata.NQSDatabean;

public class Databean extends NQSDatabean {
	
	/**
	 * �������ݿ⣬����con
	 * @author ������
	 */
	public Databean() {
		super();
	}
	
	//------function-all------
	/**
	 * ��"����"��ѯ:admin.jsp & ordin.jsp
	 * @author ������
	 * @param NationName
	 * @return { , , } || null
	 */
	public String[] queNationName(String NationName){
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
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
	 * ��"�����˿�"��ѯ:admin.jsp & ordin.jsp
	 * @author ������
	 * @param MenPop
	 * @return { , , } || null
	 */
	public String[] queMenPop(long MenPop){
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
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
	 * ��"Ů���˿�"��ѯ:admin.jsp & ordin.jsp
	 * @author ������
	 * @param WomPop
	 * @return { , , } || null
	 */
	public String[] queWomPop(long WomPop){
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
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
	 * �������:admin.jsp
	 * @author ������
	 * @param NationName
	 * @param MenPop
	 * @param WomPop
	 * @return "success"||"existing"
	 */
	public String addData(String NationName,long MenPop,long WomPop){
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
			if(sqlSelect(s, "Data", "NationName='"+NationName+"'", "MenPop,WomPop").next())
				return "existing";
			
			//����û�
			sqlInsert(s, "Data", "'"+NationName+"','"+MenPop+"','"+WomPop+"'");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	/**
	 * ͨ��������ɾ������:admin.jsp
	 * @author ������
	 * @param NationName
	 * @return "success"||"non-exist"
	 */
	public String delData(String NationName){
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
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
	 * ��������Ϊkey�޸�����:admin.jsp
	 * @author ������
	 * @param NationName
	 * @param MenPop
	 * @param WomPop
	 * @return "success"||"non-exist"
	 */
	public String revData(String NationName,long MenPop,long WomPop){
		try {
			Statement s=con.createStatement();
			
			//�����ݿ�ȶ���Ϣ
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
