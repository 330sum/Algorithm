import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 알파벳 26개 초기값 -1
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        // 입력값에 해당 알파벳이 있으면 인덱스를 찍는다
        // b -> 1 , a -> 0
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (arr[(int) c - 97] == -1) {
                arr[(int) c - 97] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}