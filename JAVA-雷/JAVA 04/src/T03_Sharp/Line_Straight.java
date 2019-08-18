package T03_Sharp;

public class Line_Straight extends Line{
	public Line_Straight(Point n1,Point n2) {
		a=new Point[2];
		a[0]=n1;
		a[1]=n2;
	}
	
	@Override
	public double Length() {
		double length=1;
		return length;
	}

}
