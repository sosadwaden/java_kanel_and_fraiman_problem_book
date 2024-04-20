package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Целое трехзначное число называется «ЯМОЙ», если его средняя цифра меньше крайних.
    Напишите класс, который принимает с клавиатуры положительное
    трехзначное число и проверяет, является ли оно «ЯМОЙ».
 */
public class Task_9_25 {

    public void action(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        if (secondDigit < firstDigit && secondDigit < thirdDigit) {
            System.out.println("Яма");
        } else {
            System.out.println("Не яма");
        }

        scanner.close();
    }
}
