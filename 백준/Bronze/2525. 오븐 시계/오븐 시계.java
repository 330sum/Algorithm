import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int cook = sc.nextInt();

        int cookH = (m + cook) / 60;
        int hour = h + cookH;
        int min = (m + cook) % 60;

        if (hour >= 24) {
            hour = hour-24;
            System.out.println(hour + " " + min);
        }else {
            System.out.println(hour + " "+min);
        }
    }
}