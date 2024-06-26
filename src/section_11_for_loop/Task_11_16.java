package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран в строку все положительные
    двузначные числа (в возрастающем порядке). Числа должны отделяться
    друг от друга знаком «пробел». Рядом с числом, которое делится
    на 4, следует вывести знак «#» (решетка) без пробела между числом и
    знаком. Перед началом и после окончания вывода серии чисел на экран
    вывода следует вывести текстовые сообщения (по выбору).
 */
public class Task_11_16 {

    public void action() {
        System.out.println("Начало");

        for (int i = 10; i < 100; i++) {
            if (i % 4 == 0)
                System.out.print(i + "# ");
            else
                System.out.print(i + " ");
        }

        System.out.print("\nКонец");
    }
}
