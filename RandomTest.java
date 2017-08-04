import java.util.Scanner;

public class RandomTest //programmer-defined class
{
   public static void main(String args[])
      {
          //local declarations
         int iNumber1 = 2;
         int iNumber2 = 3;
         int x = (int) (Math.random() * 6 + 1);
         System.out.println("The die shows: " + x + "\n");

         Scanner sc = new Scanner(System.in);
         

         //System.out.println("The die shows: ");
         // iNumber1 = sc.nextInt();
 
        //System.out.println("The radius is: " + calcArea(iNumber1)); 
      } 
    public static double calcArea(int x){
     final double PI = 3.14159;
     return PI * Math.pow(x,2);
    }
}
 