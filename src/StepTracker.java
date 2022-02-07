import java.util.HashMap;

public class StepTracker {
	static int monthStepsPoint = 10000;
	HashMap<Integer, MonthData> monthToData = new HashMap<>();
	Converter converter = new Converter(75, 50);
	
	public StepTracker() {
		for (int i = 1; i <= 12; i++) {
			monthToData.put(i, new MonthData(i));
		}
	}
	
	public void setDaySteps (int month, int day, int steps) {
		monthToData.get(month).addSteps(day, steps);
	}
	
	public void setStepsPoint(int point) {
		if (point < 0) {
			System.out.println("���������� ����� ������ ���� �� ������ ����!");
		}
		else {
			monthStepsPoint = point;
		}
	}
	
	public void printStatistic(int month) {
		MonthData monthData = monthToData.get(month);
		monthData.stepsPerDay();
		int sumSteps = monthData.sumStepsPerMonth();
		System.out.println("����� ����� � ������ " + monthData.getMonthName() + ": " + sumSteps);
		monthData.maxStepsInMonth();
		monthData.avgSteps();
		System.out.println("����� ���������� ���������: " + converter.getDistance(sumSteps) + " ��.");
		System.out.println("����� ���������: " + converter.getKcal(sumSteps) + " �����������.");
		monthData.bestStepsLine();		
	}
}
	
	
