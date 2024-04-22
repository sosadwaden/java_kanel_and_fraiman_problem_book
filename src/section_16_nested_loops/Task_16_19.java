package section_16_nested_loops;

/*
    Задание: Напишите класс, который выводит на экран все трехзначные числа,
    для которых соблюдаются два условия:
    • само число заканчивается на О;
    • сумма нечетных делителей этого числа тоже заканчивается на О.
 */
public class Task_16_19 {

    public void action() {
        for (int i = 100; i < 1000; i += 10) {

            int sum = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && j % 2 != 0) {
                    sum += j;
                }
            }

            if (sum % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}
