//Remove Element in-place returning new length 
import java.util.*;
class RemoveElementInPlace
{
	public static void main(String[] args)
	{
		int[] nums = {1};
		int val = 2;
		int newLength = newLength(nums,val);
		System.out.println(newLength);
	}
	public static int newLength(int[] nums, int val)
	{
		if(nums.length == 1 && nums[0]==val) return 0;  //if there is only one element and thats the value
		if(nums.length == 1) return 1; //if there is only one element and that's not the value
		int j =0; //curr index counter
		for (int i =0 ;i<nums.length ; i++) // start with i as 0 since j is for curr index and i is the traveral index that looks for the val
		{
			if(nums[i] != val) //this means that the no. at ith pos is unique i.e not a duplicate and use != since it is not specified wether array is sorted in asc or dec
			{
				nums[j] = nums[i]; // put the unique element in the new pos i.e in front
				j++; //increment the curr counter
			}
		}
		return j; //since length is one more and after deleting the specific val we are incrementing the counter. 
	}
}