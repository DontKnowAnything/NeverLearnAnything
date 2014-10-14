

import java.util.*;
/**
 * @author Patrick McKnew
 *
 */
public class Lab1
{
	Scanner keyboard=new Scanner(System.in);//Accepts user input
	/**
	 * The main method runs the program.
	 */
	public static void main(String[]args)
	{
		String yn="Do you have another ticket to check?(Y or N)";
		String in="Enter your ticket numbers:";
		Lab1 l1=new Lab1();
		int five=5;//Amount of elements
		int[] f=new int[five];//Needed for Lottery object and ui method
		Lottery a=new Lottery(f);//Lottery Object
		
		System.out.println(in);
		while(l1.keyboard.hasNext())
		{
			String s1;
			for(int i=0;i<f.length;i++)
			{
				f[i]=l1.keyboard.nextInt();
			
				if(a.match(f)==5)
				{
					System.out.println("You matched all "+a.match(f)+"numbers! You're the winner of the Grand Prize...An exclusive all expensive paid \n"
							+ "trip to AACC. This trip includes a walking tour from east campus to west campus, a tour of the CALT \n"
							+ "Building and a front row parking space for an entire day!! Congratulations!");
				}
			}
			System.out.println(a.toString());//Calls Lottery toString method
			System.out.println("You matched "+a.match(f));//Calls match method
			System.out.print(yn);
			
			s1=l1.keyboard.next();
			if(s1.equals("n"))
			{
				break;
			}
		}	
	}
}
