package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который выводит на экран «песочные часы», составленные
    из какого-либо символа.
 */
public class Task2_12 {

    private final Scanner scanner = new Scanner(System.in);

    public void action() {
        System.out.println("Введите символ, из которого будет состоять картинка:");
        String symbol = scanner.nextLine();

        /*
        repeat() - метод строки, который повторяет строку n-ое количество раз.
        String.format() - метод класс String, который возвращает отформатированную строку из строки
        с помощью остальных аргументов. Очень удобный способ для красивого вывода на консоль.
         */
        String line1 = symbol.repeat(11);
        String line2 = String.format(" %s ", symbol.repeat(9));
        String line3 = String.format("  %s  ", symbol.repeat(7));
        String line4 = String.format("   %s   ", symbol.repeat(5));
        String line5 = String.format("    %s    ", symbol.repeat(3));
        String line6 = String.format("     %s     ", symbol.repeat(1));

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line5);
        System.out.println(line4);
        System.out.println(line3);
        System.out.println(line2);
        System.out.println(line1);
    }
}
