package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Напишите класс, который генерирует и выводит на экран случайное
    целое чисел из диапазона положительных двузначных чисел.
 */
public class Task_10_1 {

    public void action() {
        int randomNumber = (int) (Math.random() * 90) + 10;

        System.out.println(randomNumber);
    }
}
