package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых положительных
    числа х и у. Класс преобразует большее из них - в меньшее следующим образом:
    • если преобразуемое число - нечетное, оно уменьшается на 1;
    • если преобразуемое число - четное, его делят на два.
    Класс должен выполнить преобразование большего числа - к меньшему,
    указывая все промежуточные значения; следует указать и общее
    количество выполненных преобразований.
 */
public class Task_15_41 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int count = 0;

        while (x != y) {
            System.out.println("Текущие значения: x = " + x + ", y = " + y);

            if (x > y) {
                if (x % 2 == 0) {
                    x /= 2;
                } else {
                    x--;
                }
            } else {
                if (y % 2 == 0) {
                    y /= 2;
                } else {
                    y--;
                }
            }

            count++;
        }

        System.out.println("Общее количество преобразований: " + count);
        System.out.println("Финальные значения: x = " + x + ", y = " + y);
        scanner.close();
    }
}
