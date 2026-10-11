import java.util.Scanner;

class j23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int best1 = 0, best10 = 0, best60 = 0;
        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i <= n / 60 + 1; i++) {
            for (int j = 0; j <= n / 10 + 1; j++) {
                int remaining = n - i * 60 - j * 10;
                int k = Math.max(0, (remaining + 0));
                int cost = i * 440 + j * 125 + k * 15;

                if (i * 60 + j * 10 + k >= n && cost < minCost) {
                    minCost = cost;
                    best60 = i;
                    best10 = j;
                    best1 = k;
                }
            }
        }

        System.out.println(best1 + " " + best10 + " " + best60);
    }
}
