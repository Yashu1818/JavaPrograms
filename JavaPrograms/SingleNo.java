import java.util.*;
import java.lang.*;
class SingleNo
{
	public static void main(String[] args)
	{
		int[] nums = {2,4,5,6,2,4,6};
		int res = singleNo(nums);
		System.out.println(res);
	}
	/*public static int singleNo(int[] nums) // using hashtable 21ms but problem is that what if ans is -1, return will be confusing
	{
		Hashtable<Integer,Integer> h = new Hashtable<Integer,Integer>();
		int len = nums.length;
		for (int i=0; i<len ; i++)
		 {
			int x = nums[i];
			if(h.get(x)==null)
			{
				h.put(x,1);			// insert the key for the first time
			}
			else 
			{
				int y = h.get(x);
				h.put(x,y+1);		//increment the value of key
			}
		}
		for (int i = 0; i < len ; i++ ) {
			int x = nums[i];
			if(h.get(x)==1)
				return x;
		 	}
		 	return -1; 
	}*/
	public static int singleNo(int[] nums) // 20 times better since runtime is just "1"MS
	{
		int len = nums.length;
		int res = 0;
		for (int i = 0;i<len ;i++ ) 
		{	
			res = res ^ nums[i];
		}
		return res;
	}
}