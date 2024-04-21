package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран все целые положительные
    трехзначные числа, соответствующие следующему требованию: произведение
    первой и последней цифр равно квадрату средней.
 */
public class Task_11_40 {

    public void action() {
        for (int i = 99; i < 1000; i++) {
            int firstDigit = i / 100;
            int secondDigit = i / 10 % 10;
            int thirdDigit = i % 10;

            if (firstDigit * thirdDigit == secondDigit * secondDigit) {
                System.out.print(i + " ");
            }
        }
    }
}
