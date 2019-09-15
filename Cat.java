//Created by James Vanderhyde, 12 April 2011
// Copied from Horstmann Lab Manual
//lab18
public class Cat implements Speakable
{
   private String name;

   public Cat(String name)
   {
      this.name = name;
   }
   
   public void speak() {
	   System.out.println("Meow.");
   }

   public String toString()
   {
      return "Cat:  " + name;
   }

}
