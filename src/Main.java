import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {20_000, 30_000, 40_000, 50_000, 60_000};
        int i;
        int a = 0;
        for (i = 0; arr.length > i; i++) {
            a += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + a + " рублей");


        int[] arr1 = {20_000, 30_000, 40_000, 50_000, 60_000};
        int max = 0;
        int min = arr1[0];
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }

            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        int[] arr2 = {20_000, 30_000, 40_000, 50_000, 60_000};
        double result = 0;
        double kolNed = 4;
        for (i = 0; i < arr1.length; i++) {
            result += arr2[i];
        }
        result /= kolNed;
        System.out.println("Средняя сумма трат за месяц составила " + result + " рублей");


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (i = reverseFullName.length; i > 0; i--) {
            System.out.println(reverseFullName[i - 1]);

        }
    }
}