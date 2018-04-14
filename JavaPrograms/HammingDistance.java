import java.util.*;
import java.lang.*;
class HammingDistance
{
	public static void main(String[] args)
	{
		int x =1;
		int y =5;
		int res = hamming(x,y);
		System.out.println(res);
	}
	public static int hamming(int x,int y)
	{
		return Integer.bitCount(x^y);
	}
}