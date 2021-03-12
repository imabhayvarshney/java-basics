package pattern3;

import java.util.Scanner;

import pattern2.Pattern2;

public class pattern3
{

	void pat(int n)
	{
		int i, j,coef=1;        
		int  k = 0, count = 0, count1 = 0;

		  for(i = 0; i < n; i++)
		  {
		      for(int space = 1; space < n - i; ++space) 
		      {
		        System.out.print("  ");
		      }

		      for(j = 0; j <= i; j++) 
		      {
		        if (j == 0|| i == 0)
		          coef = 1;
		        else
			          coef = coef * (i - j + 1) / j;

		      
		        System.out.printf("%4d", coef);
		      }
		      System.out.println();
		  }
	}
	   
	public static void main(String[] args) 
	{
		pattern3 fs=new pattern3();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n=sc.nextInt();
		fs.pat(n);
	}

}
