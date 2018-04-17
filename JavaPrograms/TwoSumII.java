//2 sum sorted, there is exactly one solution
import java.util.*;
import java.lang.*;
class TwoSumII
{
	public static void main(String[] args)
	{
		int[] nums= {3,5,7,11,12,20};
		int target = 18;
		int[] result = twosum(nums,target);
		System.out.println(Arrays.toString(result));
		 
	}
	public static int[] twosum(int[] nums, int target)
	{
		int[] res = new int[2];
		int len= nums.length;
		if(len == 0 || len<2) return res;
		int start = 0;
		int end = len-1;
		while(start<end) // we are doing this since we are goin to use incrementers/decrementers within the loop
		{
			int sum = nums[start] + nums [end];
			if(target == sum)
			{
				res[0] = start+1;
				res[1] = end+1;
				break;
			}
			else if(sum>target)
			{
				end--;
			}
			else
			{
				start++;
			}
		}
		return res; 
	}
}