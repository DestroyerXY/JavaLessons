package JavaLessons.HomeWork3;

import java.util.ArrayList;
import java.util.Collections;

public class task3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>(); // Создаем список
        list.add(5);
        list.add(10);
        list.add(-3);
        list.add(7);
        
        int min = Collections.min(list); // Находим минимальное, максимальное и среднее арифметическое
        int max = Collections.max(list);
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double avg = sum / list.size();
        
        System.out.println("Минимальное число: " + min);     // Выводим результаты
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее арифметическое: " + avg);
    }
}