package section_14_for_loop_determining_the_maximum_and_minimum;

/*
    Задание: Напишите класс, который генерирует 15 целых положительных трехзначных
    чисел и выводит на экран число, сумма цифр которого была минимальной.
 */
public class Task_14_8 {

    public void action() {
        int minSum = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        for (int i = 0; i < 15; i++) {
            int randomNumber = (int) (Math.random() * 900) + 100;
            System.out.print(randomNumber + " ");
            int firstDigit = randomNumber / 100;
            int secondDigit = randomNumber / 10 % 10;
            int thirdDigit = randomNumber % 10;

            if (firstDigit + secondDigit + thirdDigit < minSum) {
                minSum = firstDigit + secondDigit + thirdDigit;
                minValue = randomNumber;
            }
        }

        System.out.println("\n" + minValue);
    }
}
