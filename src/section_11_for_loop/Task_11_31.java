package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран положительные двузначные
    числа, заканчивающиеся на цифру 7 (начиная с наименьшего).
 */
public class Task_11_31 {

    public void action() {
        for (int i = 17; i <= 97; i += 10) {
            System.out.print(i + " ");
        }
    }
}
