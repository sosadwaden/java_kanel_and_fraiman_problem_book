package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Назовем «большим обменом» операцию, при которой два числа «обмениваются»
    своими левыми цифрами.
    1. Напишите класс, который принимает с клавиатуры два трехзначных
       положительных числа и совершает над ними операцию «обмена».
    2. Возможно ли совершить операцию «большого обмена», если два
       числа имеют разное количество цифр? Обоснуйте свой ответ.
       Ответ: Возможно, но для этого необходимо знать циклы, но на момент
       Раздела 4 подразумевается (или так оно и есть?) что мы их не знаем.
 */
public class Task_4_26 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int leftNumber1 = number1 / 100;
        int leftNumber2 = number2 / 100;

        number1 = leftNumber2 * 100 + (number1 % 100);
        number2 = leftNumber1 * 100 + (number2 % 100);

        System.out.println(number1);
        System.out.println(number2);
    }
}
