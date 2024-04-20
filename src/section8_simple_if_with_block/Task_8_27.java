package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает в качестве параметров два целых
    положительных числа и выводит на экран с дополнительным сообщением
    то из них, у которого наибольшая последняя цифра (число единиц).
    Если такого числа нет, класс должен вывести на экран соответствующее сообщение.
 */
public class Task_8_27 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int aLastdigit = a % 10;
        int bLastDigit = b % 10;

        if (aLastdigit > bLastDigit) {
            System.out.println(a);
        }
        if (bLastDigit > aLastdigit) {
            System.out.println(b);
        }
        if (aLastdigit == bLastDigit) {
            System.out.println("Нет результата");
        }

        scanner.close();
    }
}
