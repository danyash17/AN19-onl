package artem.homework.hw6.t2;

    /*Класс RAM имеет поля "название" и "объем".*/

public class MemoryRAM {
    private String title;
    private int volume;

    public MemoryRAM() {
        this.title = "DDR3";
        this.volume = 128;
    }

    public MemoryRAM(String title, int volume) {
        this.title = title;
        this.volume = volume;
    }

    public void showRamInfo() {
        System.out.println("Memory Title: " + this.title);
        System.out.println("Memory Volume: " + this.volume);
        System.out.println("***************************");
    }
}
