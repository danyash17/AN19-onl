package EugeneFrost.lesson3;

public class extra_task_1 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");

        for (int i=0; i<9; i++){
            int count = b;
            b +=a;
            a=count;
            System.out.print(b+" ");
        }
    }
}
