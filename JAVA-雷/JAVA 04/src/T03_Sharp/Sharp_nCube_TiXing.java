package T03_Sharp;

public class Sharp_nCube_TiXing extends Sharp_nCube {
	double e,b,c,d,h;
	public Sharp_nCube_TiXing(double e, double b, double c, double d) {
		super();
		this.a=new Point[4];
		this.e = e;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public Sharp_nCube_TiXing(double b, double c, double h) {
		super();
		this.b = b;
		this.c = c;
		this.h = h;
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
