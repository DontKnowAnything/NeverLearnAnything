import java.util.Scanner;

public class Lab2 {
	Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		Memory m = new Memory();
		int size;
		String st;
		Lab2 l2 = new Lab2();
		String fr = "Enter a row number for your first selection:";
		String fc = "Enter a col number of your first selection:";
		String sr = "Enter a row number for your second selection:";
		String sc = "Enter a col number for your second selection:";
		String q = "Enter Q to quit or any letter to continue:";
		int f = 0;
		int s = 0;
		int br;
		int bc;
		int dr;
		int dc;

		System.out.print("Enter board size:");
		if (l2.keyboard.nextInt() == 2)
		{
			size=l2.keyboard.nextInt();
			Memory m2 = new Memory(size);
			System.out.println(m2.toString());
			do {
				System.out.println(fr);
				br=l2.keyboard.nextInt();
				if (br != 3)
				{
					System.out.print(fc);
					bc=l2.keyboard.nextInt();	
					if (bc!=3)
					{
						m2.reveal(br, bc);//display selected tile
						System.out.println(m2.toString());
						System.out.println(sr);
						dr=l2.keyboard.nextInt();
						if(dr!=3)
						{
							System.out.println(sc);
							dc=l2.keyboard.nextInt();
							/*if(m2.match(br, bc, dr, dc)==true)
							{
								System.out.println("You win");
							}
							else
							{
								m2.hide(f, s);
								m2.toString();
							}*/
						}
					}
				}System.out.println(q);
			} while (l2.keyboard.nextLine()!="Q" &&l2.keyboard.nextLine()!="q");
		}  
		else if (l2.keyboard.nextInt()==4)
		{
			size=l2.keyboard.nextInt();
			Memory m2 = new Memory(size);
			System.out.println(m2.toString());
			do {
				System.out.println(fr);
				br=l2.keyboard.nextInt();
				if (br != 7)
				{
					System.out.print(fc);
					bc=l2.keyboard.nextInt();	
					if (bc!=7)
					{
						m2.reveal(br, bc);//display selected tile
						System.out.println(m2.toString());
						System.out.println(sr);
						dr=l2.keyboard.nextInt();
						if(dr!=7)
						{
							System.out.println(sc);
							dc=l2.keyboard.nextInt();
							/*if(m2.match(br, bc, dr, dc)==true)
								{
									System.out.println("You win");
								}
								else
								{
									m2.hide(f, s);
									m2.toString();
								}*/
						}
					}
				}System.out.println(q);
			} while (l2.keyboard.nextLine()!="Q"||l2.keyboard.nextLine()!="q");
		}
		else if (l2.keyboard.nextInt()==6) 
		{
			size=l2.keyboard.nextInt();
			Memory m2 = new Memory(size);
			System.out.println(m2.toString());
			do {
				System.out.println(fr);
				br=l2.keyboard.nextInt();
				if (br != 7)
				{
					System.out.print(fc);
					bc=l2.keyboard.nextInt();	
					if (bc!=7)
					{
						m2.reveal(br, bc);//display selected tile
						System.out.println(m2.toString());
						System.out.println(sr);
						dr=l2.keyboard.nextInt();
						if(dr!=7)
						{
							System.out.println(sc);
							dc=l2.keyboard.nextInt();
							/*if(m2.match(br, bc, dr, dc)==true)
								{
									System.out.println("You win");
								}
								else
								{
									m2.hide(f, s);
									m2.toString();
								}*/
						}
					}
				}System.out.println(q);
			} while (l2.keyboard.nextLine()!="Q"||l2.keyboard.nextLine()!="q");
		}
	}

}

