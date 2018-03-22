import java.util.*;
class NonRepeatingCharacter
{
public static void main(String args[])
{
	String str = "abcabcabcabcdefdefz";
	char res = firstnonrepeating(str);
	System.out.println(res);
}
public static char firstnonrepeating (String str)
{
	Hashtable charhash = new Hashtable();
	int i,X;
	char c;
	for(i=0;i<str.length();i++)
	{
		//System.out.println(str.charAt(i));
		c = str.charAt(i);
		//X = (int) ;
		if (charhash.get(c) == null)
			charhash.put(c,1);
		else
		{
			X = (int)charhash.get(c);
			charhash.put(c,X+1);	
		}
	}	
	//System.out.println(charhash);
	for(i=0;i<str.length();i++)
	{
		c = str.charAt(i);
		int k = (int)charhash.get(c); 
		if(k == 1)
			return c;
	}

	return 0;
}
}