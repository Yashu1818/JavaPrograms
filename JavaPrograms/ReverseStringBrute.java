//reverse string 7ms
import java.util.*;
import java.lang.*;
class ReverseStringBrute
{
	public static void main(String[] args)
	{
		String str = "Hello";
		String result = reverse(str);
		System.out.println(result);
	}
	public static String reverse(String str)
	{
		byte[] str1 = str.getBytes(); // this method gets the bytes value of each element of string and stores it in a var/array of bytes.
		int len = str1.length;
		//String res = "";
		byte[] str2 = new byte[len];
		for(int i=0; i<len; i++)
		{
			
			
			str2[i]= str1[len-i-1];			//MISTAKE... IT WON'T work.. reason unknown?? Ans. USE BYTE array instead of CHAR array
			
			//res = res + str.charAt(i);  // error in this is that its not good for long strings.. time lim exceedes error;
		}

		//System.out.println(str2);
		//String res = String.valueOf(str2); // this method returns value of elements in an array in the form of a string
		//System.out.println(res);
		String res = new String(str2); // this is how you convert a byte/char array to string 
		return res;
	}
}