package section_14_for_loop_determining_the_maximum_and_minimum;

/*
    Задание: Напишите класс, который генерирует 25 целых положительных трехзначных
    чисел и выводит на экран порядковый номер числа, сумма
    цифр которого была максимальной.
 */
public class Task_14_10 {

    public void action() {
        int maxSum = Integer.MIN_VALUE;
        int ordinalNumber = -1;

        for (int i = 1; i < 26; i++) {
            int randomNumber = (int) (Math.random() * 900) + 100;
            System.out.print(randomNumber + " ");
            int firstDigit = randomNumber / 100;
            int secondDigit = randomNumber / 10 % 10;
            int thirdDigit = randomNumber % 10;

            if (firstDigit + secondDigit + thirdDigit > maxSum) {
                maxSum = firstDigit + secondDigit + thirdDigit;
                ordinalNumber = i;
            }
        }

        System.out.println("\nПорядковый номер: " + ordinalNumber);
    }
}
