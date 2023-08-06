import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();

            String[] split = input.split(" ");
            int firstNum = Integer.parseInt(split[0]);
            int secondNum = Integer.parseInt(split[1]);

            if (firstNum == secondNum) break;

            if (secondNum % firstNum == 0) {
                System.out.println("factor");
            } else if (firstNum % secondNum == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }

    }
}