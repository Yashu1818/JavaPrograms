//countprime Bruteforce // time limit exceeded good for small nos
import java.util.*;
import java.lang.*;
class Countprimebrute
{
	public static void main(String[] args)
	{
		int n = 1000;
		int result = count(n);
		System.out.println(result);
	}
	public static int count(int n)
	{
		int count=0;
		//int[] res = new int[n/2];
		for(int i =1; i<=n; i++)
		{
			int countx=0;
			for (int num=i;num>0 ;num-- )
			{
				if(i%num==0)
					countx++;
				
			}

			if(countx==2)
				{
					count++;
				}
		}
		return count;
	}
}