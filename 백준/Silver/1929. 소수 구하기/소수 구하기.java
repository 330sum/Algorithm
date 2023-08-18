import java.io.IOException;
import java.util.Scanner;

public class Main {
    private void prime(int m, int n) {
        int[] prime = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            prime[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 0) continue;
            for (int j = 2 * i; j <= n; j += i) prime[j] = 0;
        }
        for (int i = m; i <= n; i++) {
            if (prime[i] != 0) System.out.println(i);
        }

    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        main.prime(m, n);
    }

}
