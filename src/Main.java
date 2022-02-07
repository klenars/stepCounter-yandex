import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        

        while (true) {
            System.out.println("¬ам доступны следующие команды:\n" +
                    "1. ¬вести количество шагов за определЄнный день.\n" +
                    "2. Ќапечатать статистику за определЄнный мес€ц.\n" +
                    "3. »зменить цель по количеству шагов в день.\n" +
                    "0. ¬ыйти из приложени€.\n" +
                    "¬ведите номер команды:");

            int command = scanner.nextInt();

            if (command == 0) {
                break;
            }
            else if (command == 1) {
            	System.out.println("¬ведите номер мес€ца:");
            	int month = scanner.nextInt();
            	System.out.println("¬ведите день:");
            	int day = scanner.nextInt();
            	System.out.println("¬ведите количество шагов:");
            	int steps = scanner.nextInt();
            	stepTracker.setDaySteps(month, day, steps);         
            	System.out.println();
            }
            else if (command == 2) {
            	System.out.println("¬ведите номер мес€ца по которому нужна статистика:");
            	int month = scanner.nextInt();
            	stepTracker.printStatistic(month);
            	System.out.println();
            }
            else if (command == 3) {
            	System.out.println("¬ведите новую цель по шагам");
            	int point = scanner.nextInt();
            	stepTracker.setStepsPoint(point);
            	System.out.println();
            }
            else System.out.println("“акой команды нет. ¬ведите номер команды из списка\n");
            System.out.println();
        }
        scanner.close();
    }
}
