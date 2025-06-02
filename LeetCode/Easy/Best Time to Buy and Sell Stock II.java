class Solution {
    public int maxProfit(int[] prices) {
        int res;
        int res1=0;
        for(int i=0;i<prices.length-1;i++){
                if(prices[i]<prices[i+1]){
                    res=prices[i+1]-prices[i];
                    res1=res1+res;
                }
            }
        return res1;
    }
}
