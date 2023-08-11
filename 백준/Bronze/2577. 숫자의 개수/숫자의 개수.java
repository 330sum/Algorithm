import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int mul = a * b * c;
        String str = String.valueOf(mul);
        int[] count = new int[10];
        for (char x : str.toCharArray()) { // 1 7 0
//            System.out.println((int) x - 48);
            for (int i = 0; i <= 9; i++) {
                if ((int) x - 48 == i) {
//                    System.out.println(x+"--------");
                    count[i]++;
//                    System.out.println("count = " + count[i]);
                }
            }
        }

        for (int x : count) {
            System.out.println(x);
        }
    }
}