package section2_input_commands_output_commands;

/*
    Задание: Для заданий 1.4 - 1.7 из предыдущего раздела напишите класс, который
    не только будет присваивать переменным значения, но и выводить
    на экран эти значения вместе с соответствующими пояснительными текстами.
 */
public class Task_2_13 {

    public void action() {

        System.out.println("----------Task1_4----------");
        int a = 5, b = 9;
        System.out.printf("First variable (a) = %d, second variable (b) = %d %n", a, b);
        int c = a + b;
        System.out.printf("c = a + b = %d %n", c);

        System.out.println("----------Task1_5----------");
        double x = 7.5, y = x * 2, z = x * 3;
        System.out.printf("x = %f %n", x);
        System.out.printf("a = x * 2 = %f %n", y);
        System.out.printf("b = x * 3 = %f %n", z);

        System.out.println("----------Task1_6----------");
        int i = 3, j = 7;
        int k = i * 10 + j;
        System.out.printf("a = %d, b = %d %n", i, j);
        System.out.printf("c = a * 10 + b = %d %n", k);

        System.out.println("----------Task1_7----------");
        int o1 = 19;
        double o2 = o1 / 3.0;
        System.out.printf("x = %d %n", o1);
        System.out.printf("y = x / 3 = %f %n", o2);
    }
}
