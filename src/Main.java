public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1: ");
        int[] a = {1, 2, 3};
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {123, 234, 345, 456, 567, 678, 789, 890, 901};

    }

    public static void task2() {
        System.out.println("Задача 2: ");
        int[] a = {1, 2, 3};
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {123, 234, 345, 456, 567, 678, 789, 890, 901};

        // Задаем значение последнего индекса массива:
        int aLastIndex = a.length - 1;
        int bLastIndex = b.length - 1;
        int cLastIndex = c.length - 1;

        for (int i = 0; i <= a.length; i++) {
            if (i == aLastIndex) {
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }
        for (int i = 0; i <= b.length; i++) {
            if (i == bLastIndex) {
                System.out.println(b[i]);
                break;
            }
            System.out.print(b[i] + ", ");
        }
        for (int i = 0; i <= c.length; i++) {
            if (i == cLastIndex) {
                System.out.println(c[i]);
                break;
            }
            System.out.print(c[i] + ", ");
        }

    }

    public static void task3() {
        System.out.println("Задача 3: ");
        int[] a = new int[]{1, 2, 3};
        double[] b = new double[]{1.57, 7.654, 9.986};
        int[] c = new int[]{123, 234, 345, 456, 567, 678, 789, 890, 901};

        // Задаем значение последнего индекса массива:

        int aLastIndex = a.length - 1;
        int bLastIndex = b.length - 1;
        int cLastIndex = c.length - 1;
        //Вывод элементов в строку:
        for (int i = aLastIndex; i >= 0; i--) {
            if (i == 0) {
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }
        for (int i = bLastIndex; i >= 0; i--) {
            if (i == 0) {
                System.out.println(b[i]);
                break;
            }
            System.out.print(b[i] + ", ");
        }
        for (int i = cLastIndex; i >= 0; i--) {
            if (i == 0) {
                System.out.println(c[i]);
                break;
            }
            System.out.print(c[i] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4: ");
        int[] a = {1, 2, 3};
        int aLastIndex = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (i == aLastIndex && a[i] % 2 == 0) {
                System.out.println(a[i]);
                break;
            } else if (i == aLastIndex && a[i] % 2 != 0) {
                System.out.println(a[i] + 1);
                break;
            } else if (a[i] % 2 != 0) {
                System.out.print((a[i] + 1) + ", ");
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5: ");
        int[] salary = generateRandomArray();
        int sum = 0;
        for (int j : salary) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task6() {
        System.out.println("Задача 6: ");
        int[] salary = generateRandomArray();
        int min = 200_001;
        int max = -1;
        for (int j : salary) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task7() {
        System.out.println("Задача 7: ");
        int[] salary = generateRandomArray();
        float sum = 0;
        int days = 30;
        for (int j : salary) {
            sum += j;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / days + " рублей.");
    }

    public static void task8() {
        System.out.println("Задача 8: ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[reverseFullName.length - 1 - i]);
        }
    }
}
