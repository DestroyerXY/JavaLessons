package JavaLessons.HomeWork3;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

// import java.util.*;

//         public class task2 {
//             public static void main(String[] args) {
//             List numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//             System.out.println("Исходный список: " + numbers);
//             // Удаление четных чисел из списка
//                 numbers.removeIf(n -> n % 2 == 0);
//                 System.out.println("Список без четных чисел: " + numbers);
// }
// }    - надо дорешать
    

import java.util.ArrayList;

public class task2 {
   public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>(); //  Создаём список целых чисел numbers и добавляем в него произвольные значения.
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.add(4);
      numbers.add(5);
      numbers.add(6);
      numbers.add(7);
      numbers.add(8);
      numbers.add(9);

      System.out.println(numbers);
      
      for (int i = 0; i < numbers.size(); i++) { // Используем цикл for для перебора каждого элемента списка numbers.
         if (numbers.get(i) % 2 == 0) {  // Внутри цикла проверяем, является ли текущее значение чётным числом.
            numbers.remove(i); 
            i--;   // Если текущее значение чётное, то удаляем его из списка с помощью метода remove() и уменьшаем переменную i на единицу, чтобы перейти к следующему элементу списка.
         }
      }
      
      System.out.println(numbers);
   }
}
 // - рабочий код