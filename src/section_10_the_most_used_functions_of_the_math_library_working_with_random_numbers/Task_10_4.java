package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число, а затем генерирует три целых положительных числа, меньших первого.
 */
public class Task_10_4 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int randomNumber1 = (int) (Math.random() * number);
        int randomNumber2 = (int) (Math.random() * number);
        int randomNumber3 = (int) (Math.random() * number);

        System.out.println("Первое случайное число: " + randomNumber1);
        System.out.println("Второе случайное число: " + randomNumber2);
        System.out.println("Третье случайное число: " + randomNumber3);
        scanner.close();
    }
}
