package Step_3_Solve_Problems_On_Arrays.Medium.GFG;
/*
The cost of stock on each day is given in an array A[] of size N.
 Find all the days on which you buy and sell the stock so that in between those days your profit is maximum.

Note: Output format is as follows - (buy_day sell_day) (buy_day sell_day)
For each input, the output should be in a single line, i.e.
It's important to move to a new/next line for printing the output of other test cases.
 */
public class Stock_Buy_And_Sell {

    public void stockBuySell(int[] price, int n) {
        int l=0;
        int h=0;

        boolean flag=false;
        while(h<n-1){
            while(h<n-1 && price[h+1]>price[h])h++;

            if(l!=h){
                flag=true;
                System.out.print("("+l+" "+h+") ");
            }

            l=h+1;
            h=l;
        }
        if(!flag)System.out.print("No Profit");
        System.out.println();


    }
}
