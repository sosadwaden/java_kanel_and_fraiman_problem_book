package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Два человека играют в кости по следующим правилам: в каждом раунде
    игры (а она состоит из 10 раундов) каждый из участников бросает
    «кость» (кубик, на гранях которого значения от 1 до 6). В каждом раунде
    определяется победитель или фиксируется состояние «ничья», в зависимости
    от значения, которое выпало на кубике участника.
    Напишите класс, который моделирует эту игру, указывая для каждого
    раунда, кто из игроков набрал в этом раунде больше очков - или сообщая О СОСТОЯНИИ «НИЧЬЯ».
    ПРИМЕЧАНИЕ: Скорее всего задачу нужно решать именно таким образом (через вызов второго метода)
    потому-что циклы будут далее.
 */
public class Task_10_13 {

    public void action() {
        playRound(1);
        playRound(2);
        playRound(3);
        playRound(4);
        playRound(5);
        playRound(6);
        playRound(7);
        playRound(8);
        playRound(9);
        playRound(10);
    }

    private void playRound(int round) {
        // Бросаем кубики для каждого игрока
        int player1Dice = (int) (Math.random() * 6) + 1;
        int player2Dice = (int) (Math.random() * 6) + 1;

        // Определяем победителя раунда
        if (player1Dice > player2Dice) {
            System.out.println("Раунд " + round + ": Победил игрок 1");
        } else if (player1Dice < player2Dice) {
            System.out.println("Раунд " + round + ": Победил игрок 2");
        } else {
            System.out.println("Раунд " + round + ": Ничья");
        }
    }
}
