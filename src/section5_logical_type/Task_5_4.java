package section5_logical_type;

public class Task_5_4 {

    public void action() {
        /*
            Задание: Дано логическое выражение:
            (z > x) || (x < 0) && (z - y > 9)
            Чему равно значение этого выражения для следующих значений переменных:
            x = -2; y = 5 ; z = 13
            ------------------------------------------------------------------------------------------
            Ответ будет true, пояснение:
            1. (13 > -2) || (-2 < 0) && (13 - 5 > 9)
            2. true || true && false
               У операции && выше приоритет, чем ||, поэтому:
            3. true || false
               true
         */
    }
}
