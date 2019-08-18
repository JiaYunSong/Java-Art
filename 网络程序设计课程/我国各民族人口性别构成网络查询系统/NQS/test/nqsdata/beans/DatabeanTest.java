package nqsdata.beans;

public class DatabeanTest {

	public static void main(String[] args) {
		Databean db=new Databean();
                System.out.println(db.addData("龙族", "666", "666"));
                System.out.println(db.addData("龙族", "666", "666"));
		System.out.println(db.queNationName("龙族")[0]);
		System.out.println(db.queNationName("龙族")[1]);
                System.out.println(db.revData("龙族", "555", "555"));
		System.out.println(db.queNationName("龙族")[2]);
                System.out.println(db.delData("龙族"));
                System.out.println(db.queNationName("龙族"));
                System.out.println(db.delData("龙族"));
	}

}
