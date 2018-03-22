//Missing number
import java.util.*;
import java.lang.*;
class MissingNum
{
	public static void main(String[] args)
	{
		int[] nums = {1,2,4,0};
		int res = missing(nums);
		System.out.println(res);
	}
	public static int missing(int[] nums)
	{
		int n = nums.length;
		Arrays.sort(nums);
		boolean[] b = new boolean[n+1];
		for(int i =0; i<n; i++)
		{
			int x = nums[i];
			b[x] = true;
		}
		for(int i=0;i<=n;i++)
		{
			if(b[i]== false)
				return i;
		}
		return -1;
	}
}