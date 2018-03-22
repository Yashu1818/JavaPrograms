import java.util.*;
import java.lang.*;
class StringCompress // leetcode... returns length of the string
{
	public static void main(String[] args)
	{
		char[] chr = {'a','a','b','b','c','c'};
		int compresslen = compress(chr);
		System.out.println(compresslen);
	}
	public static int compress(char[] chr)
	{
		int start = 0; //read head
		int ans = 0;  // write head
		int len = chr.length;
		while(start<len)
		{
			int count = 0;
			char current = chr[start];
			while(start<len && chr[start]==current)
			{
				start++;
				count++;
			}
			chr[ans] = current; //this is printing extra last char
			ans++;
			
			if(count!=1)
			{
				char[] counter = Integer.toString(count).toCharArray();
				int len1 = counter.length;
				for (int i=0;i<len1 ; i++) {
					chr[ans]=counter[i];
					ans++;
				}
			}
		}
		//String str = new String(chr); //why returning last char twice?
		//System.out.println(str);
		return ans;
	}
}