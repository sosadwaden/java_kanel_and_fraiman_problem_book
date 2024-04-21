package section_11_for_loop;

import java.util.Scanner;

public class Task_11_60 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(Math.pow(2, i) + " ");
        }

        scanner.close();
    }
}
