package JavaLessons.HomeWork4;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->


import java.util.Scanner;

public class task3 {
    static int Number() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    static String Operations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;
    }

    static int Result(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = Number();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = Operations();
        System.out.println("Введите второе число: ");
        int num2 = Number();
        int result = Result(operations, num1, num2);
        if (result == -1) {
            System.out.println(" Операция удалена");
        } else {
            System.out.printf("%d %s %d = %d", num1, operations, num2, result);
        }
    }
    }
