import java.util.*;
import java.lang.*;
class ExcelNumber
{
	public static void main(String[] args)
	{
		String str = "ZZ";
		int result = columnNo(str);
		System.out.println(result);
	}
	public static int columnNo(String str)
	{
		int len = str.length();
		int res=0;
		for(int i=0; i<len; i++)
		{
			res = res * 26 + (str.charAt(i)-'A'+1);
		}
		return res;
	}
}