package JavaLessons.HomeWork1;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = sc.nextInt();
        System.out.printf("N-yгольное число: %d\n", nNumber(i));
        System.out.printf("Факториал числa: %d\n", FactorialNumber(i));
        sc.close();
    }

    public static int nNumber(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int FactorialNumber(int a){
        int result = 1;
        for (int i = 1; i <= a; i++){
            result *= i;
        }
        return (result);
    }
}


