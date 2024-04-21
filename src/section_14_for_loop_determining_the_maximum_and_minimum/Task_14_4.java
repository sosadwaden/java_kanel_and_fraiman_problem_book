package section_14_for_loop_determining_the_maximum_and_minimum;

/*
    Задание: Напишите класс, который генерирует серию из 50 случайных целых
    чисел из диапазона от -40 до +40, и определяет наибольшее из положительных
    значений в сгенерированной серии, а также наименьшее из
    отрицательных значений в сгенерированной серии.
 */
public class Task_14_4 {

    public void action() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 50; i++) {
            int randomNumber = (int) (Math.random() * 81) - 40;
            System.out.println(randomNumber);

            if (randomNumber < 0 && randomNumber < min) {
                min = randomNumber;
            }
            if (randomNumber > 0 && randomNumber > max) {
                max = randomNumber;
            }
        }

        System.out.println("Наименьшее значение: " + min);
        System.out.println("Наибольшее значение: " + max);
    }
}
