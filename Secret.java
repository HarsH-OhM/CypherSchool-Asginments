package Assignment;

import java.util.*;
public class Secret
{


	public static void EncryptFunction( int[] key,String[] value)
	{
		for(int i=0;i<key.length;i++)
		{
			
			switch(key[i])
			{
				case 0:
					char c[]=value[i].toCharArray();
					for(int j=0;j<c.length;j++)
					{
						c[j]=(char)((int)c[j]+2);
					}
					System.out.println(c);
					break;

				case 1:
					char c1[]=value[i].toCharArray();
					for(int j=0;j<c1.length;j++)
					{
						System.out.print((int)c1[j]+".");
					}
					System.out.println();
					break;

				case 2:
					StringBuilder sb=new StringBuilder(value[i]);
					sb.reverse();
					System.out.println(sb);
					break;
				default:
					System.out.println("Invalid Operation!");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String []key=new String[n];
		for(int i=0;i<n;i++)
		{
			key[i]=sc.nextLine();
		}
		int []value=new int[n];
		for(int i=0;i<n;i++)
		{
			 value[i]=sc.nextInt();
		}

		EncryptFunction(value,key);
	}
}