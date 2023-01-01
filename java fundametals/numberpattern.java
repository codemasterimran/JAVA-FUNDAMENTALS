/* 
import java.util.*;
public class numberpattern{
    public static void main(String[] args) {
        System.out.println("how many pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
System.out.println();
}
    }
}


import java.util.*;
public class numberpattern{
    public static void main(String[] args) {
        System.out.println("how many pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(i);
    }
System.out.println();
}
    }
}


import java.util.*;
public class numberpattern{
    public static void main(String[] args) {
        int count =0;
        System.out.println("how many pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        count=count+1;
        System.out.print( count);
    }
System.out.println();
}
    }
}

import java.util.*;
public class numberpattern{
    public static void main(String[] args) {
        
        System.out.println("how many pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=i;j>=1;j--){
       
        System.out.print( j+" ");
    }
System.out.println();
}
    }
}

import java.util.*;
public class numberpattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many patterns");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
        for(int a=i-1;a>=1;a--){
            System.out.print(a+" ");
        }
       System.out.println();
    }
    }
}

import java.util.*;
public class numberpattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many patterns");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
       System.out.println();
        }
    }
}
*/
public class numberpattern{
    public static void main(String[] args) {
        
    
    for(int i=1;i<=5;i++){
    int no =i ;   
    for(int j=1; j<=i; j++){
        System.out.print(no +" ");
        no=no+5-j;
    }
System.out.println();   
}
}
}