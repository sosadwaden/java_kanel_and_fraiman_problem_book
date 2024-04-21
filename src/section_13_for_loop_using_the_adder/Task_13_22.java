package section_13_for_loop_using_the_adder;

/*
    Задание: Трехзначное число называется «числом Армстронга», если куб суммы
    цифр числа равен самому числу.
    Напишите класс, который выводит на экран все трехзначные «числа Армстронга».
    Класс также должен подсчитывать (и выводить на экран с соответствующим
    текстовым сообщением) количество и сумму этих чисел.
 */
public class Task_13_22 {

    public void action() {
        int sum = 0;
        int count = 0;

        for (int i = 100; i < 1000; i++) {
            int firstDigit = i / 100;
            int secondDigit = i / 10 % 10;
            int thirdDigit = i % 10;

            if (i == Math.pow(firstDigit + secondDigit + thirdDigit, 3)) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }

        System.out.println("\nКоличество таких чисел: " + count);
        System.out.println("Сумма этих чисел: " + sum);
    }
}
