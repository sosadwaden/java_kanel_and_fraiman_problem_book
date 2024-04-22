package section_16_nested_loops;

/*
    Задание: Напишите класс, который выводит на экран:
    в первой строке все четные двузначные числа,
    во второй строке - двузначные числа, делящиеся на 3 без остатка,
    в третьей строке - двузначные числа, делящиеся на 4 без остатка, и так далее.
 */
public class Task_16_5 {

    public void action() {
        for (int i = 2; i <= 9; i++) {
            System.out.print("Числа, делящиеся на " + i + " без остатка: ");
            for (int y = 10; y <= 99; y++) {
                if (y % i == 0) {
                    System.out.print(y + " ");
                }
            }
            System.out.println();
        }
    }
}
