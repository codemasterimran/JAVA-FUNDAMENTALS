import java.util.*;
public class fibonacci {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no. of times");
    int n= sc.nextInt();
    int a=0,b=1;
    System.out.println(a+" "+b);
    int c;
    for(int i=1;i<=n;i++){
    c=a+b;
    System.out.println(""+c);
    a=b;
    b=c;
}
}

}
