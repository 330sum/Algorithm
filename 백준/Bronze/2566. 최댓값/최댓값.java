import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];
        for (int i = 0; i < arr.length; i++) {
            String input = br.readLine();
            String[] split = input.split(" ");
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(split[j]);
            }
        }

        int max = 0;
        int row = 0;
        int column = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((row + 1) + " " + (column + 1));

    }
}
