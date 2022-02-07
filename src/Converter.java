public class Converter {
	
	private int stepLength;
	private int stepCal;
	
	public Converter(int stepLength, int stepCall) {
		this.stepLength = stepLength;
		this.stepCal = stepCall;
	}
	
	public double getDistance(int steps) {		
		return steps * stepLength / 100_000.0;
	}
	
	public int getKcal(int steps) {
		return steps * stepCal / 1_000;
	}
}
