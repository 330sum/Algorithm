import java.util.*;

public class Main {
    private List<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }

        for (int i2 : arr2) {
            if(set.contains(i2)) answer.add(1);
            else answer.add(0);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
        for (int x : main.solution(n, m, arr1, arr2)) {
            System.out.println(x);
        }

    }

}
