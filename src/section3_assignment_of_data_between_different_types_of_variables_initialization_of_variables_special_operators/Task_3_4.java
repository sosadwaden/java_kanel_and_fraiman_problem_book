package section3_assignment_of_data_between_different_types_of_variables_initialization_of_variables_special_operators;

import java.util.Scanner;

/*
    Задание: Для пересчета суммы в одной валюте - в сумму в другой валюте (например,
    между суммой в рублях и этой же суммой, но в евро) используется
    так называемый «банковский курс»: числовой коэффициент,
    показывающий, чему равна единица одной валюты в единицах другой.
    Напишите класс, который принимает с клавиатуры два числа: первое -
    сумму в одной валюте (например, в долларах), и второе - «банковский
    курс». Класс должен подсчитать и вывести на экран сумму во второй валюте.
 */
public class Task_3_4 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        double currency = scanner.nextDouble();
        double ratio = scanner.nextDouble();

        System.out.println(ratio * currency);
    }
}
