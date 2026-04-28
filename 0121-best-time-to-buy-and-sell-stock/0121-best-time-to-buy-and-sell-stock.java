class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length - 1;
        int buy = prices[0];
        int profit = 0;
        int check = 0;

        for(int i = 1; i <= n; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            else{
                int sell = prices[i];
                check = sell - buy;
    
                if(check > profit){
                    profit = check;
                }
            }
        }
        return profit;
    }
}