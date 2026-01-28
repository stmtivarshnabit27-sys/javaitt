import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
        abstract void setPrice(int p);
	String getTitle(){
		return title;
	}
        int getPrice()
        {
               return price;
        }
}
class MyBook extends Book {
    void setTitle(String s)
    {
        this.title= s;
}
     void setPrice(int p)
     {
         this.price= p;
      }
}
public class Main{
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook novel=new MyBook();
		novel.setTitle(title);
		System.out.println("The title is: "+novel.getTitle());
                novel.setPrice(price);
                System.out.println("The price is: "+novel.getPrice());
      	sc.close();
	}
}