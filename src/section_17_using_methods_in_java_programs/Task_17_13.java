package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра два целых
    числа и возвращает значение true, если в числах одинаковое количество
    цифр; в ином случае метод возвращает значение false.
 */
public class Task_17_13 {

    public boolean method(int number1, int number2) {
        return String.valueOf(number1).length() == String.valueOf(number2).length();
    }
}
