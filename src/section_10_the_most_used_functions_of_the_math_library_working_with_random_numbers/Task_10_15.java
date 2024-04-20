package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Напишите класс, который генерирует и выводит на экран случайное
    число из диапазона от 250 до 746, а затем в отдельных строках, — наименьшую
    и наибольшую из цифр этого числа.
    Класс также должен проверить, были ли в генерированном числе одинаковые
    цифры, и вывести на экран соответствующее текстовое сообщение.
 */
public class Task_10_15 {

    public void action() {
        int randomNumber = (int) (Math.random() * (746 - 250 + 1)) + 250;
        int firstDigit = randomNumber / 100;
        int secondDigit = randomNumber / 10 % 10;
        int thirdDigit = randomNumber % 10;
        int min = 0;
        int max = 0;
        System.out.println("Сгенерированное число: " + randomNumber);

        if (firstDigit <= secondDigit && firstDigit <= thirdDigit)
            min = firstDigit;

        if (secondDigit <= firstDigit && secondDigit <= thirdDigit)
            min = secondDigit;

        if (thirdDigit <= firstDigit && thirdDigit <= secondDigit)
            min = thirdDigit;

        if(firstDigit >= secondDigit && firstDigit >= thirdDigit)
            max = firstDigit;

        if (secondDigit >= firstDigit && secondDigit >= thirdDigit)
            max = secondDigit;

        if (thirdDigit >= firstDigit && thirdDigit >= secondDigit)
            max = thirdDigit;

        System.out.println("min: " + min + ", " + "max: " + max);

        if (firstDigit == secondDigit || secondDigit == thirdDigit) {
            System.out.println("В числе есть одинаковые цифры");
        } else {
            System.out.println("В числе цифры разные");
        }
    }
}
