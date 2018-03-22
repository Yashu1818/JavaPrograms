import java.util.*;
import java.lang.*;
class PlusOne
{
	public static void main(String[] args)
	{
		int[] nums = {1,9};
		int[] result = plusOne(nums);
		System.out.println(Arrays.toString(result));
	}
	public static int[] plusOne(int[] nums)
	{
		for(int i=nums.length-1;i>=0;i--) //traversing the array from the end to add one
		{
			if(nums[i] != 9)
			{
				nums[i]++; // or nums[i]+1
				return nums; //khatam problem 
			}
			else
				nums[i]= 0;
		}
		int[] Newres = new int[nums.length+1]; // new array of length one more than prev array, this is done for nos. starting and ending in 9
		Newres[0]=1; // this is because is there is a double 99 then the next term will definately start with 1 and rest all nos will be 0 so only initialize the first term to 1
		return Newres;
	}
}