package JavaLessons.HomeWork1;

// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// под знаками вопроса - одинаковые цифра
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69



public class task4 {

    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";
        for (int i = 1; i < 10; i++) { // перебираем возможные замены цифр
        for (int j = 1; j < 10; j++) {
        String replaced = equation.replace("?", Integer.toString(i));
        replaced = replaced.replaceFirst("?", Integer.toString(j)); // заменяем только первый вопросительный знак
        if (isValid(replaced)) {
        System.out.println(replaced); // выводим верное равенство
        return;
        }
        }
        }
        System.out.println("Решений нет");
        }
        
        public static boolean isValid(String equation) {
        String[] parts = equation.split(" = ");
        if (parts.length != 2) {
        return false;
        }
        String[] left = parts[0].split(" + ");
        if (left.length != 2) {
        return false;
        }
        for (String s : left) {
            if (s.contains("?")) {
        return false;
        }
        }
        try {
        int q = Integer.parseInt(left[0]);
        int w = Integer.parseInt(left[1]);
        int e = Integer.parseInt(parts[1]);
        return q + w == e;
        } catch (NumberFormatException e) {
        return false;
        }
        }
}
