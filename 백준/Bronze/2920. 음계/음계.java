import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String asc = "12345678";
        String des = "87654321";

        String input = br.readLine();
        input = input.replace(" ", "");

        if (input.equals(asc)) {
            System.out.println("ascending");
        } else if (input.equals(des)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}
