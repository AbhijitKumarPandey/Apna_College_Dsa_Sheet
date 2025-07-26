package Array;

public class Best_buy_Sell {
	public static int maxrofit(int[] price) {
		int minprices = Integer.MAX_VALUE;
		int maxprofit = 0;
		
		for(int i=0; i<price.length; i++) {
			if(price[i]<minprices) {
				minprices = price[i];
				
				
			}
			else {
				int profit = price[i]-minprices;
				if(profit>=maxprofit) {
					maxprofit = profit;
				}
			}
		}
		
		return maxprofit;
	}
	
	public static void main(String[] args) {
		int []prices = {7,1,5,3,6,4};
		
		int result = maxrofit(prices);
		System.out.println("Maximum Profit " + result);
		}

}
