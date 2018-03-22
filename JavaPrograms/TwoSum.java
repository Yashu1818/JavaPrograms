import java.lang.*;
import java.util.*;
import java.util.Arrays;

class TwoSum
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {2,5,7,11};
		int target = 12;
		int [] result = twoSum(nums,target);
		System.out.println(Arrays.toString(result));
		/*int X= n.length;    *****Brute force method****** 
		for(i=0;i<X;i++)
		{
			for(j=i+1;j<X;j++)
			{
				//System.out.println("i : " + i + " , j : " + j);
				
				if(n[i]+n[j]==target)
				{
					System.out.println(i+""+j);
				}
				
			}
		}
		//throw new ArrayIndexOutOfBoundsException("solution not found");*/
	}

	public static int[] twoSum(int[] nums, int target)
	 {
        HashMap<Integer,Integer> h= new HashMap<>();
        int i,complement;
        int[] n = new int[2];

        for(i=0; i<nums.length;i++)
        {
        	h.put(nums[i],i);
        }
        System.out.println(h);
        for(i=0;i<nums.length;i++)
        {
        	complement = target-nums[i];
        	if (h.containsKey(complement) && h.get(complement)!= i)
        	{
        		n[0]= h.get(complement);
        		n[1]= i;
        		
           	}
        }
        
        return n;
    }
}