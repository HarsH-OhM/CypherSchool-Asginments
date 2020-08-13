package Assignment;

import java.util.*;

public class Game
{

	public static void operation(String s1, String s2, int c)
	{
		int sum=0;
		
		switch(c)
		{
			case 0:
			{
				char ch[]= s1.toCharArray();
				char ch1[]=s2.toCharArray();
				for(char c1:ch)
				{
					sum+=(int)c1;
				}
				for(char c1:ch1)
				{
					sum+=(int)c1;
				}
				System.out.println(sum);
				break;
			}
			case 1:
			{
				String s3=s1+s2;
				System.out.println(s3);
				break;
			}
			case 2:
				{
					int n=Integer.parseInt(s1);
				char ch2[]= s2.toCharArray();
				for(char c1:ch2)
				{
					sum+=(int)c1;
				}
				System.out.println(n+sum);
				break;
			}
			default:
				System.out.println("Invalid Operation");

		}

	}

	public static void main(String ...args)
	{
		Scanner sc= new Scanner(System.in);
		String typ1=sc.nextLine();
		String typ2=sc.nextLine();
		int typ3=sc.nextInt();

		operation(typ1,typ2,typ3);


	}
}