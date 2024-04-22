package section_16_nested_loops;

/*
    Задание: Напишите класс, который будет выводить на экран делители каждого числа от 1 до 75.
 */
public class Task_16_7 {

    public void action() {
        for (int i = 1; i <= 75; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
