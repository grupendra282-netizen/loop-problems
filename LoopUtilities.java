import java.util.*;

public class LoopUtilities {

    public static int[][] multiplicationTable(int size) {
        int[][] table = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        return table;
    }

    public static List<Integer> primesUpTo(int limit) {
        List<Integer> primes = new ArrayList<>();

        for (int n = 2; n <= limit; n++) {
            boolean prime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                primes.add(n);
            }
        }

        return primes;
    }

    public static String gradeScore(int score) {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static int countOccurrences(int[] data, int target) {
        int count = 0;

        for (int value : data) {
            if (value == target) {
                count++;
            }
        }

        return count;
    }
}