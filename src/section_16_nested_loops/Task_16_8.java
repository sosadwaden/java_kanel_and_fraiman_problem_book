package section_16_nested_loops;

/*
    Задание: Напишите класс, который будет выводить на экран суммы делителей каждого числа от 1 до 75.
 */
public class Task_16_8 {

    public void action() {
        for (int i = 1; i <= 75; i++) {

            int sum = 0;
            System.out.print(i + ": ");

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0)
                    sum += j;
            }
            System.out.println(sum);
        }
    }
}
