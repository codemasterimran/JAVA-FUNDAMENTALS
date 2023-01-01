/* 
public class strings {
    public static void main(String[] args) {
        String str="imran";

        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,4));
    }
    
}

public class strings{
    public static void main(String[] args) {
        String s1="geeks";
        String s2="geeks";
        if(s1==s2){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    String s3=new String("geeks");
    if(s1==s3){
        System.out.println("yes");

    }else{
        System.out.println("no");
    }
    }
}

class strings{
    public static void main(String[] args) {
        
        String s1="geeksforgeeks";
        String s2="geeks";
        System.out.println(s1.contains(s2));   
    }
}

class strings{
    public static void main(String[] args) {
        
        String s1="geeksforgeeks";
        String s2="geeksforgeeks";
        System.out.println(s1.equals(s2));   
    }
}

class strings{
    public static void main(String[] args) {
        String s1="imranwani";
        String s2="her";
        int res=s1.compareTo(s2);
     if(res==0){
            System.out.println("same");
      } else if(res>0){
                System.out.println("s1 greater");
            } else if (res<0){
                System.out.println("s1 smaller");
            }

            
        }
    }

    class strings{
        public static void main(String[] args) {
            
            String s1="geeksforgeeks";
            String s2="geeks";
            System.out.println(s1.indexOf(s2 ,1 ));   
        }
    }
    */

    class strings{
        public static void main(String[] args) {
            String s1="geeks";
            String s2=s1;
            s1= s1+"forgeeks";
            System.out.println(s1);
            System.out.println(s1==s2);
        }
    }