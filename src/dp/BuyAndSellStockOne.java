package dp;

public class BuyAndSellStockOne {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(new BuyAndSellStockOne().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            if (minPrice > price) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }

        }
        return maxProfit;
    }
}
