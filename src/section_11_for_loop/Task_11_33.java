package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран положительные трехзначные
    числа, делящиеся без остатка на 11 (начиная с наименьшего).
 */
public class Task_11_33 {

    public void action() {
        for (int i = 110; i <= 999; i += 11) {
            System.out.print(i + " ");
        }
    }
}
