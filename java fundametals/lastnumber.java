import java.util.Scanner;
public class lastnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x =sc.nextInt();
        int z=Math.abs(x); //where abs is absolute and it is used so as negative no. are converted to positive
        int ans= x%10;

        System.out.println(ans);
    }
    
}
