package T03_Sharp;

public class Line_Round extends Line{
	double r,angle;
	public Line_Round(Point n1,double rr,double an) {
		a=new Point[1];
		a[0]=n1;
		r=rr;
		angle=an;
	}

	@Override
	public double Length() {
		double length=1;
		return length;
	}
	
}
