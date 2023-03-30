package JavaLessons.HomeWork1;

// Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        int max = 1000;
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= max; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println(primes);
    }
}

