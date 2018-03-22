//BruteForce ONLY WORKS FOR Roman Nos of length 2 not even for length 1 or length 3 ONLY FOR 2.
import java.util.*;
import java.lang.*;
class RomanToInteger1
{
	public static void main(String[] args)
	{
		String s = "XII";
		int y1 = romanToInt(s);
		System.out.println(y1);
	}
	 public static int romanToInt(String s) 
	{
		String romannum = "IVXLCDM";
        char[] roman = romannum.toCharArray();
        int[] intval = {1,5,10,50,100,500,1000};
        Hashtable<Character,Integer> h = new Hashtable<Character,Integer>();
        int y = 0;
        for(int i=0; i<roman.length;i++)
        {
        	h.put(roman[i],intval[i]);
        }
        for(int i=0;i<s.length();i++)
        {
        	char c = s.charAt(i);
        	if(i+1<s.length())
            {
                char b = s.charAt(i+1);
            
        	   if(h.get(c)>h.get(b))
        	   {
        		y = (int)h.get(c) + h.get(b);
        	   }
        	    else if(h.get(c)<h.get(b))
        	   {
        		y = (int)h.get(b)-h.get(c);
        	    }
        	else
        	{
        		y=(int)h.get(c);
        	}
        }
        
    }
    return y;
}
}