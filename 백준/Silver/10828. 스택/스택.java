import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            String str = scanner.next();

            switch (str) {
                case "push":
                    stack.push(scanner.nextInt());
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(stack.pop() + "\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size() + "\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        sb.append(-1+ "\n");
                    } else {
                        sb.append(stack.peek()+ "\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
