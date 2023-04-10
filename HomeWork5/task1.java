package JavaLessons.HomeWork5;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class task1 {


public static HashMap<String, ArrayList> phoneBook = new HashMap<>();

//Заполнение телефонной книги
public static void addNumber(String name, String number) {
    ArrayList<String> numbers;
    if (phoneBook.containsKey(name)) {
        numbers = phoneBook.get(name);
    } else {
        numbers = new ArrayList<String>();
    }
    numbers.add(number);
    phoneBook.put(name, numbers);
}
//Вывести список телефонов
public static void printAll() {
    for (String name : phoneBook.keySet()) {
        System.out.print(name + ": ");
        ArrayList<String> numbers = phoneBook.get(name);
        for (String number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }
}
//Вывод выбора
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
        System.out.println("Введите 1, чтобы добавить номер, или 2, чтобы вывести всё:");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Введите фамилию:");
            String name = scanner.next();
            System.out.println("Введите номер:");
            String number = scanner.next();
            addNumber(name, number);
        } else if (choice == 2) {
            printAll();
        } else {
            System.out.println("Неверный выбор");
        }
    } while (choice != 2);
}
}