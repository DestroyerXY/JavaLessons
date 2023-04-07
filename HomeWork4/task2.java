package JavaLessons.HomeWork4;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> lili = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(lili, getRandomNumber()); //заполняем случайными числами
        }
        System.out.println(lili);
        
        System.out.println(first(lili)); // вывели первый элемент
        System.out.println(lili); 

        System.out.println(dequeue(lili)); // удалили первый элемент
        System.out.println(lili);
    }

    public static void enqueue(LinkedList<Integer> lili, int num) {// помещает элемент в конец очереди
        lili.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> lili) { // возвращает первый элемент из очереди и удаляет его
        int num = lili.get(0);
        lili.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> lili) { // возвращает первый элемент из очереди, не удаляя
        int num = lili.get(0);
        return num;
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}