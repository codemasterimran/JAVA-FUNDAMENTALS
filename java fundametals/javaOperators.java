import java.util.Scanner;


// Arthematic operators 
/* 
class javaOperators{
    public static void main(String[] args) {
        int x=10,y=20;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

        int z =(x+y*10);
        System.out.println(z);

        z=x++; // meaning  z=x  x=x+1
        System.out.println(z+" "+x); 
        z=++x; // meaning  x=x+1  z=x
        System.out.println(z+" "+x);
    

    }
}

// Assignment operators

class javaOperators{
    public static void main(String[] args) {
        int x=10 , y=5 ,z;
        x+=y; // x=x+y
        System.out.println(x);
        x%=y; // x=x/y
        System.out.println(x);
        z=x=y; // (z=(x=y)) assosiative order follows from right to left
        System.out.println(z);
    }
}


// logical operators
import java.util.Scanner;
class javaOperators{
    public static void main(String[] args) {
        System.out.println("ENter username and password");
        String un ="imran", pwd ="Imr";
        Scanner sc =new Scanner(System.in);
        String iu =sc.next();
        String ip =sc.next();
        if (un.equals(iu) && pwd.equals(ip))
        System.out.println("Welcome");
        else 
        System.out.println("try again");    
    }
}
*/

class javaOperators{
    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x<=y);
    }
}