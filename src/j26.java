import java.util.Scanner;

class j26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 10 == 1 && n % 100 != 11) {
            System.out.println(n + " bochka");
        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 12 || n % 100 > 14)) {
            System.out.println(n + " bochki");
        } else {
            System.out.println(n + " bochek");
        }
    }
}
