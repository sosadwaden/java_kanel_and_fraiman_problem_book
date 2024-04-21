package section_12_for_loop_using_the_counter;

/*
    Задание: Напишите класс, который выводит на экран все целые положительные
    двузначные числа, в которых разница между первой (число десятков) и
    последней (число единиц) цифрами не превышает 3.
    Класс должен также подсчитать количество этих чисел и вывести результат
    на экран вместе с соответствующим текстовым сообщением.
 */
public class Task_12_8 {

    public void action() {
        int count = 0;

        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;

            if (Math.abs(firstDigit - lastDigit) <= 3) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nКоличество двузначных чисел с разницей между цифрами не более 3: " + count);
    }
}
