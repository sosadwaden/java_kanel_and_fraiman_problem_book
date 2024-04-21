package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который:
    • сначала вводит с клавиатуры целое положительное двузначное число;
    • затем выводит на экран (в строку с пробелами) трехзначные целые
    положительные числа, в которых предварительно введенное
    двузначное число является «внутренней» частью (как, например, 23 для 123 или 623).
 */
public class Task_11_48 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 100; i < 1000; i++) {
            String strNum = Integer.toString(i);
            if (strNum.contains(Integer.toString(number))) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
