public class arrayrotation {
    public static void main(String[] args) {
        int a[]= {3,9,7,8,12,6,15,5,4,10};
        for (int x:a){
         System.out.print(x+",");
         System.out.print(" ");
        }
int temp=a[0];
for(int i=0 ;i<a.length-2;i++){
    a[i-1]=a[i];
    
}
a[a.length-1] =temp; 
for (int x:a){
    System.out.print(x+",");
   
    System.out.println(" ");
   
}
    }
    
}
