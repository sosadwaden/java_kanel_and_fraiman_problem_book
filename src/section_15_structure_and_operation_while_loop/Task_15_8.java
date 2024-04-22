package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры значения, пока их
    сумма остается меньше 150. По окончании ввода следует вывести на
    экран информацию о количестве введенных значений и их сумме.
 */
public class Task_15_8 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            int number = scanner.nextInt();
            sum += number;
            count++;

            if (sum >= 150) {
                break;
            }
        }

        System.out.print("Кол-во: " + count + "\nСумма: " + sum);
        scanner.close();
    }
}
