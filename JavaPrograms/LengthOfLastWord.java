import java.util.*;
import java.lang.*;
class LengthOfLastWord
{
	public static void main(String args[])
	{
		String str = " heLLoWorld ";
		int res = lengthOfLastWord(str);
		System.out.println(res);
	}
	public static int lengthOfLastWord(String str)
	{
		if(str.isEmpty())
		{
			return 0; 
		}
		String use= str.trim();
		int len = use.length()-1;
		int count = 0;
		for(int i= len; i>= 0; i--)
		{
			if(use.charAt(i) != ' ')
			{
				count++;
			}
			else
				break;
		}
		return count;

	}
}