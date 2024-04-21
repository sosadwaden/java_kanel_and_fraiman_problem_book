package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран целые положительные
    трехзначные числа, составленные целиком из четных цифр.
 */
public class Task_11_41 {

    public void action() {
        for (int i = 99; i < 1000; i++) {
            int firstDigit = i / 100;
            int secondDigit = i / 10 % 10;
            int thirdDigit = i % 10;

            if (firstDigit % 2 == 0 && secondDigit % 2 == 0 && thirdDigit % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
