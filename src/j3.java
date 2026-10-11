import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        if (Math.abs(r1 - r2) == Math.abs(c1 - c2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}