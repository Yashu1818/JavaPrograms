import java.util.*;
import java.lang.*;
class AddBit
{
	public static void main(String[] args)
	{
		int a = 10 , b= 20;
		int res = addition(a,b);
		System.out.println(res);
	}
	public static int addition(int a, int b)
	{
		int carry;
		while(b!=0)
		{
			carry = a & b;
			a = a^b;
			b = carry<<1;
		}
		return a;
	}
	public static int subtraction(int a, int b)
	{
		int borrow;
		while(b!=0)
		{
			borrow = (~a) & b;
			a = a^b;
			b = borrow<<1;
		}
		return a;
	}
}