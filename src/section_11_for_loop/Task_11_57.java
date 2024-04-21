package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число а,
    а затем выводит на экран серию из 15 целых чисел, начиная с 1 так, что
    каждое следующее число в серии на а больше предыдущего числа (между
    числами должен быть знак#): 1#1 + a#l +2а#...
 */
public class Task_11_57 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int currentNumber = 1;

        for (int i = 1; i <= 15; i++) {
            System.out.print(currentNumber);
            if (i < 15) {
                System.out.print("#");
            }
            currentNumber += number;
        }

        scanner.close();
    }
}
