import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    System.out.println("Hello, Dcoder!");
    int n;
    int number;
    System.out.print("enter input");
    Scanner s = new Scanner(System.in);
    n=s.nextInt();
    number=s.nextInt();
    for(int i =1;i <=n;i++)
    {
      for(int j =1;j <=i;j++)
      {
        System.out.print(number + " ");
        number++;
      }
      System.out.println();
    }   
 }
}