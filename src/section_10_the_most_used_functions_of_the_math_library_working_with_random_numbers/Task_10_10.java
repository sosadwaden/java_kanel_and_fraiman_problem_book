package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Напиши класс, представляющий версию игры из предыдущего задания -
    только в этом случае компьютер должен играть сам с собой, то
    есть и первое значение должно не вводиться с клавиатуры, а генерироваться классом.
    ПРИМЕЧАНИЕ: задание повторяет задание 10_9
 */
public class Task_10_10 {

    public void action() {
        int center = (int) (Math.random() * 100);
        int randomNumber = (int) (Math.random() * 11) + (center - 5);

        System.out.println("Компьютер загадал число: " + randomNumber);

        int computerGuess = (int) (Math.random() * 11) + (center - 5);

        System.out.println("Компьютер предполагает число: " + computerGuess);

        if (computerGuess == randomNumber) {
            System.out.println("Компьютер угадал!");
        } else if (computerGuess < randomNumber) {
            System.out.println("Слишком маленькое число, компьютер загадал " + randomNumber);
        } else {
            System.out.println("Слишком большое число, компьютер загадал " + randomNumber);
        }
    }
}
