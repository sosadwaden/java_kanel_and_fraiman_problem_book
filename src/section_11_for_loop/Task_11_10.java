package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран (в одну строку) 19 случайных
    чисел из диапазона «однозначные числа». Каждое значение, равное
    О, следует вывести на экран «В окружении» (вплотную к числу, перед
    ним и после него) символов «%» (процент).
 */
public class Task_11_10 {

    public void action() {
        for (int i = 0; i < 19; i++) {
            int randomNumber = (int) (Math.random() * 10);

            if (randomNumber == 0) {
                System.out.print("%" + randomNumber + "% ");
            } else {
                System.out.print(randomNumber + " ");
            }
        }
    }
}
