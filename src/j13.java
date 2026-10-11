import java.util.Scanner;

class j13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if ((x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0) ||
                (x1 < 0 && y1 > 0 && x2 < 0 && y2 > 0) ||
                (x1 < 0 && y1 < 0 && x2 < 0 && y2 < 0) ||
                (x1 > 0 && y1 < 0 && x2 > 0 && y2 < 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
