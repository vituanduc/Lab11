



public class Function1 extends Function {

	@Override
	public double fnValue(double x) {
		double result;
		result = 0.8*x*x*Math.PI+800/x;
		if (x<=0.0) 
			return Double.MAX_VALUE;
		else
			return result;
	}
	
	public String toString() {
		return "Minimize the cost of a can that will hold 2 liters of liquid";
	}

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		double r = Math.cbrt(500/Math.PI);
		double C=0.8*Math.PI*r*r+800/r;
		double h = 2000/(Math.PI*r*r);
		String str = String.format("Minimum cost is  $%.2f with height =  %.2fcm and radius = %.2f", C,h,r);
		return str;
	}

	@Override
	public double getXVal(double x) {
		
		return x;
	}

	@Override
	public double getYVal(double x) {
		double y = fnValue(x);
		return y;
	}

	@Override
	public double getZVal(double x) {
		return -1.0;
	}

}