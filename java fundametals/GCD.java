import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
           int a=sc.nextInt();
           System.out.println("enter number");
           int b=sc.nextInt();
           int ans=1;
           int x=Math.min(a,b);
           for(int i=1;i<=x;i++){
            if(a%i==0 && b%i==0){
                ans=i;

            }
           }
          System.out.println(ans);
    }
    
}
