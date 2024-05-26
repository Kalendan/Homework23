import java.time.Duration;
import java.time.Instant;

public class Homew23 {
    //домашка на вторник 28.05

    // 1: O(1) вывод константных значений на экран
    // 2: O(1) здесь только условие, оно не учитывается, числа не зависят друг от друга
    // 3: O(n) проход по циклу, линейная зависимость чисел
    // 4: O(n^2) цикл в цикле, O(n)*O(n),
    // 5: O(n) здесь есть линейная зависимость от числа n
    // 6: O(1) прохождение числа  по циклу и вывод на экран 1, где n = 0


    // Домашка на четверг 30.05
    public static void main(String[] args) {
        Instant start = Instant.now();
        int[] array = new int[100];
        for (int j = 0; j < 99; j++) {
            boolean a = false;
            for (int i = 0; i < 99 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    a = true;
                }
            }
            if (!a) {
                break;
            }
            Instant end = Instant.now();
            Duration time = Duration.between(start, end);
            System.out.println(time.toMillisPart());
        }

        long startTime = System.nanoTime();
        for (int j = 0; j < 100; j++) {
            int min = array[j];
            int index = j;

            for (int i = j; i < 100; i++) {
                if (array[i] < min) {
                    min = array[i];
                    index = i;
                }
            }
            int temp = array[j];
            array[j] = array[index];
            array[index] = temp;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration);

        // Возмжности для засечения времени:
        // Instant, Duration, System.nanoTime(), Stopwatch
        // создать переменные для начала и конца кода и после вывести формулу на экран
    }
}



//Домашнее задание на четверг:
//        (Постарайтесь написать код не подглядывая в классную работу)

//        1. Необходимо сгенерировать 100 чисел и положить их в массив
//    2. Самостоятельно отсортировать этот массив:
//        2.1 Один раз сортировкой пузырьком
//    2.2 Один раз - сортировкой выбором

//Доп. задание:

//3.1. Посчитать количество операций в обоих сортировках
//3.2. Самостоятельно понять, как "засекать" время в java и узнать время выполнения обоих сортировок