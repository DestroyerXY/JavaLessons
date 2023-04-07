package JavaLessons.HomeWork4;


// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>(Arrays.asList(1,2,3,4,5)); //создаем список
        System.out.println(ls); // выводим на экран
        System.out.println(reverse(ls)); // выводим на экран перевернутый список
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> ls) {
        LinkedList<Integer> rev_ls = new LinkedList<>(); // создаем новый список
        for(int i=ls.size()-1;i>=0;i--){ 
            rev_ls.add(ls.get(i)); // заносим туда значения в другом порядке
        }
        return rev_ls;

        
    } 

        
}