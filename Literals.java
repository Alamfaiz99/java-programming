import java.lang.*;
import java.util.*;

class Literals
{
   public static void main(String arg[])
   {
     //Literals are constant that never change there value through the program run
     //z=5*x+7*y here 5 and 7 are literals
     //Literals also have their data types
     //5 and 7 are int literals---by default
     //double price=153.75; double literal
     //area=3.1425*radius*radius;//any constant with decimal value is by default double literal
     //char c='A'//single quoute is char literal
     //String str="Java"//double quotes are string literals
     //byte,short,int they take integr literal
     
    //5--int literal
    //5l/L---long literal in order to say literal
 

    //2.5--by default it is double literal     
    //2.5f/F---to call it as float
     

    //''--single quoites are character literal

    //boolean--either TRUE/FALSE
    //program
     byte b=15;
     short s=15;
     int i=15;
     //integer literals can be represented in various number system
     //decimal octal binary hexadecimal
     byte b1=10;
     byte b2=0b1010;//--in this way
     byte b3=012;
     byte b4=0xA;
     System.out.println(b1);
     System.out.println(b2);
     System.out.println(b3);
     System.out.println(b4);
//showing how to declare long literal in java 
      long l=9999999999l;
      System.out.println(l);
      float f=12.5f;
      double d=19.276;
      System.out.println(f);
      System.out.println(d); 
//if you ahve bigger number than you can seperate the digits by underscore
      long l=999_999_999;   
}

}