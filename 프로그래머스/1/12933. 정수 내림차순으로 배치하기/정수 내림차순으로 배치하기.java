import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] split = String.valueOf(n).split("");
        Arrays.sort(split);
        Arrays.sort(split, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            sb.append(s);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }

  
}
