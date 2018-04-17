//Remove duplicate elements and return new length
import java.util.*;
class RemoveDuplicatesInPlace
{
	public static void main(String[] args)
	{
		int[] nums ={0,0,1,1,2,2,2,4,4,5,5};
		int newLength = newLength(nums);
		System.out.println(newLength);
	}
	/*public static int newLength(int[] nums) //This method is very much correct if you are just required to return the length
	{											But the Q is also asking to return the 1st n pos as unique where n is the length
		int counter = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++)
		{
			if(set.add(nums[i]))
			{
				counter++;
			}
		}
		return counter;
	}*/
	public static int newLength(int[] nums)
	{
		if(nums.length == 1) return 1;
		int j =0; //curr index counter
		for (int i =1 ;i<nums.length ; i++) // start with i as 1 since j is already 0 so comparision will be 1 less 
		{
			if(nums[j]!=nums[i]) //this means that the no. at ith pos is unique i.e not a duplicate and use != since it is not specified wether array is sorted in asc or dec
			{
				j++; //increment the curr counter
				nums[j] = nums[i]; // put the unique element in the new pos i.e in front
			}
		}
		return j+1; //since length is one more
	}
}