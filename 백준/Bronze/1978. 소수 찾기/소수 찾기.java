import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println(numberOfPrimes(num));
    }

    private static int numberOfPrimes(int[] num) {
        int answer = 0;
        for (int x : num) {
            boolean prime = isPrime(x);
            if (prime) answer++;
        }
        return answer;
    }

    private static boolean isPrime(int n) {
        if (n == 1) return false;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
}