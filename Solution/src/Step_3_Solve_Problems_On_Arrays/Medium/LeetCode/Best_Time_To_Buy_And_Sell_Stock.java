package Step_3_Solve_Problems_On_Arrays.Medium.LeetCode;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a
 different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class Best_Time_To_Buy_And_Sell_Stock {

    public int maxProfit(int[] prices) {
        //max varible
        int max = 0;
        //min to find the minimum price
        int min = prices[0];
        for(int i=0;i<prices.length;i++){
            // if we find minimum price assign it to min
            if(min>prices[i]){
                min=prices[i];
            }
            //find profit
            int profit = prices[i]-min;
            //check if it is maximum.
            if(max<profit){
                max=profit;
            }
        }
        //return max
        return max;
    }

}
