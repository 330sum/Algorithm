import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pay = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a * b;
            total += sum;
        }
        
        if (pay == total) System.out.println("Yes");
        else System.out.println("No");
    }
}