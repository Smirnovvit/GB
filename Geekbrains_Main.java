package Geekbrains;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	/*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
	Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
	Посчитать сколько раз встречается каждое слово.*/

        String[] words = {
                "boll", "table", "chair", "window",
                "boll", "door", "sky", "soap",
                "window", "leg", "paint", "boll",
                "color", "chair", "chalk", "shop",
                "step", "nose", "boll", "rose"
        };
        // Выводим все уникальные слова из массива
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println(uniqueWords);

        // Считаем повторы слов в массиве
        Map<String, Integer> hm = new HashMap<>();
        for (String word : words) { // с помощью цикла foreach перебираем поочередно элементы массива
            hm.put(word, hm.getOrDefault(word, 0) + 1); // добавляем элементы и считаем их количество
            }
        System.out.println(hm);


    }
}
