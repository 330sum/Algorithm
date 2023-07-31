import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 5
        int M = scanner.nextInt(); // 4

        // 바구니
        int[] basket = new int[N + 1]; // 0 1 2 3 4 5
        // 공
        for (int i = 0; i < basket.length; i++) { // 0 1 2 3 4 5
            basket[i] = i;
        }

        // M번 바꾼다
        for (int x = 0; x < M; x++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        for (int i = 1; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }


    }
}