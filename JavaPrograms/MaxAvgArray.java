//Max Avearge of subarray len k
import java.util.*;
import java.lang.*;
class MaxAvgArray
{
	public static void main(String[] args)
	{
		int[] nums = {1,3,5,-7,8,6};
		int k = 4;
		double avg = maxAvg(nums,k);
		System.out.println(avg);
	}
	public static double maxAvg(int[] nums, int k)
	{
		double sum = 0;
		for(int i=0; i<k; i++)
			sum+=nums[i];
		double res = sum;
		for(int i=k; i<nums.length; i++)
		{
			sum+=nums[i] - nums[i-k];
			res = Math.max(res,sum);
		}
		return res/k;
	}

}