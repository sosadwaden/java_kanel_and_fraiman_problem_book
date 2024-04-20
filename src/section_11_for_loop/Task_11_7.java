package section_11_for_loop;

import java.util.Scanner;

public class Task_11_7 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int min = Math.min(firstNumber, secondNumber);
        int max = Math.max(firstNumber, secondNumber);

        System.out.println("20 случайных чисел в диапазоне от " + min + " до " + max + ":");

        for (int i = 0; i < 20; i++) {
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(randomNumber + " ");
        }

        scanner.close();
    }
}
