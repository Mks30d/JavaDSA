package Arrays;

public class BuySellStocks {

    public static void buySellStocks(int prices[]) {
        if (prices == null || prices.length < 2) {
            System.out.println("Not enough data to make a profit.");
            return;
        }

        int buyprice = prices[0], profit = 0, maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {

            int sellprice = prices[i];

            if (buyprice < sellprice) { // profit
                profit = sellprice - buyprice; // todays's profit

                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            } else { // loss
                buyprice = sellprice;
            }

        }
        System.out.println("Maximum Profit: " + maxprofit);

    }

    // ------------ findind maxProfit, buyIndex & sellIndex ---------------
    // buyIndex is not working for prices1[] = { 7, 3, 1, 5, 6, 0, 4 };
    public static void buySellStocks1(int prices[]) {
        int buyprice = prices[0], profit = 0, maxprofit = 0;
        int buyIndex = 0, sellIndex = 0;

        for (int i = 0; i < prices.length; i++) {

            int sellprice = prices[i];

            // case 1st
            if (buyprice < sellprice) { // profit
                profit = sellprice - buyprice; // todays's profit

                // maxprofit = Math.max(maxprofit, profit);
                if (profit > maxprofit) {
                    maxprofit = profit;
                    sellIndex = i; // Update the sell index
                }
            } else { // loss
                buyprice = sellprice;
                buyIndex = i; // Update the buy index

            }

        }
        if (maxprofit > 0) {
            System.out.println("Maximum Profit: " + maxprofit);
            System.out.println("Buy Index: " + buyIndex);
            System.out.println("Sell Index: " + sellIndex);
        } else {
            System.out.println("No profit can be made.");
        }

    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int prices1[] = { 7, 3, 1, 5, 6, 0, 4 };
        int prices2[] = { 7, 5, 3, 0 };

        buySellStocks1(prices1);
    }
}
