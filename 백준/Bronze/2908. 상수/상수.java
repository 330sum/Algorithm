import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] split = input.split(" ");

        String[] arr = new String[split.length];
        // 역순으로 변경
        for (int i = 0; i < split.length; i++) {
            arr[i] = new StringBuffer(split[i]).reverse().toString();
        }

        // 대소비교
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < Integer.parseInt(arr[i])) {
                max = Integer.parseInt(arr[i]);
            }
        }
        System.out.println(max);


    }
}
