
public class MonthData {
	private int numberOfMonth;
	private int[] monthSteps;
	
	public MonthData(int numberOfMonth) {
		this.numberOfMonth = numberOfMonth;
		monthSteps = new int[30];		
	}
	
	public String getMonthName() {
		String[] months = {"������", "�������", "����", "������", "���", "����",
						   "����", "������", "��������", "�������", "������", "�������"};
		
		return months[numberOfMonth - 1];
	}
	
	public void addSteps(int day, int steps) {
		if (steps < 0) {
			System.out.println("���������� ����� ������ ���� �� ������ ����!");
		}
		else {
			monthSteps[day - 1] = steps;
		}
	}
	
	public void stepsPerDay() {
		for (int i = 0; i < monthSteps.length; i++) {
			System.out.println((i + 1) + " ����: " + monthSteps[i]);
		}
	}
	
	public int sumStepsPerMonth() {
		int sum = 0;
		for (int steps : monthSteps) {
			sum += steps;
		}		
		return sum;
	}
	
	public void maxStepsInMonth() {
		int maxSteps = 0;
		for (int steps : monthSteps) {
			if (steps > maxSteps) {
				maxSteps = steps;
			}
		}
		System.out.println("������������ ���������� ����� ���������� �� ���� � ���� ������: " + maxSteps);
	}
	
	public void avgSteps() {
		System.out.println("������� ���������� ����� � ���� ������: " + (sumStepsPerMonth() / 30));
	}
	
	public void bestStepsLine() {
		int bestLine = 0;
		int countLine = 0;
		for (int i = 0; i < monthSteps.length; i++) {
			if (monthSteps[i] >= StepTracker.monthStepsPoint) {
				countLine++;
				if (countLine > bestLine) {
					bestLine = countLine;
				}
			}
			else {
				countLine = 0;
			}
		}
		System.out.println("������ ����� ���� �� ���������� ����� �� �����: " + bestLine);
	}
}






