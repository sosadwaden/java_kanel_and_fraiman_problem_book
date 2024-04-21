package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран (в строку с пробелами) все
    двузначные целые положительные числа, в которых и цифра единиц, и
    цифра десятков делятся без остатка на три.
 */
public class Task_11_43 {

    public void action() {
        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;

            if (firstDigit % 3 == 0 && lastDigit % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
