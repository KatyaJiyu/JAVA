import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        System.out.println("Введите числа (введите 0, чтобы завершить ввод):");

        while (true) {
            double number = scanner.nextDouble();

            if (number == 0) {
                break;
            }

            sum += number;
            count++;
        }

        if (count > 0) {
            double average = sum / count;

            System.out.println("Среднее арифметическое введенных чисел: " + average);
        } else {
            System.out.println("Вы не ввели ни одного числа.");
        }

        scanner.close();
    }
}