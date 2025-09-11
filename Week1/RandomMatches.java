import java.util.Arrays;
import java.util.Random;

public class RandomMatches {
    private static final int[] NS = { 1_000, 10_000, 100_000, 1_000_000 };
    private static final int LO = 100_000;
    private static final int HI = 999_999;

    private static int[] randomSixDigitArray(int n, Random rng) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = LO + rng.nextInt(HI - LO + 1);
        return a;
    }

    private static int countMatches(int[] a, int[] b) {
        Arrays.sort(a);
        int count = 0;
        for (int x : b) {
            if (BinarySearch.rank(x, a) >= 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java RandomMatches <T>");
            return;
        }
        int T = Integer.parseInt(args[0]);
        Random rng = new Random();

        System.out.printf("%-10s %-15s%n", "N", "avgMatches");
        for (int N : NS) {
            long sum = 0;
            for (int t = 0; t < T; t++) {
                int[] a = randomSixDigitArray(N, rng);
                int[] b = randomSixDigitArray(N, rng);
                sum += countMatches(a, b);
            }
            double avg = sum / (double) T;
            System.out.printf("%-10d %-15.3f%n", N, avg);
        }
    }
}
