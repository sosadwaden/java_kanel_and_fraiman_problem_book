package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который:
    • сначала вводит с клавиатуры целое положительное двузначное число;
    • затем выводит на экран (в строку с пробелами) четырехзначные
    целые положительные числа, в которых предварительно введенное
    двузначное число является «внутренней» частью (как, например,
    23 для 1523, или 6237, или 4230).
 */
public class Task_11_49 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1000; i < 10_000; i++) {
            String strNum = Integer.toString(i);
            if (strNum.contains(Integer.toString(number))) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
