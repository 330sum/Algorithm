import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] split = input.split(" ");

        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for (int i = 0; i < n; i++) {
            String input2 = br.readLine();
            String[] split2 = input2.split(" ");
            for (int j = 0; j < split2.length; j++) {
                arr1[i][j] = Integer.parseInt(split2[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            String input2 = br.readLine();
            String[] split2 = input2.split(" ");
            for (int j = 0; j < split2.length; j++) {
                arr2[i][j] = Integer.parseInt(split2[j]);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }

        for (int[] ints : arr1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
