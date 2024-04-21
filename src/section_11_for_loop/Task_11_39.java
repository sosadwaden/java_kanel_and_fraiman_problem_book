package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран все положительные двузначные
    числа (выберите самостоятельно - в возрастающем или убывающем
    порядке), произведение цифр которых является тоже двузначным числом.
 */
public class Task_11_39 {

    public void action() {
        for (int i = 99; i > 9; i--) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;

            if (firstDigit * lastDigit >= 10) {
                System.out.print(i + " ");
            }
        }
    }
}
