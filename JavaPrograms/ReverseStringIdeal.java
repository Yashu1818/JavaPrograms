// improved reverse string 2ms using swapping
import java.lang.*;
import java.util.*;
class ReverseStringIdeal
{
	public static void main(String[] args)
	{
		String str = "Hello";
		String result = reverse(str);
		System.out.println(result);
	}
	public static String reverse(String str)
	{
		//swapping krne k lie array me convert kar
		char[] c = str.toCharArray();
		int j = c.length - 1;
		char temp;
		for(int i =0 ; i<j ;i++)
		{
			//swapping
			temp = c[0];
			c[0] =c[j];
			c[j] = temp;
			j--;
		} 
		String res = new String(c);
		return res;
	}
}