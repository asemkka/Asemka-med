import java.util.Scanner;
import java.util.Arrays;

public class j24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int maxT = n + 60;

        long[] cost = new long[maxT + 1];
        int[] totalTrips = new int[maxT + 1];
        int[][] ticketsCount = new int[maxT + 1][5]; // t1, t5, t10, t20, t60

        Arrays.fill(cost, Long.MAX_VALUE);
        cost[0] = 0;
        totalTrips[0] = 0;

        int[] sizes = {1, 5, 10, 20, 60};
        long[] prices = {15, 70, 125, 230, 440};

        for (int i = 0; i <= maxT; i++) {
            if (cost[i] == Long.MAX_VALUE) continue;

            for (int j = 0; j < 5; j++) {
                int size = sizes[j];
                long p = prices[j];

                int nxt = Math.min(maxT, i + size);
                long newCost = cost[i] + p;
                int newTrips = totalTrips[i] + size;

                boolean better = false;
                if (newCost < cost[nxt]) {
                    better = true;
                } else if (newCost == cost[nxt] && newTrips > totalTrips[nxt]) {
                    better = true;
                }

                if (better) {
                    cost[nxt] = newCost;
                    totalTrips[nxt] = newTrips;
                    System.arraycopy(ticketsCount[i], 0, ticketsCount[nxt], 0, 5);
                    ticketsCount[nxt][j]++;
                }
            }
        }

        long minCost = Long.MAX_VALUE;
        int maxTrips = -1;
        int bestIdx = -1;

        for (int i = n; i <= maxT; i++) {
            if (cost[i] < minCost) {
                minCost = cost[i];
                maxTrips = totalTrips[i];
                bestIdx = i;
            } else if (cost[i] == minCost && totalTrips[i] > maxTrips) {
                maxTrips = totalTrips[i];
                bestIdx = i;
            }
        }

        System.out.println(ticketsCount[bestIdx][0] + " " +
                ticketsCount[bestIdx][1] + " " +
                ticketsCount[bestIdx][2] + " " +
                ticketsCount[bestIdx][3] + " " +
                ticketsCount[bestIdx][4]);

        scanner.close();
    }
}