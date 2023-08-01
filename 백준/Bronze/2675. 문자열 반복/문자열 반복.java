
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt(); //3
            String str = scanner.next(); // ABC

            // AAABBBCCC
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }

    }
}