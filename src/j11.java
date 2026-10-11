import java.util.Scanner;

class j11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        if (k >= 3 && (k % 3 == 0 || k % 5 == 0 || k >= 8)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
