package Lesson_4;

/*Напишите метод, на вход которого подаётся двумерный строковый массив размером 4x4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

Далее метод должен пройтись по всем элементам массива, преобразовать их в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось
(например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
MyArrayDataException и вывести результат расчета.*/

public class StringArray {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] array1 = {
                {"1", "a", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        demoArray(array1);

        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "5"}};
        demoArray(array2);

        String[][] array3 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        demoArray(array3);

        String[][] array4 = {
                {"1", "2", "3"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        demoArray(array4);
    }


    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

    public static void demoArray(String[][] array) {
        try {
            stringArray(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void stringArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("В массиве должно быть 4 строки");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Количество столбцов в строчке " + i + " должно быть равно 4");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке {" + i + "} {" + j + "} некорректный символ: " + array[i][j]);
                }
            }
        }
        System.out.println("Общая сумма всех элементов двумерного массива: " + sum);
    }
}
