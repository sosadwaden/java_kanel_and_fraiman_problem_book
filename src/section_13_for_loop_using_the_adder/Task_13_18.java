package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: По правилам банка, на вклад ежемесячно начисляется определенная
    сумма, которая зависит от ежемесячного процента на вклад.
    Например, на вкладе в 10000 рублей с месячным процентом 10% через
    месяц будет сумма 11000 рублей (1000 плюс 10% от 1000), а еще через
    месяц - 12100 (11000 плюс 10% от 11000).
    Напишите класс, который принимает с клавиатуры три значения:
    • сумму на вкладе;
    • месячный процент;
    • количество месяцев, в течение которых начисляются проценты на вклад.
    Класс подсчитает и выведет на экран итоговую сумму на вкладе.
 */
public class Task_13_18 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму на вкладе: ");
        double amount = scanner.nextDouble();

        System.out.print("Введите месячный процент: ");
        double monthlyInterestRate = scanner.nextDouble() / 100;

        System.out.print("Введите количество месяцев: ");
        int months = scanner.nextInt();

        for (int i = 0; i < months; i++) {
            amount += amount * monthlyInterestRate;
        }

        System.out.println("Итоговая сумма на вкладе: " + amount);
        scanner.close();
    }
}
