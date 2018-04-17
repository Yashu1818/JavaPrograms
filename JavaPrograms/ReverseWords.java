//Reverse words in a string
import java.util.*;
class ReverseWords
{
	public static void main(String[] args)
	{
		String str = "Hello World";
		String reversed = reverse(str);
		System.out.println(reversed);
	}
	public static String reverse(String str)
	{
		String[] words = str.split(" ");
		for(int i =0; i<words.length; i++)
		{
			words[i] = new StringBuilder(words[i]).reverse().toString();
		}
		StringBuilder result = new StringBuilder();
		for(String word : words)
		{
			result.append(word + " ");
		}
		return result.toString().trim();
	}
}