import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("SELECT THE OPERATION :\n 1.ADDITION\n 2. SUBSTRACTION\n 3.MULTIPLICATION");
    int operation = sc.nextInt();

    if(operation!=1 && operation!=2 && operation!=3 ){
        System.out.println("Invalid input");

    } else {
        System.out.println("Enter first number");
        int a =sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();


      if(operation==1){
        System.out.println(a+b);
      } else if (operation==2){
        System.out.println(a-b);

      } else if (operation==3){
        System.out.println(a*b);
      }                
    }             
                    
}    
}
