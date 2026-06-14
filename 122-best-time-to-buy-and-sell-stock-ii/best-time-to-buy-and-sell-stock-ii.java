class Solution {
    public int maxProfit(int[] prices) {

        boolean hold = false;
        int buyPrice =0;
        int bookProfit =0;
        for(int i=0;i<prices.length;i++){
            if(hold){
                if(prices[i] > buyPrice){
                    bookProfit +=  prices[i]-buyPrice;
                    hold = false;

                }
            }
            if(!hold){
                if(i+1 < prices.length && prices[i] < prices[i+1]){
                    buyPrice = prices[i];
                    System.out.println(buyPrice);
                    hold = true;

                }
            }
        }

        return bookProfit;
        
    }
}