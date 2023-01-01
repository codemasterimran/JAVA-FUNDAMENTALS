/* 
import java.util.Scanner;
public class Tableofnumber {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
while (i<11) {
    System.out.println(i*n);
   i= i+1;
}
}
}
*/

import java.util.Scanner;
public class Tableofnumber {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for (int i=0 ;i<11 ; i++) {
    System.out.println(n*i);
}


}
}