import java.util.*;
import java.lang.*;
class ReverseInt
{
	public static void main(String [] args)
	{
		int n = 1515;
		int res = reverse(n);
		System.out.println(res);
	}
	public static int reverse(int n)
	{
		int rev = 0;
		int r;
		while(n!=0)
		{
			r = n%10;
			rev = (rev*10) + r; 
			//if((rev-r)/10!=d) // to check the overflow... if new res is not equal to prev res then there is gadbad
			if(rev%10 != r)	 // last digit of reverse is always the current remainder.. if thats not the case then there is overflow
				return 0;
			//d=rev;
			n = n/10;
		}
		return rev;
	}
}