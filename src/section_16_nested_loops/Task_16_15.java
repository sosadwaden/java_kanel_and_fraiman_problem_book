package section_16_nested_loops;

/*
    Задание: Напишите класс, который выводит на экран все простые трехзначные числа.
    Класс также должен определить количество и сумму этих чисел.
 */
public class Task_16_15 {

    public void action() {
        int count = 0;
        int sum = 0;

        for (int i = 100; i < 1000; i++) {

            int flag = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                count++;
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println("Кол-во: " + count + "\nСумма: " + sum);
    }
}
