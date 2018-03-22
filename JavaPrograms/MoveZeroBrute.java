// Brute force to solve move zeros problem
import java.util.*;
import java.lang.*;
class MoveZeroBrute
{
	public static void main(String[] args)
	{
		int[] nums ={0,3,5,6,7,0,6};
		moveZero(nums);
	}
	public static void moveZero(int[] nums)
	{
		int temp,i,j=1;
		int len = nums.length;
		for(i=0; i<len;i++)
		{
			if(nums[i]==0)
			{
				temp=nums[i];
				nums[i]=nums[len-j];
				nums[len-j]=temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
} 