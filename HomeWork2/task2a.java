package JavaLessons.HomeWork2;

public class task2a {
    public static void main(String[] args) {
        String input = "\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"\n" +
                "\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"";
        
        parseString(input);
    }
    
    public static void parseString(String input) {
        String[] lines = input.split("\n");
        
        for (String line: lines) {
            StringBuilder sb = new StringBuilder();
            String[] pairs = line.split(",");
            
            for (String pair: pairs) {
                String[] keyValue = pair.split(":");
                
                String key = keyValue[0].replaceAll("\"", "");
                String value = keyValue[1].replaceAll("\"", "");
                
                if (key.equals("фамилия")) {
                    sb.append("Студент ").append(value).append(" получил ");
                } else if (key.equals("оценка")) {
                    sb.append(value).append(" по предмету ");
                } else if (key.equals("предмет")) {
                    sb.append(value).append(".");
                }
            }
            
            System.out.println(sb.toString());
        }
    }
}
