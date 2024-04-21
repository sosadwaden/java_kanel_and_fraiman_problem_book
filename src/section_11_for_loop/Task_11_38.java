package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число, а затем
    генерирует 15 случайных чисел из диапазона положительных трехзначных чисел.
    Для тех сгенерированных чисел, которые делятся на введенное с клавиатуры
    значение, следует вывести на экран округленный в большую
    сторону квадратный корень из первой цифры (число сотен), для остальных -
    округленный в меньшую сторону квадратный корень из
    второй цифры (число десятков).
 */
public class Task_11_38 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < 15; i++) {
            int randomNumber = (int) (Math.random() * 900) + 100;

            if (randomNumber % number == 0) {
                int firstDigit = randomNumber / 100;
                double sqrtFirstDigit = Math.sqrt(firstDigit);
                System.out.println("Число: " + randomNumber + ", округленный в большую сторону квадратный корень из первой цифры: " + Math.ceil(sqrtFirstDigit));
            } else {
                int secondDigit = (randomNumber / 10) % 10;
                double sqrtSecondDigit = Math.sqrt(secondDigit);
                System.out.println("Число: " + randomNumber + ", округленный в меньшую сторону квадратный корень из второй цифры: " + Math.floor(sqrtSecondDigit));
            }
        }

        scanner.close();
    }
}
