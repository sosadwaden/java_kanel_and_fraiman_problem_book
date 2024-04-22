package section_16_nested_loops;

/*
    Задание: Напишите класс, который находит натуральное число
    от 1 до 10000 с максимальной суммой делителей.
 */
public class Task_16_12 {

    public void action() {
        int maxNumber = 0;
        int maxSum = 0;

        for (int i = 1; i <= 10000; i++) {
            int sum = 0;

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxNumber = i;
            }
        }

        System.out.println("Число с максимальной суммой делителей: " + maxNumber);
        System.out.println("Сумма делителей этого числа: " + maxSum);
    }
}
