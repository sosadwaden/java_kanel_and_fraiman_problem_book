package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

import java.util.Scanner;

/*
    Задание: Напишите класс, который повторяет предыдущее задание, но предоставляет
    игроку получить, если он того захочет, еще и четвертую карту.
    Это, например, можно сделать через ввод с клавиатуры значения, и,
    если введено значение 1 (единица), то это означает согласие игрока на получение четвертой карты.
 */
public class Task_10_12 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        int card1 = (int) (Math.random() * 10) + 2;
        int card2 = (int) (Math.random() * 10) + 2;
        int card3 = (int) (Math.random() * 10) + 2;
        int sum = card1 + card2 + card3;

        System.out.println("Ваши первые три карты: " + card1 + ", " + card2 + ", " + card3);
        System.out.println("Сумма: " + sum);
        System.out.println("Хотите взять еще одну карту? Введите 1 для согласия, любой другой символ для отказа:");

        if (scanner.nextInt() == 1) {
            int card4 = (int) (Math.random() * 10) + 2;
            System.out.println("Ваша четвертая карта: " + card4);
            sum += card4;
            System.out.println("Новая сумма: " + sum);
        }

        if (sum < 21) {
            System.out.println("Недобор: " + sum);
        } else if (sum == 21) {
            System.out.println("Очко: " + sum);
        } else {
            System.out.println("Перебор: " + sum);
        }
    }
}
