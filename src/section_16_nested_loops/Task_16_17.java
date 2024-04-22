package section_16_nested_loops;

/*
    Задание: Напишите класс, который выводит на экран все простые двузначные
    числа, квадрат которых не превышает 999.
 */
public class Task_16_17 {

    public void action() {
        for (int i = 10; i < 100; i++) {

            int flag = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (i * i < 999 && flag == 0) {
                System.out.println(i);
            }
        }
    }
}
