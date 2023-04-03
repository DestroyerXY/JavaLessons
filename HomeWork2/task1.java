package JavaLessons.HomeWork2;


// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task1 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 7, 2, 1, 4};
        Logger logger = Logger.getLogger("BubbleSort");
        try {
            FileHandler handler = new FileHandler("log.txt");
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Can't create log file", e);
        }
        logger.info("Initial array: " + Arrays.toString(array));
        boolean swapped = true;
        int j = 0;
        while (swapped) {
            logger.info("Iteration " + j);
            swapped = false;
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                    logger.info(Arrays.toString(array));
                }
            }
            j++;
        }
        logger.info("Sorted array: " + Arrays.toString(array));
    }
}