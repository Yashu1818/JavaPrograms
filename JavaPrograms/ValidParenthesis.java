import java.util.*;
import java.lang.*;
class ValidParenthesis
{
	public static void main(String[]args)
	{
		String str = "{}";
		boolean b = valid(str);
		System.out.println(b);
	}
	public static boolean valid(String str)
	{
		Stack<Character> s = new Stack<Character>();
		for (int i=0; i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c=='{')
				s.push('}');
			else if (c=='[')
				s.push(']');
			else if (c=='(') 
				s.push(')');
			else if(s.isEmpty() || s.pop() != c) //agar ye if else me aaya toh pop operation vaise bhi ho hi rha hai... so popping need not be done separately
				return false;
			
		}

		return s.isEmpty();
	}	
}	