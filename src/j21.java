import java.util.Scanner;

class j21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("impossible");
            return;
        }

        int max = Math.max(a, Math.max(b, c));
        int sum = a * a + b * b + c * c - max * max;

        if (max * max == sum) {
            System.out.println("right");
        } else if (max * max < sum) {
            System.out.println("acute");
        } else {
            System.out.println("obtuse");
        }
    }
}
