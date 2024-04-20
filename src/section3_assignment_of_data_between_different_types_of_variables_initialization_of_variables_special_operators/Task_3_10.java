package section3_assignment_of_data_between_different_types_of_variables_initialization_of_variables_special_operators;

import java.util.Scanner;

/*
    Задание: Подрабатывая в течение года, Вася собрал себе определенную сумму на
    поездку за границу, а родители добавили ему от себя еще некоторую сумму.
    Напишите класс, который принимает с клавиатуры три значения: первое -
    сумма в рублях, заработанная Васей, второе - сумма в рублях,
    которую ему дали родители, третье - курс рубля по отношению к евро.
    Класс должен подсчитать и вывести на экран сумму в евро, которая
    имеется у Васи для поездки за границу.
 */
public class Task_3_10 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int vasyaEarned = scanner.nextInt();
        int parentsEarned = scanner.nextInt();
        double ratioEuro = scanner.nextDouble();
        double result = (vasyaEarned + parentsEarned) / ratioEuro;

        System.out.println(result);
        scanner.close();
    }
}
