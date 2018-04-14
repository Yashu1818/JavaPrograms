//KADANE'S algorithm to find the max subsequence sum of an array
import java.util.*;
import java.lang.*;
class MaxSubArray
{
	public static void main(String[] args)
	{
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int sum = max(nums);
		System.out.println(sum);
	}
	public static int max (int[] nums)
	{
		int max = nums[0]; //initially start with 0
		int comparator = 0; //comparator for the max sum
		//int start=end=s=0 (s is for tracking the start pos) >> this will be to find the start and end position of the subarray having max sum
		for(int i=0; i< nums.length; i++)
		{
			comparator = comparator + nums[i]; //keeps on adding next nos.
			if(max<comparator)
			{
				max = comparator; // update max sum
				// start = s ; end = i;
			}
			if(comparator < 0)
			{
				comparator = 0;
				//s=i+1; // update the start pos bcz if the comparator becomes neg then all the pos to the left of the comparator will become 0
			}
		}
		return max;
	}
}