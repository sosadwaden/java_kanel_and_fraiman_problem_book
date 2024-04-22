package section_15_structure_and_operation_while_loop;

/*
    Задание: Игра в кости проходит по следующим правилам: в каждом «круге» игры
    два игрока бросают каждый по два кубика, на гранях которых - цифры
    от 1 до 6. Игра заканчивается, если хотя бы один из победителей набрал
    больше 100 очков. Если один из игроков набрал больше 100 очков, а
    второй - нет, набравший более 100 объявляется победителем. Если оба
    игрока набрали более 100 очков, объявляется ничья.
    Напишите класс, реализующий модель этой игры и определяющий результат,
    в соответствии с которым на экран выводится текстовое сообщение.
 */
public class Task_15_52 {

    public void action() {
        int player1Score = 0;
        int player2Score = 0;

        while (true) {
            int player1Dice1 = (int) (Math.random() * 6) + 1;
            int player1Dice2 = (int) (Math.random() * 6) + 1;
            player1Score += player1Dice1 + player1Dice2;
            System.out.println("Первый игрок бросает кубики: " + player1Dice1 + " и " + player1Dice2 +
                               ". Текущий счет: " + player1Score);

            int player2Dice1 = (int) (Math.random() * 6) + 1;
            int player2Dice2 = (int) (Math.random() * 6) + 1;
            player2Score += player2Dice1 + player2Dice2;
            System.out.println("Второй игрок бросает кубики: " + player2Dice1 + " и " + player2Dice2 +
                               ". Текущий счет: " + player2Score + "\n");

            if (player1Score >= 100 && player2Score >= 100) {
                System.out.println("Ничья!");
                break;
            } else if (player1Score >= 100) {
                System.out.println("Победил первый игрок!");
                break;
            } else if (player2Score >= 100) {
                System.out.println("Победил второй игрок!");
                break;
            }
        }
    }
}
