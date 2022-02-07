import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        

        while (true) {
            System.out.println("Вам доступны следующие команды:\n" +
                    "1. Ввести количество шагов за определённый день.\n" +
                    "2. Напечатать статистику за определённый месяц.\n" +
                    "3. Изменить цель по количеству шагов в день.\n" +
                    "0. Выйти из приложения.\n" +
                    "Введите номер команды:");

            int command = scanner.nextInt();

            if (command == 0) {
                break;
            }
            else if (command == 1) {
            	System.out.println("Введите номер месяца:");
            	int month = scanner.nextInt();
            	System.out.println("Введите день:");
            	int day = scanner.nextInt();
            	System.out.println("Введите количество шагов:");
            	int steps = scanner.nextInt();
            	stepTracker.setDaySteps(month, day, steps);         
            	System.out.println();
            }
            else if (command == 2) {
            	System.out.println("Введите номер месяца по которому нужна статистика:");
            	int month = scanner.nextInt();
            	stepTracker.printStatistic(month);
            	System.out.println();
            }
            else if (command == 3) {
            	System.out.println("Введите новую цель по шагам");
            	int point = scanner.nextInt();
            	stepTracker.setStepsPoint(point);
            	System.out.println();
            }
            else System.out.println("Такой команды нет. Введите номер команды из списка\n");
            System.out.println();
        }
        scanner.close();
    }
}
