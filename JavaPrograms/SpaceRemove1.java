// my method to remove space Assuming that the string starts with a character and not space
import java.util.*;
import java.lang.*;
class SpaceRemove1
{
	public static void main(String[] args)
	{
		String str = "   hello world  t";
		int truelen = getTrueLength(str);
		System.out.println(truelen);
		int len = str.length();
		System.out.println(len);
		//tr = str.trim(); // correct way to use trim() method

		//String result = replaceSpace(str);
		//System.out.println(result);
	}
	public static String replaceSpace(String str)
	{
		String newStr = "";
		Hashtable<Character,Boolean> h = new Hashtable<Character,Boolean>();
		str = str.replaceFirst("\\s++$",""); /*something new I learned.. how to remove empty spaces just from the end breakdown :
		first: why \\ : because \s is an escape character and value to be found cannot start with that 
		replacefirst will replace the 1st instance of the char specified with the other char in argument passed.
		++ will match previous white space characters and $ is for the end of string. if I don't use ++ it will start removing from the first char and ++ 
		++ also means that the next or previous element should be a blankspace tilll $ i.e end of string
		Thus, the regular expression will match as much whitespace as it can that is followed directly by the end of the string: 
		in other words, the trailing whitespace. if you want to remove only leading white space dont put $ */
		System.out.println(str);
		int len = str.length();
		for(int i=0; i<len;i++)
		{
			char c = str.charAt(i);
			h.put(c,false);
		}
		h.put(' ',true);
		for(int i=0; i<len; i++)
		{
			char c = str.charAt(i);
			if(h.get(c)==false)
			{
				newStr=newStr+c;
			}
			else
			{
				newStr=newStr+"%20";
			}
		}
		return newStr;
	}
	private static int getTrueLength(String str) {
        int count=0;
        int length = str.length();
        char[] strChar = str.toCharArray();

        //backtrack from end of string to count padding
        for (int i=length-1; i >=0; i--){
            if (strChar[i]!= ' ')break;
            count++;
        }
        return length-count;
    }
}