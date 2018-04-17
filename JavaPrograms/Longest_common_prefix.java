//Longest Common Prefix
import java.util.*;
import java.lang.*;
class Longest_common_prefix
{
	public static void main(String[] args)
	{
		String[] strs = {"abd","aba","abc","abe","ab","fef"};
		String prefix = lcp(strs);
		System.out.println(prefix);
	}
	public static String lcp (String[] strs)
	{
		int len = strs.length;
		if(len==0) return "";
		if(len==1) return strs[0];
		StringBuilder s = new StringBuilder();
		Arrays.sort(strs);
		char[] first = strs[0].toCharArray();
		char[] last = strs[len-1].toCharArray();
		for(int i=0,j=0; i<first.length && j<last.length; i++,j++)
		{
			if(first[i]==last[j])
			{
				s.append(last[j]);
			}
			else
			{
				break;
			}
		}
		return s.toString();
	}
}