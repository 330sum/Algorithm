import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int x = num2 % 10;
        int y = (num2 / 10) % 10;
        int z = num2 / 100;

        int num3 = num1 * x;
        int num4 = num1 * y;
        int num5 = num1 * z;

        int num6 = num1 * num2;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

        sc.close();
    }
}