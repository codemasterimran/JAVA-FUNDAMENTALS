 /* 
import java.util.*;
public class Strings1{ 
    public static void main(String[] args) {

   
      Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("your name is: "+ a);
        // concatenation
        String firstname="tony";
        String lastname="stark";
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());

        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
      
      
            // compare two strings
        String c="abccba";
        String b="abcca";
      if(c==b){
        System.out.println("Yes they are equal");
      }else{
        System.out.println("no they are not equal");
      }
      
      
      
        }
    } 
}
*/
//compareTo function
import java.util.*;


public class Strings1{ 
    public static void main(String[] args) {

String c="abccba";
String b="vbcca";
 if(c .compareTo(b)==0){
    System.out.println("Strings are equal");

 }else{
    System.out.println("strings are not equal");
 }
// sub strings   substring(beg index,end index)
String sentence=" My name is Imran";
String name=sentence.substring(8 ,11);
System.out.println(name);
    }
}
