// Function in java
/* 
public class Methods{
    public static void main(String[] args) {
        System.out.println("Before call");
        fun();
        fun();
        System.out.println("After call");
    }
public static void fun(){
    System.out.println("Inside fun()");
}
}

//2nd code for functions

public class Methods{
    public static void main(String[] args) {
        System.out.println("main begins");
        fun1();
        System.out.println("main ends");
    
}
 public static void fun1(){
    System.out.println("fun begins");
    fun2();
    System.out.println("fun1 ends");
 
}
public static void fun2(){
    System.out.println("Inside fun1");
}
}

// Passing parameters and returning results

class Methods{
public static void main (String []args){
    int x=5,y=10;
    System.out.println(getMax(x,y));
}
public static int getMax(int x,int y)
    {
        if (x>y){
        return x;
         } else {
        return y;
    }
}
}

class Methods{
    public static void main(String[] args) {
int x=5;
fun(x);
System.out.println(x);
    }
public static void fun(int x)
{
    x=x+5;
}
}
*/
// non primitive functions

class Point {int x,y;}
class Methods{
    public static void main(String[] args) {
        Point  p= new Point();
        p.x=5; ; p.y=10;
        fun(p);
        System.out.println(p.x+" "+p.y);

    }
public  static void fun(Point p)
{
    p.x=10 ; p.y =10;  
}
}