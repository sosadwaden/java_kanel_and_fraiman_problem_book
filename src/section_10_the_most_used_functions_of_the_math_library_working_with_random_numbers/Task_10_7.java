package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Напишите класс, который генерирует два случайных положительных двузначных
    числа, обозначающих границы некоторого интервала, а затем
    генерирует три целых положительных числа внутри данного интервала.
 */
public class Task_10_7 {

    public void action() {
        int lowerBound = (int) (Math.random() * 90) + 10;
        int upperBound = (int) (Math.random() * 90) + 10;

        System.out.println("Нижняя граница интервала: " + lowerBound);
        System.out.println("Верхняя граница интервала: " + upperBound);

        int randomNumber1 = (int) (Math.random() * (upperBound - lowerBound - 1)) + lowerBound + 1;
        int randomNumber2 = (int) (Math.random() * (upperBound - lowerBound - 1)) + lowerBound + 1;
        int randomNumber3 = (int) (Math.random() * (upperBound - lowerBound - 1)) + lowerBound + 1;

        System.out.println("Первое случайное число внутри интервала: " + randomNumber1);
        System.out.println("Второе случайное число внутри интервала: " + randomNumber2);
        System.out.println("Третье случайное число внутри интервала: " + randomNumber3);
    }
}
