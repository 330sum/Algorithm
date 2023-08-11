import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            input[i] = scanner.nextInt();
            input[i] = input[i] * input[i];
        }
        for (int x : input) {
            sum += x;
        }
        System.out.println(sum % 10);
    }
}
