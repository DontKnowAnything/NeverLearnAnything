import java.util.Scanner;
public class Lab3
{
   public static void main(String[]args)
   {
      Catalog c=new Catalog();
      Scanner k=new Scanner(System.in);
      int choice;
      do{
         System.out.println("Enter");
         choice=k.nextInt();
         if(choice==3)
         {
            System.out.println("Enter int");
            int i=k.nextInt();
            if(i.equals(i)){
               System.out.println("Enter desciption");
               String d=k.next();
               System.out.print("Enter cost");
               c.add(i,d);
               System.out.println(c.toString());}
         }
         else if(choice==4)
         {
            System.out.println("Enter id of item to remove");
            int r=k.nextInt();
            c.remove(r);
            System.out.println(c.toString());
         }
      }while(choice!=7);
   }
}