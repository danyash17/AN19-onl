package NikitaZhelezko;

public class Fibbanachi {
    public static void main(String[] args){
        int x0 = 0;
        int x1 = 1;
        int step;
        System.out.println("Число 1: " + x0);
        System.out.println("Число 2: " + x1);
        for(int i=3; i<=11; i++){
            step = x1 + x0;
            x0 = x1;
            x1 = step;
            System.out.println("Число "+ i + ": " + step);
        }
    }
}
