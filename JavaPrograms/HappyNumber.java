import java.util.*;
import java.lang.*;
class HappyNumber
{
	public static void main(String[] args)
	{
		int n = 81;
		boolean b = isHappy(n);
		System.out.println(b);
	}
	public static boolean isHappy(int n)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		int sum,rem;
		while(s.add(n))
		{
			sum = 0;
			while (n>0)
			{
				rem = n%10;
				sum = sum + (rem*rem);
				n = n/10;
			}
			if (sum == 1)
				return true;
			else 
				n = sum;
		}
		return false;
	}
}