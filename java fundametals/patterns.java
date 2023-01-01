/* 
public class patterns{
    public static void main(String[] args) {
        int i =1;
        while(i<5) {
            System.out.println("*");
            i++;
            
        }
        int j=1;
        while(j<5){
            System.out.print("*");
            j++;
        }
    

    }
}

public class patterns{
    public static void main(String[] args) {
        int n=5;
        int i=1;
       while(i<=n){
        int j=1;
        while(j<=n){
            System.out.print("*");
        
            j++;
        } 
      
        i++;
        System.out.println( );
    }

}
}
 // i represent row
import java.util.Scanner;
public class patterns{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int i=1;
      while(i<=n){
        int j=1;
        while(j<=i){
            System.out.print("*");
            j++;

        }
        i++;
    System.out.println( );  
    }
    }

}
*/
import java.util.*;
public class patterns{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt(); 
        int i=n,j;
        while(i>0)
        {
           j=0;
           while(j++<i)
           {
               System.out.print("*");
           }
           System.out.println();
           i--;
        } 
    }
}