package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число, а затем генерирует случайную цифру.
    Класс должен определить, встречается ли во введенном с клавиатуры
    числе сгенерированная цифра (сколько раз и на каких позициях), и
    вывести на экран соответствующую информацию.
 */
public class Task_15_27 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int randomDigit = (int) (Math.random() * 10);
        int count = 0;
        int position = Integer.toString(number).length();
        boolean digitMet = false;
        String msgFalse = "Нет";
        String msgTrue = "Число встретилось на позициях: ";

        while (number != 0) {
            int lastDigit = number % 10;

            if (lastDigit == randomDigit) {
                digitMet = true;
                msgTrue = msgTrue + position + ", ";
            }

            position--;
            number /= 10;
        }

        System.out.println("Сгенерированная цифра: " + randomDigit);
        if (digitMet) {
            System.out.println(msgTrue);
        } else {
            System.out.println(msgFalse);
        }
        scanner.close();
    }
}
