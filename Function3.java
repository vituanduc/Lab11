public class Function3 extends Function {

	@Override
	public double fnValue(double x) {
		double dx =Math.sqrt(Math.pow(x, 4) - Math.pow(x, 2) + 1);
		return dx;
	}
	
	public String toString () {
		return "Find the minimum distance between the function f(x)=x^2 and the point (0,1)\n"
				+ "This distance is describe by the function d(x)=sqrt(x^4-x^2+1)";
	}

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		double min = 1/Math.sqrt(2);
		double minD = Math.sqrt(Math.pow(min, 4) - Math.pow(min, 2) + 1);
		String str = String.format("The minimum distance is %.3f when x is %.3f or -%.3f", minD, min, min);
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