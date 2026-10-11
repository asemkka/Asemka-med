import java.util.Scanner;

class j7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int n = 2; n * 2 + (n - 2) * 2 == k || n * n <= 30000; n++) {
            if (4 * n - 4 == k) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
