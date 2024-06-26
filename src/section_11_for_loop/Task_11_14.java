package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран в строку все однозначные
    числа (в возрастающем порядке). Числа должны отделяться друг от друга
    знаком «запятая» (допускается вывод запятой и после последнего
    числа в серии). Перед началом вывода на экран (в отдельной строке)
    следует вывести слова От ... , а после окончания вывода чисел (тоже в
    отдельной строке) - слова ... и до.
 */
public class Task_11_14 {

    public void action() {
        System.out.println("От...");

        for (int i = 1; i <= 9; i++) {
            if (i == 9) {
                System.out.print(i + "\n");
            } else {
                System.out.print(i + ", ");
            }
        }

        System.out.println("...и до");
    }
}
