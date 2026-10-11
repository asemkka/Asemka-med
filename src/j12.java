import java.util.Scanner;

class j12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (n <= k) {
            System.out.println(2 * m);
        } else {
            int total = 2 * n;
            int batches = (total + k - 1) / k;
            System.out.println(batches * m);
        }
    }
}