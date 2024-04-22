package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: На прогулочном пароходе есть определенное количество мест для
    взрослых и определенное количество мест для детей.
    Напишите класс, который принимает с клавиатуры два целых положительных
    числа: количество мест для взрослых и количество мест для детей.
    Затем класс должен принять пары целых чисел: первое число в паре -
    количество билетов для взрослых, второе - количество билетов для детей,
    которое покупает очередная группа. Продажа билетов заканчивается
    либо когда очередная пара содержит хотя бы одно неположительное значение,
    либо когда нет возможности выполнить очередной заказ.
    Класс должен вывести на экран следующую итоговую информацию:
    • число групп, купивших билеты;
    • количество взрослых и количество детей на пароходе;
    • количество непроданных взрослых и детских мест.
 */
public class Task_15_48 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество мест для взрослых: ");
        int adultSeats = scanner.nextInt();

        System.out.print("Введите количество мест для детей: ");
        int childSeats = scanner.nextInt();

        int soldGroups = 0;
        int soldAdults = 0;
        int soldChildren = 0;

        while (true) {
            System.out.print("Сколько билетов для взрослых купила группа? ");
            int adultTickets = scanner.nextInt();

            if (adultTickets <= 0) {
                break;
            }

            System.out.print("Сколько билетов для детей купила группа? ");
            int childTickets = scanner.nextInt();

            if (childTickets <= 0) {
                break;
            }

            if (adultTickets <= adultSeats && childTickets <= childSeats) {
                soldGroups++;
                soldAdults += adultTickets;
                soldChildren += childTickets;
                adultSeats -= adultTickets;
                childSeats -= childTickets;
            } else {
                System.out.println("Невозможно выполнить заказ для этой группы.");
            }
        }

        int unsoldAdults = adultSeats;
        int unsoldChildren = childSeats;

        System.out.println("Число групп, купивших билеты: " + soldGroups);
        System.out.println("Количество взрослых на пароходе: " + soldAdults);
        System.out.println("Количество детей на пароходе: " + soldChildren);
        System.out.println("Количество непроданных взрослых мест: " + unsoldAdults);
        System.out.println("Количество непроданных детских мест: " + unsoldChildren);
        scanner.close();
    }
}
