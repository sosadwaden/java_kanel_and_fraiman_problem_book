package section_14_for_loop_determining_the_maximum_and_minimum;

/*
    Задание: Напишите класс, который генерирует 20 целых положительных двузначных
    чисел и выводит на экран число, сумма цифр которого была максимальной.
 */
public class Task_14_7 {

    public void action() {
        int maxSum = Integer.MIN_VALUE;
        int maxValue = -1;

        for (int i = 0; i < 20; i++) {
            int randomNumber = (int) (Math.random() * 90) + 10;
            System.out.print(randomNumber + " ");
            int firstDigit = randomNumber / 10;
            int secondDigit = randomNumber % 10;

            if (firstDigit + secondDigit > maxSum) {
                maxSum = firstDigit + secondDigit;
                maxValue = randomNumber;
            }
        }

        System.out.println("\n" + maxValue);
    }
}
