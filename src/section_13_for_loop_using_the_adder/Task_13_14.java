package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Школа организовала распродажу в пользу стариков. На распродаже продавались билеты двух видов:
    • обычный билет участника распродажи;
    • билет с правом посещения концерта.
    Тот, кто приобрел более 10 обычных билетов участника, получал дополнительно
    еще один такой же - бесплатно.
    Напишите класс, который для каждого из 200 участников распродажи
    будет принимать в качестве ввода количество билетов каждого вида,
    приобретенных данным участником (два положительных целых числа).
    Класс подсчитает и напечатает в качестве вывода число проданных билетов
    каждого вида, а также число обычных билетов, выданных бесплатно.
 */
public class Task_13_14 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int totalRegularTickets = 0;
        int totalConcertTickets = 0;
        int freeRegularTickets = 0;

        for (int i = 1; i <= 200; i++) {
            System.out.print("Введите количество обычных билетов: ");
            int regularTickets = scanner.nextInt();
            System.out.print("Введите количество билетов с правом посещения концерта: ");
            int concertTickets = scanner.nextInt();

            totalRegularTickets += regularTickets;
            totalConcertTickets += concertTickets;

            if (regularTickets > 10) {
                freeRegularTickets++;
            }
        }

        System.out.println("Общее количество проданных обычных билетов: " + totalRegularTickets);
        System.out.println("Общее количество проданных билетов с правом посещения концерта: " + totalConcertTickets);
        System.out.println("Количество бесплатно выданных обычных билетов: " + freeRegularTickets);

        scanner.close();
    }
}
