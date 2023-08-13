import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // 약수구하기
    private static List<Integer> isDivisor(int n) {
        int sum = 0;
        List<Integer> divisor = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                divisor.add(i);
            }
        }
        return divisor;
    }

    // 완전수 확인
    private static void perfectNum(int n, List<Integer> divisor) {
        int sum = 0;
        for (int x : divisor) {
            sum += x;
        }
        System.out.print(n);
        if (sum == n) {
            System.out.print(" = ");
            for (int i = 0; i < divisor.size(); i++) {
                System.out.print(divisor.get(i));
                if (i < divisor.size() - 1) {
                    System.out.print(" + ");
                }
            }
            System.out.println();
        } else {
            System.out.println(" is NOT perfect.");
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (n != -1) {
            n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            List<Integer> divisor = isDivisor(n);
            perfectNum(n, divisor);
        }


    }

}
