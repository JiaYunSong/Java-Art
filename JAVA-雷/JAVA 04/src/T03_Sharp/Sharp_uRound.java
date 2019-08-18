package T03_Sharp;

public class Sharp_uRound extends Sharp{
	double d,e;
	public Sharp_uRound(double d,double e,Point a) {
		this.a=new Point[1];
		this.a[0]=a;
		this.d = d;
		this.e = e;
	}

	@Override
	public double Length() {
		return 0;
	}

	@Override
	public double Area() {
		return 0;
	}

}
