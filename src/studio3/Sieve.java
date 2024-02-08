package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the max number?");
		int i = in.nextInt();
		int j = 0;
	boolean list [] = new boolean [i];
	for (int l= 0;l < list.length; l++)
	{
		list[l]=true;
		




	}
	for (int l = 2;l< Math.sqrt(i); l++)
	{ 
		if (list[l-2] =true)
		{
			for (int m = (int) Math.pow(l,2); m < i; m+=l)
			{
				list [m-2] = false;
			}
			System.out.println (list[l]);
	}
	} 
	
{
{
}
	}

}}
