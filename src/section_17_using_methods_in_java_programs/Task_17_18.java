package section_17_using_methods_in_java_programs;

/*
    Задание: Назовем «большим обменом» операцию, при которой два числа «обмениваются»
    своими левыми цифрами.
    1. Напишите класс, который принимает с клавиатуры два трехзначных
       положительных числа и совершает над ними операцию «обмена».
    2. Напишите класс, который принимает с клавиатуры два целых положительных
       числа и совершает над ними операцию «обмена».
 */
public class Task_17_18 {

    public void method1(int number1, int number2) {
        int firstDigit1 = number1 / 100;
        int lastDigits1 = number1 % 100;
        int firstDigit2 = number2 / 100;
        int lastDigits2 = number2 % 100;

        int newNumber1 = firstDigit1 * 100 + lastDigits2;
        int newNumber2 = firstDigit2 * 100 + lastDigits1;

        System.out.println(newNumber1);
        System.out.println(newNumber2);
    }

    public void method2(int number1, int number2) {
        int numberLength1 = String.valueOf(number1).length();
        int numberLength2 = String.valueOf(number2).length();
        int divider1 = (int) Math.pow(10, numberLength1 - 1);
        int divider2 = (int) Math.pow(10, numberLength2 - 1);

        int firstDigit1 = number1 / divider1;
        int lastDigits1 = number1 % divider1;
        int firstDigit2 = number2 / divider2;
        int lastDigits2 = number2 % divider2;

        int newNumber1 = firstDigit2 * divider1 + lastDigits1;
        int newNumber2 = firstDigit1 * divider2 + lastDigits2;

        System.out.println(newNumber1);
        System.out.println(newNumber2);
    }
}
