import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] split = input.split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            numbers.add(Integer.parseInt(split[i]));
        }
        Integer num1 = numbers.get(0);
        Integer num2 = numbers.get(1);

        if (num1 > num2) {
            System.out.println(">");
        } else if (num1 < num2) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}