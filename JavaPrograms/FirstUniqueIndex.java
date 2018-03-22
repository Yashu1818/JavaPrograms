//1st unique char
import java.util.*;
import java.lang.*;
class FirstUniqueIndex
{
	public static void main(String[] args)
	{
		String str= "JAJVA";
		int index = uniqueIndex(str);
		System.out.println(index);
	}
	public static int uniqueIndex(String str)
	{
		Hashtable<Character,Integer> h = new Hashtable<Character,Integer>();
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(h.get(ch)==null)
				h.put(ch,1);
			else
			{
				int x = h.get(ch);
				h.put(ch,x+1);
			}
		}
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(h.get(ch)==1)
				return i;
		}
		return -1;
	}
}