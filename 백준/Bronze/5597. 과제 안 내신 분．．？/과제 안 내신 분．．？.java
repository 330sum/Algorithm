import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] stuNum = new int[31];
        for (int i = 1; i < 29; i++) {
            int submit = sc.nextInt();
            stuNum[submit] = 1;
        }
        for (int i = 1; i < stuNum.length; i++) {
            if (stuNum[i] != 1) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}