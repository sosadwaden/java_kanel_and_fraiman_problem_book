package section_13_for_loop_using_the_adder;

/*
    Задание: Назовем «стабильным» положительное двузначное число, которое при
    умножении на 2 дает такое двузначное число, в котором сумма цифр
    равна сумме цифр в двузначном числе до умножения.
    Напишите класс, который выводит на экран все «стабильные» числа, а
    также их количество и сумму этих чисел.
 */
public class Task_13_19 {

    public void action() {
        int a, a1, a2, i1, i2, count = 0, sum = 0;

        for (int i = 10; i <= 49; i++) {
            i1 = i / 10;
            i2 = i % 10;
            a = i * 2;
            a1 = a / 10;
            a2 = a % 10;

            if ((i1 + i2) == (a1 + a2)) {
                System.out.print(i + "," + a + " ");
                count++;
                sum += i;
            }
        }

        System.out.println();
        System.out.println(count);
        System.out.println(sum);
    }
}
