// buffered reader //
//(SYstem.in) it is a input stream that gives you streams of bytes//
// InputStreamReader it convert stream of byte into stream of characters//
/* 
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;


public class inputinjava {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENter a String");
        String s = br.readLine();
        System.out.println("You entered"+s);
    }
}
*/
// buffer example to read integer
/* 
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;


public class inputinjava {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENter a Integer");
        int x = Integer. parseInt(br.readline());
        System.out.println("You entered"+s);
    }
}
*/
// Scanner class 

import java.util.Scanner;
class inputinjava{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.readLine();
        System.out.println("You entered String"+s);
        int x = sc.nextInt();
        System.out.println("You entered integer"+x);
        float f =sc.nextFloat();
        System.out.println("You entered float"+f);

    }
}