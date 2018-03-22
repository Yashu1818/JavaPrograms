import java.util.*;
import java.lang.*;
class ValidAnagram
{
	public static void main(String[] args)
	{
		String s = "yash";
		String t = "ashy";
		boolean b = anagram(s,t);
		System.out.println(b);
	}
	/*public static boolean anagram(String s, String t)
	{
		if(s.length()!=t.length()) return false;
		HashSet<Character> set = new HashSet<Character>();
		for(int i =0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
	    for(int i =0; i<t.length();i++) 
	    {
	    	if(!set.contains(t.charAt(i))) return false;
	    }
	    return true;

	}*/
	//try using hashtable
	/*&public static boolean anagram(String s, String t)
	{
		if(s.length()!=t.length()) return false;
		HashTable<Character,Integer> table = new HashTable<Character,Integer>();
		for(int i =0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(table.get(ch)==null)
				table.put(ch,1);
			else
			{
				int x = table.get(ch);
				table.put(ch,x+1);
			}
		}
		for(int i =0; i<t.length(); i++)
		{
			char ch = t.charAt(i);
			if(table.get(ch)==null)
				table.put(ch,1);
			else
			{
				int x = table.get(ch);
				table.put(ch,x+1);
			}
		}

		for(int i=0; i<t.length();i++)
		{
			char ch1 = ;
			 if()
		}
	}*/
	// using a boolean array
public static boolean anagram(String s, String t)
	{
		if(s.length()!=t.length()) return false;
		int[] table = new int[26];
		for (int i=0; i<s.length() ; i++ )
		{
			table[s.charAt(i)-'a']++;
			//table[t.charAt(i)-'a'] = false;	
		}
		System.out.println(Arrays.toString(table));
		for (int i=0; i<t.length();i++)
		{
			table[t.charAt(i)-'a']--;
			if(table[t.charAt(i)-'a']<0)
				return false;
		}
		System.out.println(Arrays.toString(table));
		/*for(int i =0; i<26; i++)
		{
			if(table[i]<0)
				return false;
		}*/
		return true;
	}
}
