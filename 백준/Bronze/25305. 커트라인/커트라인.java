import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    private void answer(Integer[] scores, int k) {
        Arrays.sort(scores, Collections.reverseOrder());
        System.out.println(scores[k - 1]);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        Integer[] scores = new Integer[n];
        String[] scoreStrings = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(scoreStrings[i]);
        }
        main.answer(scores, k);
    }

}
