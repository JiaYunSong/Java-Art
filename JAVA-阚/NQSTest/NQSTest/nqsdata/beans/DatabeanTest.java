package nqsdata.beans;

public class DatabeanTest {

	public static void main(String[] args) {
		Databean db=new Databean();
		System.out.println(db.queNationName("����")[0]);
		System.out.println(db.queNationName("����")[1]);
		System.out.println(db.queNationName("����")[2]);
	}

}
