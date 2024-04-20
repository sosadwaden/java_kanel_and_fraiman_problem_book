package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Напишите класс, который генерирует и выводит на экран 3 случайных
    целых положительных трехзначных числа.
    Затем класс должен определить разницу между наибольшим и наименьшим
    из сгенерированных чисел и вывести ее на экран вместе с
    соответствующим текстовым сообщением.
 */
public class Task_10_18 {

    public void action() {
        int number1 = (int) (Math.random() * 900) + 100;
        int number2 = (int) (Math.random() * 900) + 100;
        int number3 = (int) (Math.random() * 900) + 100;

        System.out.println("Случайное число 1: " + number1);
        System.out.println("Случайное число 2: " + number2);
        System.out.println("Случайное число 3: " + number3);

        int maxNumber = Math.max(Math.max(number1, number2), number3);
        int minNumber = Math.min(Math.min(number1, number2), number3);

        int difference = maxNumber - minNumber;

        System.out.println("Разница между наибольшим и наименьшим числами: " + difference);
    }
}
