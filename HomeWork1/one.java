package JavaLessons.HomeWork1;

import java.util.Scanner;

import javax.xml.transform.Source;

/**
 * 1
 */

public class one {

    public static void main(String[] args) { //это функция
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in); //строчка создания объекта
        String name = sc.nextLine();
        int age = sc.nextInt(); //Берет только числа
        System.out.println(age);
        System.out.println(name);
        sc.close();
    }

    
}