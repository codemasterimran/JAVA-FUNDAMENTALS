// for loop
/* 
public class loop {
    
    public static void main(String[] args) {
        for(int i=0 ;i<10;i++ ) // initialization , condition check , loop variable change
        {
            System.out.println("IMRAN WANI");
        }
    }
}

// while loop
class loop {
    public static void main(String[] args) {
        int i=0;
        while(i<10)
        {
        System.out.println("imran wani");
        i++; 
    }
}
}
// fixed initializtion , condition check ,fixed modification use for loop
// complex logic for modifications use while loops and for easily writing infinte loops
*/
class loop{
    public static void main(String[] args) {
        int i=6;
        do{
            System.out.println("imran wani");
            i++;

        } while(i<10);//condition check
        // while loop first check the condition and then execute and do while loop first run and then check the condition so in do while the condition will run atleast once even if condition fail in first step only
    }
}