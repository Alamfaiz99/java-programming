import java.lang.*;
import java.util.*;

class KeybRead1
{
   public static void main(String arg[])
   {
     Scanner sc=new Scanner(System.in);                 
    
     sc.useRadix(2);		

     System.out.println("Enter a number:");
     int x;
      x=sc.nextInt();
      System.out.println(x);
      
    }

}