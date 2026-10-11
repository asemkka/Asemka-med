import java.util.Scanner;

class j27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean even = a % 2 == 0 || b % 2 == 0 || c % 2 == 0;
        boolean odd = a % 2 != 0 || b % 2 != 0 || c % 2 != 0;

        System.out.println(even && odd ? "YES" : "NO");
    }
}
