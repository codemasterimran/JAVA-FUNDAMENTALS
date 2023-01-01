/* 
import java.util.Scanner;
public class ifelse{

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");

        int x=sc.nextInt();

        if 
            ( x%2==0){
                System.out.println("number is prime");
            }
            else 
            {
                System.out.println("Number is odd");
            }
        
        

    
            
        
    }
}

// print sum of n natural numbers and if entered negative print number entered is negative \
import java.util.Scanner;
class ifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for sum");
        int x= sc.nextInt();
        if (x>=0){

            System.out.println("Sum is:");
            System.out.println(x*(x+1)/2);
        }
        else {
            System.out.println("Number entered is negative error cannot perform sum");
        }
    }
}
*/
// code to find out whether the number is positive even , positive odd , negative even , negative odd 
import java.util.Scanner;
class ifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x= sc.nextInt();
      if(x>0) {
      System.out.print("positive ");
      if (x%2==0) 
      System.out.print("Even \n");
      else 
      System.out.print("odd \n");
      }
      else if (x>0)
      {
        System.out.print("Negative ");
        if(x%2==0)
        System.out.println("Even");
        else 
        System.out.println("odd");
      }
      else {
        System.out.println("zero");
      }

    }
}

    