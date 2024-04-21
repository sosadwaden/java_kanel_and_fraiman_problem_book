package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран (в строку с пробелами) все
    двузначные целые положительные числа, соответствующие следующему
    требованию: и цифра единиц, и цифра десятков делятся на три с разными остатками.
 */
public class Task_11_45 {

    public void action() {
        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;

            if (firstDigit % 3 != lastDigit % 3) {
                System.out.print(i + " ");
            }
        }
    }
}
