//Max Product of 3 nos
import java.util.*;
import java.lang.*;
class MaxProduct
{
	public static void main(String[] args)
	{
		int[] nums = {-4,8,9,-6,1};
		int maxproduct = max(nums);
		System.out.println(maxproduct);
	}
	public static int max(int[] nums)
	{
		int len = nums.length;
		Arrays.sort(nums);
		//return (nums[len-1]*nums[len-2]*nums[len-3]); // this is true only if the array has all positive nos, this will fail if the array has -ve nos
		return Math.max((nums[0]*nums[1]*nums[len-1]),(nums[len-1]*nums[len-2]*nums[len-3]));
	}
} 