public class AA14_StockPrice_Profit{
    public static void main (String args[]){
        int prices[]={7,6,9};
        int buyPrice=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int sp=prices[i];
            int profit_temp=sp-buyPrice;
            if(profit < profit_temp){
                profit=profit_temp;
            }
            if(buyPrice>prices[i]){
                buyPrice=prices[i];
            }

        }
        System.out.println(profit);
    }
}