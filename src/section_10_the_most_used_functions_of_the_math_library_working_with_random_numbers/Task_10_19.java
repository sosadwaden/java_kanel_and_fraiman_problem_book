package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Напишите класс, который генерирует и выводит на экран последовательность
    из 5 случайных целых чисел из диапазона от -50 до 50.
    Класс должен определить, сколько раз в этой последовательности менялся знак.
    Например: в последовательности 1, -34, 8, 14, -5 знак меняется 3 раза.
 */
public class Task_10_19 {

    public void action() {
        int up = 50;
        int down = -50;
        int count = 0;
        int randomNumber1 = down + (int) ((up - down + 1) * Math.random());
        int randomNumber2 = down + (int) ((up - down + 1) * Math.random());
        int randomNumber3 = down + (int) ((up - down + 1) * Math.random());
        int randomNumber4 = down + (int) ((up - down + 1) * Math.random());
        int randomNumber5 = down + (int) ((up - down + 1) * Math.random());

        System.out.printf("randomNumber1: %s, randomNumber2: %s, randomNumber3: %s, randomNumber4: %s, randomNumber5: %s\n", randomNumber1, randomNumber2, randomNumber3, randomNumber4, randomNumber5);

        if (randomNumber1 * randomNumber2 < 0)
            count++;
        if (randomNumber2 * randomNumber3 < 0)
            count++;
        if(randomNumber3 * randomNumber4 < 0)
            count++;
        if (randomNumber4 * randomNumber5 < 0)
            count++;

        System.out.println(count);
    }
}
