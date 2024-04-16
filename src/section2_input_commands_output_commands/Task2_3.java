package section2_input_commands_output_commands;

/*
    Задание: Напишите класс, который выводит на экран в первой строке три знака
    «+», во второй - четыре знака«!», в третьей - два знака«?».
*/
public class Task2_3 {

    public void action() {
        System.out.println("+++\n!!!!\n??");

        // ИЛИ

        String plus = "+++";
        String exclamationMark = "!!!!";
        String questionMark = "??";

        System.out.println(plus);
        System.out.println(exclamationMark);
        System.out.println(questionMark);
    }
}
