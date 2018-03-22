import java.util.*;
import java.lang.*;
class FizzBuzz
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:");
		int n = sc.nextInt();
		List<String> result =fizzBuzz(n);
		System.out.println(String.join("\n",result));
	}
	/*public static void fizzBuzz(int n) //brute force (without any return type i.e void)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else if(i%3==0)
				System.out.println("Fizz");
			else if(i%5==0)
				System.out.println("Buzz");
			else
				System.out.println(Integer.toString(i));
		}
	}*/
	public static List<String> fizzBuzz(int n)
	{
		List<String> res = new ArrayList<String>(n);
		for (int i=1;i<=n ;i++ ) 
		{
			if(i%3==0 && i%5==0)
				res.add("FizzBuzz");
			else if(i%3==0)
				res.add("Fizz");
			else if(i%5==0)
				res.add("Buzz");
			else
				res.add(String.valueOf(i));	
		}
		return res;
	}
}