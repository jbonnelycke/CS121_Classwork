public class StringEqual
{
   public static void main(String[] args)
   {
      String str1 = "abcd";
      String str2 = "cat";
      String str3 = "Cat";
      System.out.println("str2 = " + str2);
      System.out.println("str3 = " + str3);
      int result = str2.compareTo(str3);
      if (result < 0)
    	  System.out.println("Str2 is less than str3");
      else if (result > 0)
         System.out.println("Str2 is bigger than str3");
      else
         System.out.println("The strings are equal");
   }
}