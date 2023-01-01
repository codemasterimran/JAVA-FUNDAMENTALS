/*
class autoboxing{

    public static void main(String[] args) {
        int x1=10;
        integer x2= x1; //autoboxing your primitive data type become corresponding wrapper type object like int becomes integer or char becomes character

        int x3= x2; // auto-unboxing

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
 */

class autoboxing{
    public static void main(String[] args) {
        Integer x1=400 , x2=400;
        if(x1==x2)
        System.out.println("same");
        else 
        System.out.println("not same");
    }
}