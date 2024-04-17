package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Назовем «сдвигом числа влево по кругу» операцию, при которой его
    цифры перемещаются на одну позицию влево (единицы - на место
    десятков, десятки - на место сотен, сотни - на место тысяч и так далее) -
    при этом первая цифра перемещается на место единиц.
    Например, из числа 1234 получается число 2341.
    Напишите класс, который принимает с клавиатуры трехзначное число
    и строит новое число, полученное «сдвигом влево по кругу».
 */
public class Task_4_20 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int leftPart = number / 100;
        int rightPart = number % 100;
        int newNumber = rightPart * 10 + leftPart;

        System.out.println(newNumber);
    }
}
