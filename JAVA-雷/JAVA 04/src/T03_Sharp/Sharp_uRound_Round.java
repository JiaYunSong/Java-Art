package T03_Sharp;

public class Sharp_uRound_Round extends Sharp_uRound {
	double r;
	public Sharp_uRound_Round(double r, Point a) {
		super(r, r, a);
		this.r=r;
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
