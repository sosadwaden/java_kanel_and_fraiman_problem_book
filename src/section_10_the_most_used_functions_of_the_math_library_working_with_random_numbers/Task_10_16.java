package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Напишите класс, который генерирует и выводит на экран два случайных
    числа из диапазона от 17 до 94.
    Класс должен проверить, какое из двух чисел, первое или второе, было
    больше, и вывести на экран соответствующее текстовое сообщение.
    Кроме того, класс должен определить наименьшую цифру из всех фигурирующих
    в этих числах и вывести на экран соответствующее текстовое сообщение.
 */
public class Task_10_16 {

    public void action() {
        int a = 17 + (int) ((94 - 17 + 1) * Math.random());
        int b = 17 + (int) ((94 - 17 + 1) * Math.random());
        System.out.printf("a: %s ,b: %s\n", a, b);

        if (a > b)
            System.out.println("Первое число больше второго");
        else if (b > a)
            System.out.println("Второе число больше первого");

        int a1 = a / 10;
        int a2 = a % 10;
        int b1 = b / 10;
        int b2 = b % 10;

        if (a1 <= a2 && a1 <= b1 && a1 <= b2)
            System.out.println("Наименьшая цифра в двух числах: " + a1);
        if (a2 <= a1 && a2 <= b1 && a2 <= b2)
            System.out.println("Наименьшая цифра в двух числах: " + a2);
        if (b1 <= a1 && b1 <= a2 && b1 <= b2)
            System.out.println("Наименьшая цифра в двух числах: " + b1);
        if (b2 <= a1 && b2 <= a2 && b2 <= b1)
            System.out.println("Наименьшая цифра в двух числах: " + b2);
    }
}
