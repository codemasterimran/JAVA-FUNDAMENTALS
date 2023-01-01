/* 
public class breakandcontinue {

    public static void main(String[] args) {
        for (int i=0; i<5; i++)
        {
            if(i==3) 
            continue;
            System.out.println(i);

        }
    }
    
}
*/
public class breakandcontinue {
    public static void main(String[] args) {
        int i=0;
        while(i<3){
            while(i<3){
                i++;
                System.out.println("Before"+i);
                if(i==2)
                continue;

                System.out.println("After"+i);
            }

        }
    }
}