package section_11_for_loop;

import java.util.Scanner;

public class Task_11_55 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int min = Math.min(N, M);
        int max = Math.max(N, M);

        for (int i = min + 1; i < max; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
