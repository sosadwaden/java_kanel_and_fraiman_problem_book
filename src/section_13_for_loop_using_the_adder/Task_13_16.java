package section_13_for_loop_using_the_adder;

import java.util.Scanner;

public class Task_13_16 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double a;
        double sum = 0;

        for (int i = 1; i <= number; i++) {
            a = Math.sqrt(2 * i - 1);
            sum += a;
        }

        System.out.print(sum);
        scanner.close();
    }
}
