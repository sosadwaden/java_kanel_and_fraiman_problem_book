package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Назовем «линейным сдвигом числа влево» операцию, при которой его
    цифры перемещаются на одну позицию влево (единицы - на место
    десятков, десятки - на место сотен, сотни - на место тысяч и так далее) -
    при этом первая цифра удаляется из числа, а на место единиц записывается ноль.
    Например, из числа 1234 после такой операции получается число 2340.
    Напишите класс, который принимает с клавиатуры трехзначное число
    и строит новое число, полученное «линейным сдвигом влево».
 */
public class Task_4_18 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;
        int newNumber = secondDigit * 100 + thirdDigit * 10;

        System.out.println(newNumber);
        scanner.close();
    }
}
