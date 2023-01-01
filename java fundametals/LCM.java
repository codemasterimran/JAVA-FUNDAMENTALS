import java.util.*;
public class LCM {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int a=sc.nextInt();
        System.out.println("enter number second ");
        int b=sc.nextInt();
        int x=Math.max(a,b);
        int y=a*b ;
        int ans=x;
        for(int i=x; i<=y;i++ ){
            if(i%a==0 && i%b==0){
                ans=i;
                break;
            }
                
            }
            System.out.println(ans);
        }

    }

