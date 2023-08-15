import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private void getPrime(int m, int n) {
        int[] prime = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 0) continue;
            for (int j = 2 * i; j <= n; j += i) prime[j] = 0;
        }

        List<Integer> primeList = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (prime[i] != 0) primeList.add(i);
        }

        int sum = 0;
        for (int x : primeList) {
            sum += x;
        }

        if (primeList.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(primeList.get(0));
        }

    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        main.getPrime(m, n);

    }


}
