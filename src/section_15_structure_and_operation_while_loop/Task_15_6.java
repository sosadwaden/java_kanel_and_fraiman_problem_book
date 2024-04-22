package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры числа, пока не будет введено значение 999.
    Класс должен подсчитать, сколько значений было введено с клавиатуры,
    чему равна сумма этих значений (не считая значения 999), и вывести
    эту информацию на экран.
 */
public class Task_15_6 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int sum = 0;

        while (number != 999) {
            count++;
            sum += number;
            number = scanner.nextInt();
        }

        System.out.print("Количество: " + count);
        System.out.print("Сумма: " + sum);
        scanner.close();
    }
}
