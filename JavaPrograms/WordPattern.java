import java.util.*;
class WordPattern 
{
	public static void main(String[] args)
	{
		String pattern = "abaa";
		String str = "dog cat dog cat";
		boolean b = wordPattern(pattern,str);
		System.out.println(b); 
	}

    public static boolean wordPattern(String pattern, String str) 
    {
    	String[] words = str.split(" ");
    	HashMap<String,Integer> map = new HashMap<>();
    	int i;
    	if(words.length != pattern.length())
    	{
    		return false;
    	}
    	    
    	for(i=0; i< words.length; i++)
    	{
    		String a =  Character.toString(pattern.charAt(i)); // character in one string to another string 
    		String b = words[i];
    		Integer iobj = new Integer(i);
    		Integer x = map.put(a,iobj);
    		Integer y = map.put(b,iobj);
    		if(map.get(x) != map.get(y))
    		{
    			return false;
    		}
    	}
    	return true;
    }
}