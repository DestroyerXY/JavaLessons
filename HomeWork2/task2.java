package JavaLessons.HomeWork2;

// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {
public static void main(String[] args) {
try {
File file = new File("students.txt"); // путь до файла
Scanner scanner = new Scanner(file);
while (scanner.hasNextLine()) {
String line = scanner.nextLine();
String[] parts = line.split(",");
String surname = parts[0].split(":")[1].replace("", "");
String mark = parts[1].split(":")[1].replace("", "");
String subject = parts[2].split(":")[1].replace("", "");
StringBuilder sb = new StringBuilder();
sb.append("Студент ").append(surname).append(" получил ").append(mark).append(" по предмету ").append(subject).append(".");
System.out.println(sb.toString());
}
scanner.close();
} catch (FileNotFoundException e) {
System.out.println("Файл не найден.");
}
}
}












