 /* 
 class nonPrimitive {
    int x;
    int y;

}
class Test{
    public static void main(String[] args) {
        nonPrimitive p =new nonPrimitive();
        p.x=10;
        p.y=20;
        System.out.println(p.x+""+p.y);

    }
}
*/
// Any datatype which is created by classes is non primitive data type//
// we create variables of non primitive data type using new operator//
// non primitive data types are always references whereas primitive datatypes are normal variables//
// non primitives are stored in heap memory and primitives are stored in stack memory//

class nonPrimitive {
    int x;
    int y;

}
class Test{
    public static void main(String[] args) {
        nonPrimitive p1 =new nonPrimitive();
        p1.x=10;
        p1.y=20;
        nonPrimitive p2 =p1;
        p2.x =30;
        System.out.println(p1.x);
        System.out.println(p2.x);

    }
}