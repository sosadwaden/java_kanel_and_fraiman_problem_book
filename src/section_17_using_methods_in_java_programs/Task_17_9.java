package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который получает в качестве параметра два числа
    (А и В) и выводит на экран все четные числа из диапазона А...В.
 */
public class Task_17_9 {

    public void method(int A, int B) {
        while (A <= B) {
            if (A % 2 == 0) {
                System.out.print(A + " ");
            }
            A++;
        }
    }
}
