package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых числа.
    Класс должен определить, мoгут ли эти числа быть числителем (первое) и знаменателем (второе) дроби.
    В случае если числа выражают неправильную дробь, следует вывести
    на экран соответствующую ей правильную сложную дробь, а во всех
    остальных случаях - текстовое сообщение Подсчет не производится.
    Например, если с клавиатуры введены значения 7 и 12 - на экран выводится
    сообщение Подсчет не производится; если введены 12 и 7, то на экран выводится 1 5/7.
 */
public class Task_8_30 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b != 0 && a >= b) {
            int cel = a / b;
            a = a % b;
            if (a == 0) {
                System.out.println(cel);
            } else {
                System.out.printf("%d %d/%d%n", cel, a, b);
            }
        }
        else {
            System.out.println("Подсчёт не производится");
        }

        scanner.close();
    }
}
