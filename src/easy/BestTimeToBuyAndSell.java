package easy;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] price = {3,2,6,5,0,3};
        System.out.println(maxProfit(price));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;
            if (profit > maxProfit && profit > 0) {
                maxProfit = profit;
            }

        }

        return maxProfit;
    }
}
