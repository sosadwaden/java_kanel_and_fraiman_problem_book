package section_16_nested_loops;

/*
    Задание: Напишите класс, который выводит на экран все положительные четные
    двузначные числа, сумма делителей которых тоже является четным числом.
 */
public class Task_16_16 {

    public void action() {
        for (int i = 10; i < 100; i++) {

            int sum = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
