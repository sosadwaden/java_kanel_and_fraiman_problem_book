package section3_assignment_of_data_between_different_types_of_variables_initialization_of_variables_special_operators;

import java.util.Scanner;

/*
    Задание: Во многих странах для измерения небольших размеров используется
    не только единица длины «сантиметр», но и такая единица, как
    «дюйм» (1 дюйм = 2.54 сантиметра).
    Напишите класс, который принимает с клавиатуры значение, равное
    размеру в дюймах, и затем подсчитывает и выводит на экран это же
    значение, но в сантиметрах.
 */
public class Task_3_3 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        double cm = d * 2.54;

        System.out.println(cm);
    }
}
