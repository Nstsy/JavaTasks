/*1. Создать массив с набором слов (10-20 слов, должны встречаться
повторяющиеся). Найти и вывести список уникальных слов, из
которых состоит массив (дубликаты не считаем). Посчитать,
сколько раз встречается каждое слово. (реализовать с
использованием коллекций)*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Array {
    public static void main(String[] args) {
        // Создаем массив слов и выводим в консоль
        String[] arrayWords = {"Hello", "Goodbye", "hi", "name", "hello", "word", "hi", "sun", "sky", "mother", "it", "sun"};
        for (String word : arrayWords) {
            System.out.print(" " + word);
        }
        System.out.println();

        // Создаем HashSet для хранения уникальных слов, приводим слова к нижнему регистру и выводим в консоль в виде списка
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : arrayWords) {
            uniqueWords.add(word.toLowerCase());
        }
        List<String> uniqueWordsList = new ArrayList<>(uniqueWords);
        System.out.println("Уникальные слова: " + uniqueWordsList);

        // Создаем Map для слов
        Map<String, Integer> wordCount = new HashMap<>();
        for (int i = 0; i < arrayWords.length; ++i) {
            wordCount.put(arrayWords[i].toLowerCase(), wordCount.getOrDefault(arrayWords[i].toLowerCase(), 0) + 1);
        }
        System.out.println("Сколько раз встречается каждое уникальное слово " + wordCount);
    }
}
