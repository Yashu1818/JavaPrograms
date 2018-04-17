//Robot Simulation of circle
import java.util.*;
class JudgeCircle
{
	public static void main(String[] args)
	{
		String moves = "UDRL";
		boolean ans = completes(moves);
		System.out.println(ans);
	}
	public static boolean completes(String moves)
	{
		int x = 0;
		int y =0;
		char[] move = moves.toCharArray();
		for(char m : move)
		{
			if(m=='U') y++;
			else if(m=='D') y--;
			else if (m=='R') x++;
			else x--;
		}
		return x==0 && y==0;
	}
}