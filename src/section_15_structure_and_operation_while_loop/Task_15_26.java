package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число, а затем генерирует случайную цифру.
    Класс должен определить, встречается ли во введенном с клавиатуры
    числе сгенерированная цифра, и вывести на экран соответствующее сообщение.
 */
public class Task_15_26 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int randomDigit = (int) (Math.random() * 10);
        String msg = "Нет";

        while (number != 0) {
            int lastDigit = number % 10;

            if (lastDigit == randomDigit) {
                msg = "Да";
                break;
            }

            number /= 10;
        }

        System.out.println("Сгенерированная цифра: " + randomDigit);
        System.out.println("Встретилось ли она в числе? Ответ: " + msg);
        scanner.close();
    }
}
