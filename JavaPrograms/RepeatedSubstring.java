//Repeated Substring Pattern
import java.util.*;
import java.lang.*;
class RepeatedSubstring
{
	public static void main(String[] args)
	{
		String s = "aaba";
		boolean ans = isPattern(s);
		System.out.println(ans);
	}
	public static boolean isPattern(String s)
	{
		int len = s.length();
		for(int i=len/2; i>=1; i--)
		{
			if(len%i==0)
			{
				int times = len/i;
				String substring = s.substring(0,i);
				StringBuilder str = new StringBuilder();
				for(int j=0; j<times; j++)
				{
					str.append(substring);
				}
				if(str.toString().equals(s)) return true;
			}
		}
		return false;
	}
}