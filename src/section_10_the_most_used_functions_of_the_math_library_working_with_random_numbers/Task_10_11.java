package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Как известно, при игре в «двадцать одно» («очко») у каждой карты
    есть численное значение. Напишите класс, который «выбрасывает три карты»
    (генерирует три случайных числа - в каких пределах?) и определяет, какой из вариантов
    (недобор, перебор, «очко») реализовался.
 */
public class Task_10_11 {

    public void action() {
        int card1 = (int) (Math.random() * 10) + 2;
        int card2 = (int) (Math.random() * 10) + 2;
        int card3 = (int) (Math.random() * 10) + 2;
        int sum = card1 + card2 + card3;

        if (sum < 21) {
            System.out.println("Недобор: " + sum);
        } else if (sum == 21) {
            System.out.println("Очко: " + sum);
        } else {
            System.out.println("Перебор: " + sum);
        }
    }
}
