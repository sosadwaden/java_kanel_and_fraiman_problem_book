package section7_simple_if_with_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два числа, первое
    из которых - количество учеников в классе, а второе - количество
    столов в классной комнате. Программа должна проверить, всем ли
    ученикам будет, где сесть. Предполагается, что за столом могут сидеть два ученика.
 */
public class Task_7_8 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int amountStudents = scanner.nextInt();
        int amountTables = scanner.nextInt();

        if (amountTables * 2 >= amountStudents) {
            System.out.println("Все ученики могут сесть.");
        } else {
            System.out.println("Не все ученики смогут сесть.");
        }

        scanner.close();
    }
}
