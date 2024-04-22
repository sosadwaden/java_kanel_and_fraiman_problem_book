package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Банк готов предоставить клиенту право производить операции на банковском
    счете при условии, что банковский овердрафт («минус», отрицательная
    сумма на счету) не превысит определенной суммы.
    Напишите класс, который принимает с клавиатуры два значения: первое -
    величина допустимого овердрафта, второе - сумма на счету клиента в данный момент.
    Затем класс должен принять с клавиатуры серию чисел, каждое из которых -
    размер операции в рублях, которую клиент выполняет на своем
    банковском счете. Положительное значение - клиент вносит деньги на
    счет, отрицательное значение - клиент снимает деньги со счета.
    Ввод данных завершается либо при превышении клиентом разрешенного
    овердрафта, либо при введении нулевого значения.
    Класс должен после каждой операции указывать сумму на счете клиента,
    а также количество операций вложения и количество операций снятия, произведенных клиентом.
 */
public class Task_15_51 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите величину допустимого овердрафта: ");
        double overdraftLimit = scanner.nextDouble();

        System.out.print("Введите сумму на счету клиента: ");
        double accountBalance = scanner.nextDouble();

        int depositCount = 0;
        int withdrawalCount = 0;

        while (true) {
            System.out.print("Введите размер операции (0 для завершения): ");
            double operationAmount = scanner.nextDouble();

            if (operationAmount == 0) {
                break;
            }

            if (operationAmount > 0) {
                accountBalance += operationAmount;
                depositCount++;
            } else {
                if (Math.abs(operationAmount) > accountBalance + overdraftLimit) {
                    System.out.println("Превышен допустимый овердрафт. Операция отклонена.");
                    continue;
                }
                accountBalance += operationAmount;
                withdrawalCount++;
            }

            System.out.println("Сумма на счету: " + accountBalance);
        }

        System.out.println("Сумма на счету клиента: " + accountBalance);
        System.out.println("Количество операций вложения: " + depositCount);
        System.out.println("Количество операций снятия: " + withdrawalCount);
        scanner.close();
    }
}
