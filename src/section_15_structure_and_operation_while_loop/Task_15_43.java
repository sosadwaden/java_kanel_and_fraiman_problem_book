package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Наибольший общий делитель (НОД) двух целых положительных чисел
    можно определить при помощи следующего метода: большее число
    уменьшается на значение меньшего до тех пор, пока числа не оказываются равными.
    Напишите класс, который принимает с клавиатуры два целых положительных
    числа и определяет их НОД описанным методом.
 */
public class Task_15_43 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        System.out.println("Наибольший общий делитель: " + a);
        scanner.close();
    }
}
