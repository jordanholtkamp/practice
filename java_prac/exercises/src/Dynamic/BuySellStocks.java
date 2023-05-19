package Dynamic;

import java.util.HashMap;
import java.util.Map;

public class BuySellStocks {

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;

        int minBuyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length - 1; i++) {
            int buyPrice = prices[i];
            if (buyPrice < minBuyPrice) {
                minBuyPrice = buyPrice;
                int maxSell = 0;
                for (int j = i + 1; j < prices.length; j++) {
                    int sellPrice = prices[j];

                    if (sellPrice > maxSell) {
                        maxSell = sellPrice;
                        if (sellPrice - buyPrice > maxProfit) {
                            maxProfit = sellPrice - buyPrice;
                        }
                    }
                }
            }

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[] {2,1,2,1,0,1,2}));
    }
}
