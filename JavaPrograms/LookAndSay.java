import java.util.*;
import java.lang.*;
class LookAndSay
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(args[0]);
		String result = lookAndSay(n);
		System.out.println(result);
	}
	public static String lookAndSay(int n) //n is the value to be found i.e nth term
	{
		String str = "1"; // sequence starts with 1
		for(int i = 2 ; i <= n ; i++)
		{
			char prev=str.charAt(0); // start with 1st character in the string
			int count = 1;
			StringBuilder temp = new StringBuilder();
			for(int j=1; j<str.length();j++) // traversing the string and comparing value prev to next to find is there is a consequtive sequence 
			{
				char current = str.charAt(j);
				if(prev != current)
				{
					temp.append(count);
					temp.append(prev);
					count = 1;    // reset the counter everytime char shifts i.e prev = current i.e before the next comparission 
					prev = current;
				}
				else 
				{
					count++;
				}
			}
			temp.append(count);   // if the loop doesn't execute or for the last character of the string needs to be appended as well
			temp.append(prev);
			str = temp.toString();
		}
		return str;
	}
}