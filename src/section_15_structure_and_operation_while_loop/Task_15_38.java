package section_15_structure_and_operation_while_loop;

/*
    Задание: Напишите класс, который находит наибольшее положительное двузначное
    число, которое делится на произведение своих цифр.
 */
public class Task_15_38 {

    public void action() {
        int a = 99;

        while (true) {
            int firstDigit = a / 10;
            int secondDigit = a % 10;
            int multiplication = firstDigit * secondDigit;

            if (multiplication == 0) {
                a--;
                continue;
            }

            if (a % multiplication == 0) {
                System.out.print(a);
                break;
            }

            a--;
        }
    }
}
