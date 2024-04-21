package section_13_for_loop_using_the_adder;

import java.util.Scanner;

public class Task_13_8 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                count++;
            }
        }

        if (number % sum == 0 && sum % count == 0) {
            System.out.println("Число " + number + " является дважды делимым.");
        } else {
            System.out.println("Число " + number + " не является дважды делимым.");
        }

        scanner.close();
    }
}
