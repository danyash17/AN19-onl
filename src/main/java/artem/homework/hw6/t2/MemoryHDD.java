package artem.homework.hw6.t2;

    /*Класс HDD имеет поля "название", "объем" и "тип" (внешний или
    внутренний).*/

public class MemoryHDD {

    private String title;
    private int volume;
    private String memoryType;

    public MemoryHDD() {
        this.title = "HDD";
        this.volume = 512;
        this.memoryType = "Internal";
    }

    public MemoryHDD(String title, int volume, String memoryType) {
        this.title = title;
        this.volume = volume;
        this.memoryType = memoryType;
    }

    public void showHddInfo() {
        System.out.println("HDD Memory Title: " + this.title);
        System.out.println("HDD Memory Volume: " + this.volume);
        System.out.println("HDD Memory Type: " + this.memoryType);
        System.out.println("***************************");
    }
}
