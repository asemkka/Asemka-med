import java.util.Scanner;

class j19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (Math.abs(a - c) <= 1 && Math.abs(b - d) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
