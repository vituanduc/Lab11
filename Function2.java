




public class Function2 extends Function {

	@Override
	public double fnValue(double x) {
		double qx = x/3 + 2*Math.sqrt(25-8*x+x*x);
		return qx;
	}
	
	public String toString() {
		return "Minimize the distance a dog will run and swim to retrieve a ball in the ocean";
	}

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		double d = (280-Math.sqrt(1260))/70;
		double t = d/3+ 2*Math.sqrt(25-8*d+d*d);
		String str = String.format("the minimum amount of time is %.1f seconds, and the dog has to run %.1f metters", t,d);
		return str;
	}

	@Override
	public double getXVal(double x) {
		return x;
	}

	@Override
	public double getYVal(double x) {
		return fnValue(x);
	}

	@Override
	public double getZVal(double x) {
		return -1.0;
	}

}