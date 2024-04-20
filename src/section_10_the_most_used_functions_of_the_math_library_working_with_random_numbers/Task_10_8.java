package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и затем
    генерирует («придумывает») случайное число из следующего диапазона:
    • «центром диапазона» является введенное с клавиатуры число;
    • количество чисел в диапазоне равно 11.
    Класс должен определять, «угадал» ли компьютер введенное число и
    выводить на экран одно из сообщений (в зависимости от соотношения
    введенного и «придуманного» чисел):
    • угадал - если числа совпали;
    • слишком большое - если «придуманное» компьютером число больше введенного с клавиатуры;
    • слишком маленькое - если «придуманное» компьютером число меньше введенного с клавиатуры.
 */
public class Task_10_8 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int center = scanner.nextInt();
        int randomNumber = (int) (Math.random() * 11) + (center - 5);

        System.out.print("Попробуйте угадать число: ");
        int guess = scanner.nextInt();

        if (guess == randomNumber) {
            System.out.println("Вы угадали!");
        } else if (guess < randomNumber) {
            System.out.println("Слишком маленькое число, компьютер загадал " + randomNumber);
        } else {
            System.out.println("Слишком большое число, компьютер загадал " + randomNumber);
        }
    }
}
