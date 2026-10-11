import java.util.Scanner;

public class j22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String form;

        if (n >= 11 && n <= 14) {
            form = "korov";
        } else {
            int lastDigit = n % 10;
            if (lastDigit == 1) {
                form = "korova";
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                form = "korovy";
            } else {
                form = "korov";
            }
        }

        System.out.println(n + " " + form);

        scanner.close();
    }
}