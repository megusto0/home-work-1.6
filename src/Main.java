public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        //Задание 1
        int mounthPayment = 0;
        for (int i: arr) {
            mounthPayment += i;
        }
        System.out.println("Сумма трат составила " + mounthPayment + " рублей");

        //Задание 2
        int minimal = 200000, maximal = 0;
        for (int i: arr) {
            if (i > maximal) maximal = i;
            if (i < minimal) minimal = i;
        }
        System.out.println("Минимальная сумма трат за день составила " + minimal + " рублей. Максимальная сумма трат за день составила " + maximal + " рублей");

        //Задание 3
        double avgPayment = mounthPayment / 30.0;
        System.out.printf("Средняя сумма трат за месяц составила %.2f", avgPayment);
        System.out.println(" рублей");

        //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; --i) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

