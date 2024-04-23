package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра целое
    число и выводит на экран в одну строку через пробел все делители
    этого числа (не считая 1 и самого числа). В случае если у числа нет ни
    одного делителя - на экран выводится соответствующее текстовое сообщение.
 */
public class Task_17_20 {

    public void method(int number) {
        boolean flag = false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                flag = true;
            }
        }

        if (flag) {
            System.out.println("У числа нет делителей -> число простое");
        }
    }
}
