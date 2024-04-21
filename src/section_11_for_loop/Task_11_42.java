package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран все целые трехзначные
    числа (и положительные, и отрицательные), соответствующие следующему
    требованию: эти числа делятся без остатка на сумму собственных цифр.
 */
public class Task_11_42 {

    public void action() {
        for (int i = -999; i < 1000; i++) {
            int firstDigit = i / 100;
            int secondDigit = i / 10 % 10;
            int thirdDigit = i % 10;
            int sum = firstDigit + secondDigit + thirdDigit;

            if (sum == 0) {
                continue;
            }

            if (i %  sum == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
