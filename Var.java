import java.lang.*;

class Var
{
   public static void main(String arg[])
   {//single line comment
    /* multiline comments*/
       //byte b=130;
   //range of byte -128 to 127
//it will throw an eroor
       byte b=127;
       System.out.println(b);
       //b=25;
       //System.out.println(b);
       //now short data type
       short s=32681;
       System.out.println(s);
       //float
       float f=25.3f;
       System.out.println(f);
/*Rules of declaring variables
1.case sensitive
2.contains alphabets and numbers _ or $
3.starts with alphabet _ or $
4.should not be keywords
5.should not be class name
6.no limit on lengh of anme
7.follow camel cases
keyword are certain reserved word that convey a special meaning to compiler*/    
/*now what is camel cases
 byte roll_number;
 byte rollNumber;
 means second word starts with caps in java -thats standard way to declare varible
except the first word every word first letter is capital 
float averageMarksOfClass------camel cases followed by java and other new languages

*/
      int x;
      int X;//allowed two different variables
      int roll_number$student;
      //int 1x;not start with numbers
      //float int;int is keyword na dvariable name not be keyword
       int String=10;//its allowing me to declare the variable name as class name
       System.out.println(String);
       int rollNumeberOfStudent;
float averageMarksOfClass;
    }

}