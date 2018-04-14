import java.util.*;
import java.lang.*;
class FindDisappeared
{
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,6,7,3,2};
		List<Integer> result = findDisappeared(nums);
		System.out.println(result);
	}
	public static List<Integer> findDisappeared(int[] nums)
	{
		int len = nums.length;
		for(int i=0;i<len;i++)
		{
			int val = Math.abs(nums[i])-1; //why abs? because it may happen that the no. at nums[i] is already negated
			if(nums[val]>0) //if not visited then negate it, if its already negative then it is possible that the index+1 is the missing no.
			{
				nums[val]= -nums[val];
			}
		}
		List<Integer> res = new ArrayList<Integer>();
		for (int i=0;i<len ;i++ ) {
			if(nums[i]>0)//this means that there is a duplicate and that index is missing
			{
				res.add(i+1); //i+1 because indexing is from 0 and nos are between 1 and n
			}
			
		}
		return res;
	}
}
