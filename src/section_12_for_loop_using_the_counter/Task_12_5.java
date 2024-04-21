package section_12_for_loop_using_the_counter;

/*
    Задание: Напишите класс, который генерирует 15 целых чисел в интервале от
    -25 до 25, печатает их, а затем выводит на экран информацию о том,
    сколько из них были:
    • положительными;
    • четными;
    • однозначными.
 */
public class Task_12_5 {

    public void action() {
        int positiveCount = 0;
        int evenCount = 0;
        int singleDigitCount = 0;

        for (int i = 0; i < 15; i++) {
            int number = (int) (Math.random() * 51) - 25;
            System.out.print(number + " ");

            if (number > 0) {
                positiveCount++;
            }
            if (number % 2 == 0) {
                evenCount++;
            }
            if (Math.abs(number) < 10) {
                singleDigitCount++;
            }
        }

        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Количество однозначных чисел: " + singleDigitCount);
    }
}
