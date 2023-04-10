package JavaLessons.HomeWork5;


public class task3 {
    static int N = 8;
    static int[][] board = new int[N][N];

    // функция для вывода шахматной доски на экран
    static void printSolution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // функция для проверки, может ли ферзь быть размещен в клетке (row,col)
    static boolean isSafe(int row, int col) {
        int i, j;

        // проверяем строку слева от текущей клетки
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // проверяем диагонали сверху слева от текущей клетки
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // проверяем диагонали снизу слева от текущей клетки
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        // если никакая ферзь не находится на пути, то клетка безопасна
        return true;
    }

    // функция для размещения ферзя на доске
    static boolean solveNQueens(int col) {
        // если все ферзи размещены, то задача решена
        if (col >= N)
            return true;

        // для каждой строки пытаемся разместить ферзя в текущей колонке
        for (int i = 0; i < N; i++) {
            if (isSafe(i, col)) {
                board[i][col] = 1; // размещение ферзя на борду
                if (solveNQueens(col + 1))   // рекурсивный вызов для размещения оставшихся ферзей
                    return true;
                board[i][col] = 0; // отмена размещения ферзя
            }
        }

        // если ферзь не может быть размещен в текущей колонке, возвращаем false
        return false;
    }

    // функция main
    public static void main(String[] args) {
        if (solveNQueens(0))    // проверяем, удалось ли разместить ферзей на доске
            printSolution();    // если удалось, выводим доску в консоль
        else
            System.out.println("Решение не найдено");
    }
}