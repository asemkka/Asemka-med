import java.util.Scanner;

class j10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int price = a * 100 + b;
        int paid = c * 100 + d;
        int change = paid - price;

        System.out.println(change / 100 + " " + change % 100);
    }
}
