package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых положительных
    числа, которые должны представлять числитель (первое) и знаменатель (второе) дроби.
    В случае если введенные значения образуют правильную дробь, следует
    вывести на экран соответствующее текстовое сообщение.
    В случае если введенные значения образуют неправильную дробь, следует
    вывести ее на экран в виде смешанной дроби.
 */
public class Task_9_33 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println("Правильная дробь");
        } else {
            int c = a / b;
            int d = a % b;
            System.out.printf("%d %d/%d", c, d, b);
        }
    }
}
