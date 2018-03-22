import java.util.*;
import java.lang.*;
class RemoveCharacter
{
	public static void main(String[] args)
	{
		String str = "how you doing";
		String remove = "aeiou";
		String trimmed = removeCharacter(str,remove);
		System.out.println(trimmed);
		//removeCharacter(str,remove);
	}
	public static String removeCharacter(String str, String remove)
	{
		Hashtable<Character,Boolean> h = new Hashtable<Character,Boolean>();
		char s;
		int des = 0;
		char[] NewStr = new char[str.length()]; 
		for(int i=0;i<str.length();i++)
		{
			s = str.charAt(i);
			h.put(s,false);
		}
		for(int i=0;i<remove.length();i++)
		{
			s= remove.charAt(i);
			h.put(s,true);
		}
		for(int i=0;i<str.length();i++)
		{
			s=str.charAt(i);
			if(h.get(s)==false)
			{
				NewStr[des] = s;
				des++; // important don't forget
			}
		}
		//String N = NewStr.toString();
		String N= new String(NewStr); // to convert char array to String 
		return N;
	}
}