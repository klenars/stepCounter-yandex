import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        

        while (true) {
            System.out.println("��� �������� ��������� �������:\n" +
                    "1. ������ ���������� ����� �� ����������� ����.\n" +
                    "2. ���������� ���������� �� ����������� �����.\n" +
                    "3. �������� ���� �� ���������� ����� � ����.\n" +
                    "0. ����� �� ����������.\n" +
                    "������� ����� �������:");

            int command = scanner.nextInt();

            if (command == 0) {
                break;
            }
            else if (command == 1) {
            	System.out.println("������� ����� ������:");
            	int month = scanner.nextInt();
            	System.out.println("������� ����:");
            	int day = scanner.nextInt();
            	System.out.println("������� ���������� �����:");
            	int steps = scanner.nextInt();
            	stepTracker.setDaySteps(month, day, steps);         
            	System.out.println();
            }
            else if (command == 2) {
            	System.out.println("������� ����� ������ �� �������� ����� ����������:");
            	int month = scanner.nextInt();
            	stepTracker.printStatistic(month);
            	System.out.println();
            }
            else if (command == 3) {
            	System.out.println("������� ����� ���� �� �����");
            	int point = scanner.nextInt();
            	stepTracker.setStepsPoint(point);
            	System.out.println();
            }
            else System.out.println("����� ������� ���. ������� ����� ������� �� ������\n");
            System.out.println();
        }
        scanner.close();
    }
}
