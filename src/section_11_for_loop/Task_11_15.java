package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран в строку все положительные
    двузначные четные числа (в возрастающем порядке). Числа должны
    отделяться друг от друга знаком «пробел». Перед началом и после
    окончания вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
 */
public class Task_11_15 {

    public void action() {
        System.out.println("Начало");

        for (int i = 10; i < 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.print("\nКонец");
    }
}
