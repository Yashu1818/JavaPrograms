import java.util.*;
import java.lang.*;
class MajorityElement
{
	public static void main(String[] args)
	{
		int[] nums = {2,3,4};
		int res = majorityElement(nums);
		System.out.println(res);

	}
	public static int majorityElement(int[] nums)
	{
		int n= nums.length;
		Hashtable<Integer, Integer> h = new Hashtable<Integer,Integer>();
		for(int i = 0; i<n;i++)
		{
			int x = nums[i];
			if(h.get(x)==null)
				h.put(x,1);
			else
				{
					int y = h.get(x);
					h.put(x,y+1);
				}
		}
		for(int i=0; i<n; i++)
		{
			int x = nums[i];
			if(h.get(x)>(n/2))
				return x;
		}
		return -1;
	}
	/*// shortcut program using built-in function
	public static int majorityElement(int[] nums) //never use
	{
		Arrays.sort(nums);
		return nums[nums.length/2];
	}*/
}