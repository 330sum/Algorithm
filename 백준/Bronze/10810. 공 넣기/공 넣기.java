import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 바구니
        int[] basket = new int[N + 1]; // 0 1 2 3 4 5

        // 반복횟수
        for (int x = 0; x < M; x++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            for (int y = i; y <= j; y++) {
                basket[y] = k;
            }
        }

        int[] result = new int[N];
        for (int i = 0; i < result.length; i++) {
            result[i] = basket[i + 1];
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}