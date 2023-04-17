package JavaLessons.attestationwork;


// // Класс NoteBook:

// public class attestationwork { private int ram; private int hddSize; private String os; private String color;

// public NoteBook(int ram, int hddSize, String os, String color) { 
//     this.ram = ram; this.hddSize = hddSize; this.os = os; this.color = color; } 
//     public int getRam() { return ram; } public int getHddSize() { return hddSize; } 
//     public String getOs() { return os; } public String getColor() { return color; }
// }

// // Код для создания нескольких ноутбуков:

// NoteBook notebook1 = new NoteBook(8, 1000, "Windows 10", "Black"); 
// NoteBook notebook2 = new NoteBook(16, 500, "MacOS", "Silver"); 
// NoteBook notebook3 = new NoteBook(4, 500, "Windows 7", "Black"); 
// NoteBook notebook4 = new NoteBook(8, 1000, "Linux", "Red"); 
// NoteBook notebook5 = new NoteBook(8, 500, "Windows 10", "White");

// Метод для фильтрации списка ноутбуков по критериям:

// public static List filterNoteBooks(List notebooks, Map<String, Object> filters) { List filteredNotebooks = new ArrayList<>(); for (NoteBook notebook : notebooks) { boolean passRam = true; boolean passHddSize = true; boolean passOs = true; boolean passColor = true;

// csharpCopy code

// if (filters.containsKey("ram")) { int minRam = (int) filters.get("ram"); if (notebook.getRam() < minRam) { passRam = false; } } if (filters.containsKey("hddSize")) { int minHddSize = (int) filters.get("hddSize"); if (notebook.getHddSize() < minHddSize) { passHddSize = false; } } if (filters.containsKey("os")) { String os = (String) filters.get("os"); if (!notebook.getOs().equals(os)) { passOs = false; } } if (filters.containsKey("color")) { String color = (String) filters.get("color"); if (!notebook.getColor().equals(color)) { passColor = false; } } if (passRam && passHddSize && passOs && passColor) { filteredNotebooks.add(notebook); } } return filteredNotebooks;

// }

// // Код для запроса критериев у пользователя и вывода подходящих ноутбуков:

// Scanner scanner = new Scanner(System.in); Map<String, Object> filters = new HashMap<>();

// System.out.println("Введите цифру, соответствующую необходимому критерию: "); System.out.println("1 - ОЗУ"); System.out.println("2 - Объем ЖД"); System.out.println("3 - Операционная система"); System.out.println("4 - Цвет");

// int criterion = scanner.nextInt(); switch (criterion) { case 1: System.out.println("Введите минимальный объем ОЗУ: "); int minRam = scanner.nextInt(); filters.put("ram", minRam); break; case 2: System.out.println("Введите минимальный объем ЖД: "); int minHddSize = scanner.nextInt(); filters.put("hddSize", minHddSize); break; case 3: System.out.println("Введите операционную систему: "); String os = scanner.next(); filters.put("os", os); break; case 4: System.out.println("Введите цвет: "); String color = scanner.next(); filters.put("color", color); break; }

// List filteredNotebooks = filterNoteBooks(Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5), filters);

// System.out.println("Подходящие ноутбуки: "); for (NoteBook notebook : filteredNotebooks) { System.out.println("ОЗУ: " + notebook.getRam() + " ГБ, Объем ЖД: " + notebook.getHddSize() + " ГБ, ОС: " + notebook.getOs() + ", Цвет: " + notebook.getColor()); }

public class attestationwork{
    private String color;
    private Integer RAM;
    private String OS;
    private Integer HDD;
    private Integer id;
    private String brand;
    private String model;
    private boolean isBooked = false;

    public void laptop(String model,Integer id, String brand){
        this.model = model;
        this.brand = brand;
        this.id = id;
        System.out.println("Ноутбук марки "+"'"+ this.brand+"'"+" Модель "+this.model+" С id " +Integer.toString(this.id));
    }
    public String getColor(){
        return this.color;
    }
    public Integer getRAM(){
        return this.RAM;
    }
    public String getOS(){
        return this.OS;
    }
    public Integer getHDD(){
        return this.HDD;
    }
    public Integer getid(){
        return this.id;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public Boolean getBooking(){
        return this.isBooked;
    }
    public void setColor(String color){
        this.color =color;
    }
    public void setRAM(Integer RAM){
        this.RAM = RAM;
    }
    public void setOS(String OS){
        this.OS = OS;
    }
    public void setHDD(Integer HDD){
        this.HDD = HDD;
    }
    public void Book(){
        if (isBooked==false){
            this.isBooked=true;
        }
        else System.out.println("Этот ноутбук уже зарезервирован");
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.id);
        sb.append(System.lineSeparator());
        sb.append(this.color);
        sb.append(" ");
        sb.append(this.brand);
        sb.append(" ");
        sb.append(this.model);
        sb.append(System.lineSeparator());
        sb.append("OS "+this.OS);
        sb.append(System.lineSeparator());
        sb.append("HDD "+this.HDD);
        sb.append(System.lineSeparator());
        sb.append("RAM "+this.RAM);
        sb.append(System.lineSeparator());
        if(this.isBooked==false) sb.append("Не зарезервирован");
        else sb.append("Зарезервирован");

        
        return(sb.toString());
    }

    

}