import javax.sound.sampled.SourceDataLine;
import javax.swing.border.SoftBevelBorder;

/* 
public class javaOutput {
    public static void main(String[] args) {
        int x=10 ,y=20;
        char z ='G';
        String str="GFG";

        System.out.println(x);
        System.out.println(x+y);
        System.out.println(x+" "+y);
        System.out.print(str+" ");
        System.out.print("Courses");

    }
    
}
*/
// % is used as place holders %s for plsceholder for string

public class javaOutput{
    public static void main(String[] args) {
        int x=100,y=200;
        System.out.format("value of x is%d on",x);
        float z= (float) Math.PI;
        System.out.println(y);
        System.out.format("value of PI =%2f in",z);
        System.out.format("value of PI =%5.2f in",z);
        System.out.format("value of PI =%05.2f in",z);
        System.out.format("x=%d ,y=%d",x,y);
    }
}