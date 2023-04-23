import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] rest = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            rest[i] = arr[i] % 42;
        }
        for (int i = 0; i < 10; i++) {
            int temp = 0;
            for (int j = i + 1; j < 10; j++) {
                if (rest[i] == rest[j])
                    temp++;
            }
            if (temp == 0)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}