public class buyAndSellStocks_II {
    public static void main(String[] args) {
        int prices[] = {6, 5, 4, 3, 2, 1};
        int res = maxProfit(prices);
        System.out.println("Total Profit is : " + res);
    }

    public static int maxProfit(int prices[]){

        int profit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }

}
