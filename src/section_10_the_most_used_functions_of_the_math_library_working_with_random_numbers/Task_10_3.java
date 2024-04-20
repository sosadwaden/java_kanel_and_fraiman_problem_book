package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Напишите класс, который генерирует и выводит на экран 2 случайных
    целых числа из диапазона «однозначные» (включая и положительные, и отрицательные).
    После этого в отдельной строке класс должен вывести наибольшее из
    этих двух чисел - с соответствующим текстовым сообщением, и в еще
    одной строке - наименьшее из этих двух чисел, тоже с соответствующим текстовым сообщением.
 */
public class Task_10_3 {

    public void action() {
        int randomNumber1 = (int) (Math.random() * 19) - 9;
        int randomNumber2 = (int) (Math.random() * 19) - 9;

        int maxNumber = Math.max(randomNumber1, randomNumber2);
        int minNumber = Math.min(randomNumber1, randomNumber2);

        System.out.println("Наибольшее из двух чисел: " + maxNumber);
        System.out.println("Наименьшее из двух чисел: " + minNumber);
    }
}
