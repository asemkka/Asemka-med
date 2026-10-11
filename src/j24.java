import java.util.Scanner;

class j24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int bestCost = Integer.MAX_VALUE;
        int bestTrips = 0;
        int b1 = 0, b5 = 0, b10 = 0, b20 = 0, b60 = 0;

        for (int i = 0; i <= n / 60 + 1; i++) {
            for (int j = 0; j <= n / 20 + 1; j++) {
                for (int k = 0; k <= n / 10 + 1; k++) {
                    for (int l = 0; l <= n / 5 + 1; l++) {
                        int trips = i * 60 + j * 20 + k * 10 + l * 5;
                        int ones = Math.max(0, n - trips);
                        int totalTrips = trips + ones;
                        int cost = i * 440 + j * 230 + k * 125 + l * 70 + ones * 15;

                        if (totalTrips >= n && (cost < bestCost ||
                                (cost == bestCost && totalTrips > bestTrips))) {
                            bestCost = cost;
                            bestTrips = totalTrips;
                            b60 = i;
                            b20 = j;
                            b10 = k;
                            b5 = l;
                            b1 = ones;
                        }
                    }
                }
            }
        }

        System.out.println(b1 + " " + b5 + " " + b10 + " " + b20 + " " + b60);
    }
}
