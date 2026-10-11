import java.util.Scanner;

class j9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            if ((-b) % a != 0) {
                System.out.println("NO");
            } else {
                int x = -b / a;
                if (c * x + d == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println(x);
                }
            }
        }
    }
}
