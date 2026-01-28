import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Arithmetic {
   int Arithmetic(int a,int b)
    {
        return a+b;
    }
}
class Adder extends Arithmetic
{
    int add(int a ,int b)
    {
       return a+b;
    }
}
class Subract extends Arithmetic
{
    int sub(int a , int b)
    {
      return a-b;
    }
}
public class Solution{
    public static void main(String []args){
        Adder a = new Adder();
        Subract sub = new Subract();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
        System.out.print(a.sub(10,32) + " " + a.sub(10,3) + " " + a.sub(10,10) + "\n");
     }
}
