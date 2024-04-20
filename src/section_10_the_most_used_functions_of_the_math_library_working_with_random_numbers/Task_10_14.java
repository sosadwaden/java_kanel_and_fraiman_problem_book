package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Напишите класс, который создает и выводит на экран 5 случайных целых
    чисел, заканчивающихся на ноль, и принадлежащих к диапазону двузначных чисел.
 */
public class Task_10_14 {

    public void action() {
        int randomNumber1 = ((int) (Math.random() * 10) * 10);
        System.out.println(randomNumber1);

        int randomNumber2 = ((int) (Math.random() * 10) * 10);
        System.out.println(randomNumber2);

        int randomNumber3 = ((int) (Math.random() * 10) * 10);
        System.out.println(randomNumber3);

        int randomNumber4 = ((int) (Math.random() * 10) * 10);
        System.out.println(randomNumber4);

        int randomNumber5 = ((int) (Math.random() * 10) * 10);
        System.out.println(randomNumber5);
    }
}
