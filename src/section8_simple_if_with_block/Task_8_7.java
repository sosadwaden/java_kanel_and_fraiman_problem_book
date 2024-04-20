package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых положительных
    числа и затем выводит на экран:
    • разницу между первым и вторым, — в случае если первое больше второго;
    • разницу между вторым и первым, — в случае если второе больше первого;
    • произведение введенных значений, — в случае если они равны.
 */
public class Task_8_7 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a - b);
        }

        if (a < b) {
            System.out.println(b - a);
        }

        if (a == b) {
            System.out.println(a * b);
        }

        scanner.close();
    }
}
