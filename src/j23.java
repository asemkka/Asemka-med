import java.util.Scanner;

public class j23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int minCost = Integer.MAX_VALUE;
        int bestT60 = 0, bestT10 = 0, bestT1 = 0;

        // Перебираем количество билетов на 60 поездок
        for (int t60 = 0; t60 <= n / 60 + 1; t60++) {
            // Перебираем количество билетов на 10 поездок
            for (int t10 = 0; t10 <= (n - t60 * 60) / 10 + 1; t10++) {
                int remaining = n - t60 * 60 - t10 * 10;
                int t1 = Math.max(0, remaining);

                int cost = t60 * 440 + t10 * 125 + t1 * 15;

                if (cost < minCost) {
                    minCost = cost;
                    bestT60 = t60;
                    bestT10 = t10;
                    bestT1 = t1;
                }
            }
        }

        System.out.println(bestT1 + " " + bestT10 + " " + bestT60);
        scanner.close();
    }
}