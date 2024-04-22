package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры положительное
    число (для переменной х) и положительное вещественное число (для переменной d).
    Класс будет заменять значение переменной х - на квадратный (положительный)
    корень из значения этой переменной до тех пор, пока значение
    переменной х будет больше 1 на величину, превышающую значение переменной d.
    Класс должен вывести на экран все промежуточные значения и определить
    количество операций извлечения корня из переменной х, которое было произведено.
 */
public class Task_15_45 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double d = scanner.nextDouble();
        int count = 0;

        while (x > 1 + d) {
            x = (int) Math.sqrt(x);
            System.out.println("Промежуточное значение: " + x);
            count++;
        }

        System.out.println("Количество операций извлечения корня из переменной x: " + count);
        scanner.close();
    }
}
