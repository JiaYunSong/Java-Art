package nqsdata.beans;

public class UserbeanTest {

	public static void main(String[] args) {
		Userbean ub=new Userbean();
		System.out.println(ub.login("RSMX", "666666"));
		System.out.println(ub.getPassWord("RSMX"));
		System.out.println(ub.getUserType("RSMX"));
	}

}
