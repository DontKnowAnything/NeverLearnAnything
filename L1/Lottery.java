import java.util.*;
/**
 * The Lottery class simulates a lottery drawing.
 * @author Patrick Mc Knew
 *
 */
public class Lottery
{
	private int[]lotteryNumber= {1,2,3,4,5};//The lottery array

	/**
	 * The constructor sets each array element to a random element
	 * @param l So the Lottery object in Lab1 can hold array
	 */
	public Lottery(int[]l)
	{
		Random r=new Random();
		int max=50;//Will change back to 50;
		for(int i=0;i<lotteryNumber.length;i++)
		{
			lotteryNumber[i]=r.nextInt(max);//Sets 5 lottery array elements to random numbers
		}
		
	}
	/**
	 * The match method matches the user input from the method ui, stores it 
	 * into its parameter array, and compares each element to lotteryNumbers
	 * @param m Holds user input.
	 * @return Returns the number of matches
	 */
	public int match(int[]m)
	{		
		int count=0;
		for(int index=0;index<lotteryNumber.length;index++)//the outer loop
		{
			for(int i=0; i<m.length;i++)//inner loop
			{
				if(lotteryNumber[index]==m[i])//Conditional Statement
				{
					count+=1;
					
				}
				
			}
		}
		return count;
	}
	
	/** 
	 * The toString method sorts lotteryNumber, then puts the numbers into a readable format, and tell how many matched.
	 * @return Returns String s
	 */
	public String toString()
	{
		String s;//displays the String
		
		Arrays.sort(lotteryNumber);
		s="The lottery numbers were "+Arrays.toString(lotteryNumber)
				.replace("[", "")
				.replace("]", "");
		return s;
		
	}
}
