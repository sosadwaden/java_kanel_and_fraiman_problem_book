package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Четырехзначное число называется «парно-симметричным», если две
    его первых цифры и две его последних цифры образуют одинаковые числа (например - 5252).
    Напишите класс, который принимает с клавиатуры четырехзначное
    положительное число и определяет, является ли оно «парно-симметричным».
    В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
 */
public class Task_8_19 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int leftPart = number / 100;
        int rightPart = number % 100;

        if (leftPart == rightPart) {
            System.out.println("Число парно-симметричное");
        } else {
            System.out.println("Нет");
        }

        scanner.close();
    }
}
