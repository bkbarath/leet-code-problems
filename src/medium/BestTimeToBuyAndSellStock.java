package medium;

import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
         Map<Integer, Map<Integer, Integer>> memo = new HashMap<>();
        return recursion(prices, 0, 1, prices.length, memo);
    }

    public static int recursion(int[] prices, int index, int buy, int n, Map<Integer, Map<Integer, Integer>> memo) {


        if (index == n) return 0;

        if (memo.containsKey(index) && memo.get(index).containsKey(buy)) return memo.get(index).get(buy);

        int profit;

        if (buy == 1) {
            profit = Math.max(-prices[index] + recursion(prices, index + 1, 0, n, memo),
                    recursion(prices, index + 1, 1, n, memo));
        } else {
            profit = Math.max(prices[index] + recursion(prices, index + 1, 1, n, memo),
                    recursion(prices, index + 1, 0, n, memo));
        }

        memo.putIfAbsent(index, new HashMap<>());
        memo.get(index).put(buy, profit);

        return profit;
    }
}
