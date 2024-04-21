package section_14_for_loop_determining_the_maximum_and_minimum;

/*
    Задание: Напишите класс, который генерирует 24 целых трехзначных положительных
    числа и выводит на экран порядковый номер самого большого из сгенерированных чисел.
 */
public class Task_14_9 {

    public void action() {
        int maxValue = Integer.MIN_VALUE;
        int ordinalNumber = -1;

        for (int i = 1; i < 25; i++) {
            int randomNumber = (int) (Math.random() * 900) + 100;
            System.out.print(randomNumber + " ");

            if (randomNumber > maxValue) {
                maxValue = randomNumber;
                ordinalNumber = i;
            }
        }

        System.out.println("\nЧисло: " + maxValue + ", порядковый номер: " + ordinalNumber);
    }
}
