package lesson_1;

public class JavaTasks {

    public static void main(String[] args) {
        System.out.println("\nTask 1:");
        printThreeWords();

        System.out.println("\nTask 2:");
        checkSumSign();

        System.out.println("\nTask 3:");
        printColor();

        System.out.println("\nTask 4:");
        compareNumbers();

        System.out.println("\nTask 5:");
        System.out.println(isTheSumLieWithin(3, 10));
        System.out.println(isTheSumLieWithin(5, 5));
        System.out.println(isTheSumLieWithin(19, 2));
        System.out.println(isTheSumLieWithin(6, 14));

        System.out.println("\nTask 6:");
        printIsNumberPositive(5);
        printIsNumberPositive(-100);
        printIsNumberPositive(0);

        System.out.println("\nTask 7:");
        System.out.println(isNumberPositive(7));
        System.out.println(isNumberPositive(-9));
        System.out.println(isNumberPositive(0));

        System.out.println("\nTask 8:");
        printString("Hello", 7);

        System.out.println("\nTask 9:");
        System.out.println(isItLeapYear(2014));
        System.out.println(isItLeapYear(2024));
        System.out.println(isItLeapYear(200));
        System.out.println(isItLeapYear(800));

        System.out.println("\nTask 10:");
        int[] array = {0, 0, 0, 1, 1, 1};
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : replacingNumbers(array)) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("\nTask 11:");
        int[] arrayOneHundred = new int[100];
        arrayOneHundred(arrayOneHundred);

        System.out.println("\nTask 12:");
        int[] arraySix = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int number : arraySix) {
            System.out.print(number + " ");
        }
        System.out.println();
        arraySix(arraySix);

        System.out.println("\nTask 13:");
        int[][] twoArray = twoArray(9);
        for (int[] number : twoArray) {
            for (int numb : number) {
                System.out.print(numb + " ");
            }
            System.out.println();
        }

        System.out.println("\nTask 14:");
        int[] arrayValue = array(9, 2);
        for (int number : arrayValue) {
            System.out.print(number + " ");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 4;
        int b = 9;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 8;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 9;
        int b = -6;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isTheSumLieWithin(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void printIsNumberPositive(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNumberPositive(int a) {
        return a >= 0;
    }

    public static void printString(String string, int numberOfTimes) {
        for (int i = 1; i <= numberOfTimes; i++) {
            System.out.println(string);
        }
    }

    public static boolean isItLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public static int[] replacingNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    public static void arrayOneHundred(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int numbers : array) {
            System.out.print(numbers + " ");
        }
        System.out.println();
    }

    public static void arraySix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int[][] twoArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
        return array;
    }

    public static int[] array(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
