package section_12_for_loop_using_the_counter;

/*
    Задание: Серия случайных чисел называется «уравновешенной», если количество
    положительных и отрицательных чисел в серии - одинаково.
    Напишите класс, который генерирует серию из 30 случайных целых
    чисел из диапазона от -20 до 20 и проверяет, является ли серия «уравновешенной».
 */
public class Task_12_14 {

    public void action() {
        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < 30; i++) {
            int randomNumber = (int) (Math.random() * 41) - 20;

            if (randomNumber > 0) {
                countPositive++;
            } else if (randomNumber < 0) {
                countNegative++;
            }
        }

        if (countNegative == countPositive) {
            System.out.println("Число уравновешенное");
        } else {
            System.out.println("Нет");
        }
    }
}
