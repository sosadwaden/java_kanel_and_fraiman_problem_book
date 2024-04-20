package section6_simple_if_without_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Трехзначное положительное число называется «четно-красивым», если
    каждая из его цифр - четная. Напишите класс, который принимает с
    клавиатуры трехзначное число и проверяет, является ли оно «четно красивым».
    В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
    Обратите внимание: задание имеет решение с использованием одного
    оператора if и без составного условия!
 */
public class Task_6_9 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0 && number / 10 % 2 == 0 && number / 100 % 2 == 0) {
            System.out.println("Число является четно-красивым");
        } else {
            System.out.println("Число не является четно-красивым");
        }

        scanner.close();
    }
}
