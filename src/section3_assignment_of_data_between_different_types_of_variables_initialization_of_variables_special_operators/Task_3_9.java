package section3_assignment_of_data_between_different_types_of_variables_initialization_of_variables_special_operators;

import java.util.Scanner;

/*
    Задание: Компания по продаже минеральной воды проводит конкурс «Балл под
    крышкой»: на внутренней стороне пробок, которыми закрыты бутылки,
    выпускаемые компанией, напечатаны призовые баллы. Есть пробки,
    «равные» 10 баллам, есть - 100, есть - 1000.
    Напишите класс, который принимает с клавиатуры три числа, означающие
    количество пробок каждого типа, собранных Васей, и выводит
    на экран общее количество баллов, которые Вася получил.
 */
public class Task_3_9 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a * 10 + b * 100 + c * 1000;

        System.out.println("Сумма: " + sum);
    }
}
