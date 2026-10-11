import java.util.Scanner;
import java.util.Arrays;

public class j23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        // Максимальное количество поездок, которое может понадобиться с учетом перекрытия
        int maxTrips = n + 60;
        long[] cost = new long[maxTrips + 1];
        int[][] tickets = new int[maxTrips + 1][3]; // [0] - на 1 поездку, [1] - на 10, [2] - на 60

        Arrays.fill(cost, Long.MAX_VALUE);
        cost[0] = 0;

        int[] sizes = {1, 10, 60};
        long[] prices = {15, 125, 440};

        for (int i = 0; i <= maxTrips; i++) {
            if (cost[i] == Long.MAX_VALUE) continue;

            for (int j = 0; j < 3; j++) {
                int nextTrips = Math.min(maxTrips, i + sizes[j]);
                long newCost = cost[i] + prices[j];

                if (newCost < cost[nextTrips]) {
                    cost[nextTrips] = newCost;
                    // Копируем накопленные билеты и добавляем новый тип
                    tickets[nextTrips][0] = tickets[i][0];
                    tickets[nextTrips][1] = tickets[i][1];
                    tickets[nextTrips][2] = tickets[i][2];
                    tickets[nextTrips][j]++;
                }
            }
        }

        // Ищем минимальную стоимость среди всех вариантов, где количество поездок >= n
        long minCost = Long.MAX_VALUE;
        int bestIdx = n;
        for (int i = n; i <= maxTrips; i++) {
            if (cost[i] < minCost) {
                minCost = cost[i];
                bestIdx = i;
            }
        }

        // Выводим количество билетов: на 1, на 10, на 60
        System.out.println(tickets[bestIdx][0] + " " + tickets[bestIdx][1] + " " + tickets[bestIdx][2]);

        scanner.close();
    }
}