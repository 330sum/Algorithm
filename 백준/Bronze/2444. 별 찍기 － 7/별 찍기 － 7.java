import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//
//        System.out.println("n = " + n);

        // 2 * n - 1
//        int n = 5;

        int start = 0;
        int end = (2 * n - 1) - 1;
        String[] arr = new String[2 * n - 1];
        Arrays.fill(arr, "");


        for (int i = 1; i < n; i++) {

            for (int j = n - i; j > 0; j--) {
                arr[start] += " ";
                arr[end] += " ";
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                arr[start] += "*";
                arr[end] += "*";
            }
            start++;
            end--;
        }

        for (int i = 0; i < 2 * n - 1; i++) {
            arr[n - 1] += "*";
        }

        for (String string : arr) {
            System.out.println(string);
        }


    }
}
