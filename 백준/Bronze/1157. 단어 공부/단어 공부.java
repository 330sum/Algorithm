import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();
        String[] split = input.split("");

        Map<String, Integer> countMap = new HashMap<>();
        for (String x : split) {
            countMap.put(x, countMap.getOrDefault(x, 0) + 1);
        }

        String result = "";
        int max = 0;

        for (String key : countMap.keySet()) {
            Integer count = countMap.get(key);
            if (count > max) {
                max = count;
                result = key;
              
            } else if (count == max) {
                result = "?";
            }
        }

        System.out.println(result);


    }
}