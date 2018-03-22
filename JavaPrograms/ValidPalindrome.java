//valid palindrome
import java.util.*;
import java.lang.*;
class ValidPalindrome
{
	public static void main(String[] args)
	{
		String str = "A,b, ";

		boolean ans = palindrome(str);
		System.out.println(ans);
	}
	/*public static boolean palindrome(String str)  // this method is giving wrong ans
	{
		//if(str.isEmpty()) return true;
		str = str.toLowerCase(); // this is the correct way
		int head = 0;
		int tail = str.length()-1;
		while(head<tail)
		{
			if(!Character.isLetterOrDigit(str.charAt(head))) 
				head++;
			else if(!Character.isLetterOrDigit(str.charAt(tail)))
				tail--;
			else if(str.charAt(head) != str.charAt(tail))
				return false;
			head++;
			tail--;
		}
		return true;
	}*/
	// BETTER SOLUTION WITHOUT ANY spl builtin function... ascii related
	public static boolean palindrome(String str)
	{
		str = str.toLowerCase();
		int head = 0;
		int tail = str.length()-1;
		while(head<tail)
		{
			if((str.charAt(head)>'z'||str.charAt(head)<'a')&&(str.charAt(head)>'9' || str.charAt(head)<'0')) head++;
			else if ((str.charAt(tail)>'z'||str.charAt(tail)<'a')&&(str.charAt(tail)>'9' || str.charAt(tail)<'0')) tail--;
			else if (str.charAt(head++)!=str.charAt(tail--)) return false;
		}
		return true;
	}
}