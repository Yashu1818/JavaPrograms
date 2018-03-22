//prime count better version-> STILL NOT ACCEPTED BECAUSE OF LARGE NO and small no conflict: inputs egs: 499979 and 3; BEST SOLUTION IS USE SEIVE ALGOS
import java.util.*;
import java.lang.*;
class PrimeCount
{
	public static void main(String[] args)
	{
		int n = 499979;
		int result = count(n);
		System.out.println(result);
	}
/*	public static int count(int n)
	{
		boolean[] prime = new boolean[n];
		int count = 0;
		for(int i = 2; i<Math.sqrt(n); i++)
		{
			if(prime[i]==false)
			{
				count++;
				for(int j =i; i*j<n; j++)
				{
					prime[i*j]=true;
				}
			}
		}
		return count;
	}*/
	public static int count(int n)
	{
		boolean[] prime = new boolean[n];
        int count = 0;
        for (int i=2; i<n; i++) {
            if (prime[i]) //if this returns true then continue statements neglects the bottom statements and executes the loop again with a new value of i;
                continue;
             
            count++;
            for (int j=i; j<n; j=j+i) //all multiples of that no. shuold be made true
                prime[j] = true;
        }
         
        return count;

	}
}