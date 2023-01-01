/* 
import java.util.*;
public class patternsforloop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of patterns ");
        int n=sc.nextInt();     

        for(int i=1; i<=n ;i++){

            for(int j=n; j>=i;j--) {

                System.out.print("j");
           
         }
         System.out.println( );
        }
        
    
    }
}


import java.util.Scanner;
public class patternsforloop{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.println("how many patterns" );
    int n= sc.nextInt();
        
    for (int i=1;i<=n;i++){
        for( int j=1; j<=i ;j++){
            System.out.print(j);
        }
    System.out.println( );
    }
        
    for (int i=1;i<=n;i++){
        for( int j=n; j>=i ;j--){
            System.out.print(j);
        }
    System.out.println( );
    }
    }
}

import java.util.*;
public class patternsforloop {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("how many patterns");
    int n= sc.nextInt();

    for(int i=1;i<=n; i++){
        for(int j=1 ;j<=i ;j++){
            System.out.print(" ");

        }
    for(int a=n; a>=i ;a--){
        System.out.print(a);
    }
   System.out.println( );
}
}
}

import java.util.*;
public class patternsforloop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many patterns");
    int n= sc.nextInt();
    for(int i=1 ;i<=n;i++){
        for(int j=n ;j>=i ;j--){
            System.out.print(" ");
        }
   for(int a=1 ;a<=i;a++){
    System.out.print("*");
   }
   System.out.println();
    }
   for( int i=1 ;i<=n ;i++){
    for(int j=1;j<=i;j++){
     System.out.print(" ");
    }
    for(int a=n ;a>=i;a--){
        System.out.print("*");
    }
  System.out.println();
}
}
}


import java.util.*;
public class patternsforloop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many patterns");
    int n= sc.nextInt();
    for(int i=1 ;i<=n;i++){
        for(int j=n ;j>=i ;j--){
            System.out.print(" ");
        }
   for(int a=1 ;a<=i;a++){
    System.out.print(" *");
   }
   
System.out.println( );
}
    }
} 

import java.util.*;
public class patternsforloop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many patterns");
    int n= sc.nextInt();
    for(int i=1 ;i<=n;i++){
        for(int j=n ;j>=i ;j--){
            System.out.print(" ");
        }
   for(int a=1 ;a<=i;a++){
    System.out.print("*");
   
}
    for (int b= 2;b<=i;b++){
        
            System.out.print("*");
        }
    System.out.println( );
    }
}
}


import java.util.*;
public class patternsforloop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many patterns");
    int n= sc.nextInt();
    for(int i=1 ;i<=n;i++){
        for(int j=1 ;j<=i ;j++){
            System.out.print(" ");
        }
   for(int a=n ;a>=i;a--){
    System.out.print("*");
   
}
    for (int b= n-1 ;b>=i;b--){
        
            System.out.print("*");
        }
    System.out.println( );
    }
}
}

import java.util.*;

public class patternsforloop {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("how many patterns");
    int n= sc.nextInt();

    for( int i=1;i<=n;i++){

        for(int j=1;j<=i;j++){
   if (i>=2 &&j<=i-1) {
    System.out.print(" ");

   }else {
    System.out.print("*");
   }
        }
    System.out.println();    
    }

}
}


import java.util.*;

public class patternsforloop {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("how many patterns");
    int n= sc.nextInt();

    for( int i=1;i<=n;i++){

        for(int j=4;j>=i;j--){
            System.out.print(" ");
         }
          for(int a=1;a<=i;a++)
   {
    if (i>=2 && a>1) {
    System.out.print(" ");

   }else {
    System.out.print("*");
   }
        }
    System.out.println();    
    }

}
}

public class patternsforloop{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++)
            {
             if(i>=2 && j>=2 &&i<=4 && j<=4){
                System.out.print(" ");
             }else{
                System.out.print("*");
             }
            }
       System.out.println();
        }
    }
}
*/



