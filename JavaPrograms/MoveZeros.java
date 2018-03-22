// new and better program
import java.util.*;
import java.lang.*;
class MoveZeros
{
	public static void main(String[] args)
	{
		int[] nums ={0,3,5,6,7,0,6};
		moveZero(nums);
	}
	public static void moveZero(int[] nums)
	{
		int pos = 0;
		int len = nums.length;
		for(int i =0; i<len; i++)
		{
			if(nums[i]!=0)
				{
					nums[pos]=nums[i];
					pos++;
				}
		}
		while (pos<len)
		{
			nums[pos]=0;
			pos++;
		}
		System.out.println(Arrays.toString(nums));
	}
} 