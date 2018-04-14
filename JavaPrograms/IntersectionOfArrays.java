//intersection of 2 arrays
import java.util.*;
import java.lang.*;
class IntersectionOfArrays
{
	public static void main(String[] args)
	{
		int[] n1 = {1,2,1,2};
		int[] n2 = {2,1};
		int[] ans = intersection(n1,n2);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] intersection(int[] n1 , int[] n2)
	{
		List<Integer> res = new ArrayList<Integer>(); // we are using the list because we don't know the size of intersection
		Arrays.sort(n1); // we need to sort both the arrays in order to compare their values to find duplicate
		Arrays.sort(n2);
		for(int i =0, j=0 ; i<n1.length && j<n2.length;) //multiple variable initialization and no incremmenter
		{
			if(n1[i]<n2[j]) //compare and if its smaller i.e all the other nos to the left are not intersectiom
			{
				i++; // and so we check for the next no.
			}
			else if(n1[i]==n2[j]) //if common element found
			{
				res.add(n1[i]);
				i++;
				j++;
			}
			else 
			{
				j++;  //this means that if a particular no.
					 // at pos i is greater than the no. at pos j then all 
					 //other remaining values to the right of i will be greater and there won't be a match so increment the value of j
			}
		}
		int[] result = new int[res.size()];
		for(int i=0; i<result.length;i++)
		{
			result[i] = res.get(i);
		}
		return result;
	}
}