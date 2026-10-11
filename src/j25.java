import java.util.Scanner;

class j25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        if (x > 1) {
            System.out.println((x - 1) + " " + y);
        }
        if (y > 1) {
            System.out.println(x + " " + (y - 1));
        }
        if (y < n) {
            System.out.println(x + " " + (y + 1));
        }
        if (x < m) {
            System.out.println((x + 1) + " " + y);
        }
    }
}


