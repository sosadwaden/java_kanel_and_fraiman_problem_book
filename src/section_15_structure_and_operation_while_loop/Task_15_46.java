package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: В инструкции по пользованию лифтом в торговом центре написано:
    «Не более 6 человек или не более 450 кг». Перед входом в лифт установлен
    прибор, который подсчитывает входящих в лифт и определяет
    вес до входа в лифт. Прибор автоматически прекращает доступ к лифту,
    если вход очередного человека может нарушить инструкцию.
    Напишите класс, который принимает с клавиатуры значения, каждое
    из которых - вес очередного человека, входящего в лифт. Ввод данных
    продолжается до тех пор, пока соблюдается требование, указанное в инструкции.
    Класс должен выводить на экран следующую итоговую информацию:
    • количество людей, вошедших в лифт;
    • общий их вес;
    • причина, по которой прекращен вход людей в лифт.
 */
public class Task_15_46 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = 0;
        int weightSum = 0;
        int weight = 0;

        while (peopleCount <= 6 && weightSum <= 450) {
            weight = scanner.nextInt();
            peopleCount++;
            weightSum += weight;
            System.out.println(peopleCount + ", " + weightSum);
        }

        if (peopleCount > 6 && weightSum < 450) {
            System.out.println("Много народа");
            System.out.println((peopleCount - 1) + " " + weightSum);
        } else if (peopleCount <= 6 && weightSum > 450) {
            System.out.println("Много веса");
            System.out.println(peopleCount + " " + (weightSum - weight));
        } else if (peopleCount > 6 && weightSum > 450) {
            System.out.println("Много народа и веса");
            System.out.println((peopleCount - 1) + " " + (weightSum - weight));
        } else {
            System.out.println("Можно ехать");
        }

        scanner.close();
    }
}
