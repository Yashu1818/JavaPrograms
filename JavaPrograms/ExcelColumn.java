import java.util.*;
import java.lang.*;
class ExcelColumn
{
	public static void main(String[] args)
	{
		int n = 702;
		String result = excelCol(n);
		System.out.println(result);
	}
	public static String excelCol(int n)
	{
		StringBuilder str = new StringBuilder();
		while(n>0)
		{
			n--;
			str.append((char)('A'+n%26));
			n = n/26;
		}
		str.reverse(); // because we started appending the last value 1st;
		return str.toString();

	}
}