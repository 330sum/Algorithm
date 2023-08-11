import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> getDivisor(int n) {
        List<Integer> divisor = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisor.add(i);
            }
        }
        return divisor;
    }

    public static void main(String[] args) throws IOException {
        // n과 k 주어짐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] split = input.split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        // n의 약수를 구한다
        List<Integer> divisor = getDivisor(n);

        // n의 약수 중 k번째를 출력한다
        if (k <= divisor.size()) {
            System.out.println(divisor.get(k - 1));
        } else {
            System.out.println(0);
        }
    }
}
