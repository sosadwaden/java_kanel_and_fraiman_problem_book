package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Напишите класс, который генерирует длины сторон катетов прямоугольного
    треугольника так, чтобы длина катета не превышала 10.5 см.
    Класс должен подсчитать длину гипотенузы этого треугольника, его
    площадь и периметр и вывести их на экран.
    Затем эти вычисленные значения следует округлить и вывести результат
    на экран в отдельной строке вместе с соответствующим текстовым сообщением.
 */
public class Task_10_17 {

    public void action() {
        double leg1 = Math.random() * 10.5;
        double leg2 = Math.random() * 10.5;

        double hypotenuse = Math.sqrt(leg1 * leg1 + leg2 * leg2);
        double area = 0.5 * leg1 * leg2;
        double perimeter = leg1 + leg2 + hypotenuse;

        long roundedHypotenuse = Math.round(hypotenuse);
        long roundedArea = Math.round(area);
        long roundedPerimeter = Math.round(perimeter);

        System.out.println("Длина катета 1: " + leg1 + " см");
        System.out.println("Длина катета 2: " + leg2 + " см");
        System.out.println("Длина гипотенузы: " + hypotenuse + " см");
        System.out.println("Площадь: " + area + " кв. см");
        System.out.println("Периметр: " + perimeter + " см");

        System.out.println("Округленная длина гипотенузы: " + roundedHypotenuse + " см");
        System.out.println("Округленная площадь: " + roundedArea + " кв. см");
        System.out.println("Округленный периметр: " + roundedPerimeter + " см");
    }
}
