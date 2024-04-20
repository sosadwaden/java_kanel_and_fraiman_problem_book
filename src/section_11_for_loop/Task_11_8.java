package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран (в одну строку) 15 случайных
    чисел из диапазона -20...+35. После каждого отрицательного числа
    следует вывести (вплотную к числу) символ«?» (знак вопроса).
 */
public class Task_11_8 {

    public void action() {
        for (int i = 0; i < 15; i++) {
            int randomNumber = (int) (Math.random() * 56) - 20;

            System.out.print(randomNumber);

            if (randomNumber < 0) {
                System.out.print("?");
            }
            if (i < 14) {
                System.out.print(" ");
            }
        }
    }
}
