package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Два положительных целых числа называются «родственными», если у
    них есть одинаковое количество делителей.
    Напишите класс, который принимает с клавиатуры два целых положительных
    числа и проверяет, являются ли они «родственными».
 */
public class Task_12_17 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int countDividerNumber1 = 0;
        int countDividerNumber2 = 0;

        for (int i = 2; i < number1; i++) {
            if (number1 % i == 0)
                countDividerNumber1++;
        }

        for (int i = 2; i < number2; i++) {
            if (number2 % i == 0)
                countDividerNumber2++;
        }

        if (countDividerNumber1 == countDividerNumber2) {
            System.out.println("Родственные");
        } else {
            System.out.println("Нет");
        }

        scanner.close();
    }
}
