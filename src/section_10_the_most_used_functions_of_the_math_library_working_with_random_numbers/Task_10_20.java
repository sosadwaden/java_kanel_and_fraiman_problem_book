package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Напишите класс, который генерирует и выводит на экран сначала случайное
    положительное однозначное число (цифру), а затем - случайное целое трехзначное.
    Класс должен определить разницу между сгенерированной цифрой и
    наибольшей цифрой сгенерированного случайного трехзначного числа.
 */
public class Task_10_20 {

    public void action() {
        int digit = (int) (Math.random() * 9) + 1;
        System.out.println("Сгенерированная цифра: " + digit);

        int randomNumber = (int) (Math.random() * 900) + 100;
        System.out.println("Сгенерированное трехзначное число: " + randomNumber);
        int firstDigit = randomNumber / 100;
        int secondDigit = randomNumber / 10 % 10;
        int thirdDigit = randomNumber % 10;

        int maxDigit = Math.max(Math.max(firstDigit, secondDigit), thirdDigit);
        System.out.println("Максимальная цифры трёхзначного числа: " + maxDigit);
        System.out.println("Разница между сгенерированной цифрой и наибольшей цифрой" +
                           " сгенерированного случайного трехзначного числа: " + Math.abs(maxDigit - digit));
    }
}
