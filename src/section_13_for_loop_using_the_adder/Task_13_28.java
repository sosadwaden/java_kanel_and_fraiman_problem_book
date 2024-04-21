package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры две пары целых чисел:
    • первая пара - значение и порядковый номер одного члена арифметической прогрессии;
    • вторая пара - значение и порядковый номер другого члена этой же прогрессии.
    Класс должен вывести на экран все члены этой арифметической прогрессии,
    расположенные между двумя введенными.
    В случае если речь идет о двух соседних членах, на экран следует вывести
    соответствующее текстовое сообщение.
 */
public class Task_13_28 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение и порядковый номер первого члена прогрессии:");
        int value1 = scanner.nextInt();
        int order1 = scanner.nextInt();

        System.out.println("Введите значение и порядковый номер второго члена прогрессии:");
        int value2 = scanner.nextInt();
        int order2 = scanner.nextInt();

        int difference = Math.abs(order2 - order1);

        if (difference > 1) {
            System.out.println("Члены прогрессии между введенными:");
            int startOrder = Math.min(order1, order2);
            int endOrder = Math.max(order1, order2);
            for (int i = startOrder + 1; i < endOrder; i++) {
                System.out.print(value1 + (value2 - value1) * (i - order1) / (order2 - order1) + " ");
            }
        } else {
            System.out.println("Между введенными членами прогрессии нет других членов.");
        }

        scanner.close();
    }
}
