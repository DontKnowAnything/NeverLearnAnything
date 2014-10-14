public class Memory
{
	private char[][] board;
	private char[][] display;//Displays	the array
	private char[]characters={'@','@','!','!','#','#','%','%','$','$','^','^','&','&','+','+'};//Holds character pairs
	/**
	 *	Constructor	builds board array
	 */
	public Memory()
	{

		board=new char [4][4];
		display=new char[4][4];

		for(int r=0;r<board.length;r++)
		{
			
			for(int c=0;c<board[r].length;c++)
			{
				board[r][c]=characters[r];
			}
		}
		for(int r=0;r<display.length;r++)
		{
			for(int c=0;c<display[r].length;c++)
			{
				display[r][c]='?';
			}
		}		
	}
	/**
	 *	This constructor has the sizes of boards
	 *	@param size 
	 */
	public Memory(int size)
	{

		//instantiate arrays
		board=new char[size][size];
		display=new	char[size][size];
		String temp;
		
		for(int r=0;r<board.length;r++)
		{
			for(int c=0;c<board[r].length;c++)
			{
				board[r][c]=characters[c+1];
			}
		}
		for(int r=0;r<display.length;r++)
		{
			for(int c=0;c<display[r].length;c++)
			{
				display[r][c]='?';//initialize
			}
		}
	}
	/**
	 *	The toString Method displays the array
	 *	@return The	String representation of the display array
	 *	*/
	public String toString()
	{
		String s="";
		s+="Current Board\n";
		s+="  ";
		for(int d=0;d<board.length;d++)
		{
			s+=d+1+" ";
		}
		s+="\n";
		for(int r=0;r<display.length;r++)
		{
			s+=r+1+" ";
			for(int c=0;c<display[r].length;c++)
			{

				s+=display[r][c]+" ";
			}
			s+="\n";
		}
		return s;
	}
	/**
	 *When the user enters a tile	number, this method will reveal the	tile
	 *	@param f	
	 *	@param s
	 *	@return The	
	 */
	public boolean reveal(int f,int s)
	{
		boolean r = true;
		f=0;

		for(s=0;s<board.length;s++)
		{
			
			display[f]=board[s];
			board[s]=display[f];
		}
		return r;
	}
	public boolean hide(int f, int s)
	{
		boolean r=false;
		for(s=0;s<board.length;s++)
		{
			board[s]=display[f];
			display[f]=board[s];
		}
		return r;
	}
	/**
	 *	The match method checks	if	the user input	is	a match
	 *	@param br A	row of the board array
	 *	@param bc A	column of the board array
	 *	@param dr A	row of the display array
	 *	@param dc A	column of the display array
	 *	@return The	result of user	input
	 */
	public boolean	match(int br, int bc, int dr, int dc)
	{
		boolean bdm;
		if(display[br][bc]==board[dr][dc] )
		{
			bdm= true;
		}
		else
		{
			bdm=false;
		}
		return bdm;
	}
}
