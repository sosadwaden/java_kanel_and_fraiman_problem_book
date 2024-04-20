package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран (в одну строку) 20 случайных
    чисел из диапазона 27...73. Перед каждым значением, делящимся на 3
    без остатка, следует вывести (вплотную к числу) символ «#» (решетка).
 */
public class Task_11_9 {

    public void action() {
        for (int i = 0; i < 20; i++) {
            int randomNumber = (int) (Math.random() * 47) + 27;

            if (randomNumber % 3 == 0) {
                System.out.print("#");
            }

            System.out.print(randomNumber);

            if (i < 19) {
                System.out.print(" ");
            }
        }
    }
}
