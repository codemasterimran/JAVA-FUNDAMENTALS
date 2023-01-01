import java.util.*;
public class diamond{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("How many patterns");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print(" ");
        
        }
       for(int a=1;a<=i;a++){
       System.out.print("*");
       }
   for(int b=2;b<=i;b++){   //b=2 bcz coloumn value starting from 2
    System.out.print("*");
   }
    System.out.println();
}
for(int i=1 ;i<=n;i++){
    for(int j=1 ;j<=i ;j++){
        System.out.print(" ");
    }
for(int a=n ;a>=i;a--){
System.out.print("*");

}
for (int b= n-1 ;b>=i;b--){  //b=n-1 bcz starting values are from 4,3,2,1
    
        System.out.print("*");
    }
System.out.println( );
}
}
}