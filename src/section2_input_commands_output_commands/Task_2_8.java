package section2_input_commands_output_commands;

/*
    Задание: Напишите класс, который присваивает переменной х значение 6, а затем
    выводит на экран: в первой строке - это значение, во второй -
    квадрат этого значения, в третьей - куб этого значения.
*/
public class Task_2_8 {

    public void action() {
        int x = 6;

        System.out.println("x = " + (x));
        System.out.println("x^2 = " + (x * x));
        System.out.println("x^3 = " + (x * x * x));
    }
}
