package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран положительные двузначные
    числа, заканчивающиеся на цифру 7 (начиная с наибольшего).
 */
public class Task_11_32 {

    public void action() {
        for (int i = 91; i >= 17; i -= 10) {
            System.out.print(i + " ");
        }
    }
}
