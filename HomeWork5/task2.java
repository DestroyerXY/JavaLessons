package JavaLessons.HomeWork5;
// // Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;

public class task2 {
public static void main(String[] args) {
List employees = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
"Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
"Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
"Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));

Map<String, Integer> nameCount = new HashMap<>();
for (Object employeeObject : employees) { // пройти по всем сотрудникам
    String employee = (String) employeeObject; // привести к типу String
    String firstName = employee.split(" ")[0]; // получить первое имя
    nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1); // добавить счетчик
    }

    List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCount.entrySet()); // перевести map в list
    Collections.sort(sortedNames, (a, b) -> b.getValue().compareTo(a.getValue())); // сортировка по количеству в порядке убывания

    for (Map.Entry<String, Integer> name : sortedNames) {
        if (name.getValue() > 1) { // выводится только в том случае, если количество больше 1
            System.out.println(name.getKey() + ": " + name.getValue());
        }
    }
}
}