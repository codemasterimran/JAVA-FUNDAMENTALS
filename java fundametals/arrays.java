public class arrays {
    public static void main(String[] args) {
        int []a ={10,20,30,40,50};
        System.out.println(a.length);
        a[2]=60;
        System.out.println(a[2]);
        System.out.println(a[1]);
    }
    
}
/* methods to write arrays in java
Method 1
 int [] a;
 a=new int [3];
 a[0]=10;
 a[1]=20
 a[2]=30
 
Method 2
int []a=new int [3]; 
a[0]=10;
a[1]=20;
a[2]=30;

Method 3
int []a = {10,20,30};

Method 4 
int []a=new int [3];
int x=10;
for(int i=0;i<a.length ;i++)
{
    a[i]=x;
    x=x+10
}

*/