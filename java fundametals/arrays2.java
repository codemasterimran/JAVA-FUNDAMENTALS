//print a array
/* 
public class arrays2 {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};

        for(int i=0 ; i<5 ; i++){
            System.out.println(a[i]);
        }
    }
    
}

// reverse array print
public class arrays2{
    public static void main(String[] args) {
        int a[]={1,4,6,7,4,5};
        for(int i=a.length-1 ;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}

//for each loop and incrementing value in array
public class arrays2{
    public static void main(String[] args) {
        int a[]={1,4,6,7,4,5};
        a[2]=10;
        for(int i=0 ; i<6 ; i++){
            System.out.println(a[i]++);
        }
        for(int x:a){
            System.out.println(x);
        }
    }
}

// finding sum of array
public class arrays2{
    public static void main(String[] args) {
        int sum=0;
        int a[]={3,9,7,8,12,6,15,5,4,10};
        for(int i=0 ; i<a.length ; i++){
         sum =sum+a[i];
        }
         System.out.println("sum is:"+sum);
        }
    }

    // searching an element in array
   import java.util.*;
    public class arrays2{
        public static void main(String[] args) {
            int sum=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a key");
            int key= sc.nextInt();
            int a[]={3,9,7,8,12,6,15,5,4,10};
            for(int i=0 ; i<a.length ; i++){
                if (key==a[i]){
                    
                    System.out.println(i);
                    System.exit(i);
                }
            }
            System.out.println("not found");
        }
    }
    
    // find max element in array 
    public class arrays2{
        public static void main(String[] args) {
            int a[]={3,9,7,8,12,6,15,5,4,10};
            int max=a[0];

            for(int i=0;i<a.length;i++){
                if(a[i]>max){
                    max =a[i];
                }
            }
        System.out.println("Max no. in array"+max); 
        }
    }
   
  //  find second largest array element
  public class arrays2{
    public static void main(String[] args) {
        int a[]={3,9,7,8,12,6,15,5,4,10};
        int max1,max2;
        max1=max2=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1 =a[i];
            } else if (a[i]>max2){
              max2 =a[i];

            }
        }
    System.out.println("second largest no. in array"+max2); 
    }
}
 */
public class arrays2 {
    public static void main(String[] args) {
        
        int a,b;
int c=0;
        int x[]={1,2,3,4,5,6,7};
        a=x[1];
        b=x[2];
        a=b;
        b=c;
         c=a;
         System.out.println(x[2]);

        
    }
}