import java.util.*;
import java.lang.*;
class BuyAndSell
{
	public static void main(String[] args)
	{
		int[] prices = {1,1,5,3,6};
		int maxprofit = maxProfit(prices);
		System.out.println(maxprofit);
	}
	/*public static int maxProfit(int[] prices)
	{
		int max=0;
		int len= prices.length;
		for(int i=0; i< len-1; i++)// this will do ONLY next day ka comparision... we need full week me which day is the most profitable 
		{
			if(prices[i]<prices[i+1])
				max = prices[i+1]-prices[i];
		}
		return max;
	}*/
	public static int maxProfit(int[] prices)
	{
		int max = 0;
		  
		int len= prices.length;
		if(prices.length == 0)
			return 0;
		int minSoFar = prices[0];  //1st element ko min assume kar AFTER CHECKING THAT PRICES IS NOT EMPTY... agar phelehi 1st term access kia aur baadme check kia that array was empty toh error deta hai
		for(int i=1;i<len;i++)
		{
			if(prices[i]>minSoFar) // next day ka price is greater than previous day ka price so there is a chance of profit
			{
				max = Math.max(max,prices[i]-minSoFar); // previous max aur difference mese jo bada vo jyada profit (THIS IS THE KEY)
			}
			else
			{
				minSoFar = prices[i]; // agar next day ka stock price kum hai to sell karne me loss hoga.. toh vaise bhi agee wale k sath subtratction nai karenge.
			}


		}
		return max;
	}
}