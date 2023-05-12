import java.util.Arrays;

import static java.util.Arrays.stream;

public class MaximumWealth {
    private static int findMaxWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] investor : accounts) {
            int currWealth = Arrays.stream(investor).sum();
            if (currWealth > maxWealth) {maxWealth = currWealth;}
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = new int[][] {{1, 2, 3}, {2, 2, 1} };
        int[][] accounts2 = new int[][] { {2,8,7}, {7,1,3}, {1,9,5} };

        System.out.println(findMaxWealth(accounts2));

    }
}
