import java.util.*;
import java.lang.*;
class AttendanceRecord1
{
	public static void main(String args[])
	{
		String str = "LLLL";
		boolean res = checkRecord(str);
		System.out.println(res);
	}
	public static boolean checkRecord(String str)
	{
		Hashtable<Character,Integer> h = new Hashtable<Character,Integer>();
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(h.get(c)==null)
			{
				h.put(c,1);
			}
			else
			{
				int x = h.get(c);
				h.put(c,x+1);
			}
		}
		String s = "LLL";

		Integer r = h.get('A');

		if(r!=null && r != 1)
			{
				return false;
			}
			
		if(str.contains(s))
			{
				return false;
			}
		
		return true;
	}
}