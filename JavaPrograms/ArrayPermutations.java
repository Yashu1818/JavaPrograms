//Array Permutations
import java.util.*;
import java.lang.*;
class ArrayPermutations
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3};
		ArrayList<int[]> ans = permutations(a);
		System.out.println(ans.toString());
	}
	public static ArrayList<int[]> permutations(int[] a)
	{
		ArrayList<int[]> results = new ArrayList<int[]>();
		getPermutations(a,0,results);
		return results;
	}
	public static void getPermutations(int[] a, int start, ArrayList<int[]> results)
	{
		if(start>=a.length)
		{
			results.add(a.clone());
		}
		else
		{
			for(int i=0;i<a.length;i++)
			{
				swap(a,start,i);
				getPermutations(a,start+1,results);
				swap(a,start,i);
			}
		}
	}
	public static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}