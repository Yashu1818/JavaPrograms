//String permutations
import java.util.*;
import java.lang.*;
class StringPermutation
{
	public static void main(String[] args)
	{
		String s = "aabc";
		List<String> ans = permutations(s);
		System.out.println(ans);
	}
	public static List<String> permutations(String s)
	{
		List<String> results = new ArrayList<String>();
		getPermutation("",s,results);
		return results;
	}
	public static void getPermutation(String prefix, String suffix, List<String> results)
	{
		if(suffix.length()==0)
		{
			results.add(prefix); //each time a permutation is done, add it to the result list
		}
		else
		{
			for(int i=0; i<suffix.length();i++) //for each character of the suffix string i.e the original word
			{
				getPermutation(prefix+suffix.charAt(i),suffix.substring(0,i)+suffix.substring(i+1,suffix.length()),results);
			}
		}
	}
}