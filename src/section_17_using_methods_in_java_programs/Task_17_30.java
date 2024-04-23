package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра два целых
    положительных числа (N и М, можно исходить из предположения, что M > N).
    Метод возвращает, имеющее самое большое число делителей, число из диапазона N...М.
 */
public class Task_17_30 {

    public int method(int N, int M) {
        int countMax = 0;
        int numberMax = 0;

        for (int i = N; i <= M; i++) {
            int count = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count > countMax) {
                countMax = count;
                numberMax = i;
            }
        }
        return numberMax;
    }
}
