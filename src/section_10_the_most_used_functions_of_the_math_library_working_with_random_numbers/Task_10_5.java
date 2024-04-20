package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Напишите класс, который генерирует случайное положительное двузначное
    число, а затем генерирует три целых положительных числа, меньших первого.
 */
public class Task_10_5 {

    public void action() {
        int randomNumber = (int) (Math.random() * 90) + 10;

        int randomNumber1 = (int) (Math.random() * randomNumber);
        int randomNumber2 = (int) (Math.random() * randomNumber);
        int randomNumber3 = (int) (Math.random() * randomNumber);

        System.out.println("Первое случайное число: " + randomNumber1);
        System.out.println("Второе случайное число: " + randomNumber2);
        System.out.println("Третье случайное число: " + randomNumber3);
    }
}
