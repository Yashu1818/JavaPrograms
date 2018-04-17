//minimum cost of climbing stairs
import java.util.*;
import java.lang.*;
class CostOfClimbingStairs
{
	public static void main(String[] args)
	{
		int[] cost = {10,15,20,25};
		int min = minCost(cost);
		System.out.println(min);
	}
	public static int minCost(int[] cost)
	{
		int len = cost.length;
		int f1= 0;
		int f2= 0;
		for(int i = len-1; i>=0; i--)
		{
			int f0= cost[i] + Math.min(f1,f2);
			f2=f1;
			f1=f0;
		}
		return Math.min(f1,f2);
	}
}