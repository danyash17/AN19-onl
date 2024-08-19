package ivan_m;

public class Optional1 {
    public static void main(String[] args) {
        int first = 1, second = 1, sum = 0;
        System.out.print(first + " " + second + " ");

        for (int i = 3; i < 12; i++)
        {
            sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
        }
    }
}
