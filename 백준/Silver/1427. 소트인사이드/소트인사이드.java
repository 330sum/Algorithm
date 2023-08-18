import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        List<Character> list = new ArrayList<>();
        for (char x: input.toCharArray()) {
            list.add(x);
        }
        Collections.sort(list, Collections.reverseOrder());
        for (Character c : list) {
            System.out.print(c);
        }

    }
}