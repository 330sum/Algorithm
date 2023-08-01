import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            String[] split = input.split("");
            for (int j = 0; j < split.length; j++) {
                arr[i][j] = String.valueOf(input.charAt(j));
            }
        }

        String[][] newArr = new String[15][5];

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = arr[j][i];
            }
        }


        for (String[] strings : newArr) {
            for (String string : strings)
                if(string !=null) {
                    System.out.print(string.trim());
                }
        }
    }


}