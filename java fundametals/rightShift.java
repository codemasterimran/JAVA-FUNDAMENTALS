/*
class rightShift {
    public static void main(String[] args) {
        int x = 33;
        System.out.println(x>>1); // x:00....100001 after right shift x>>1 00...010000 here every element is shifted place by one position the extra 1 at end is ignored and 0 in starting is added as leading or starting 0
    }
}
 

 // right shift


class rightShift {
 public static void main(String[] args) {
    int x= -2; // x: 1111....10 x>>1 1 111...11 in negative every bit is shifted to right in one bit and at leading 1 is added instead of 0 and the last 0 is ignored\\
    System.out.println(x>>1);
 }
}
*/ 
// unsigned right shift it consiters every no. as positive so answer come in positive so x:111....10 x>>>1 011.....11
class rightShift {
    public static void main(String[] args) {
       int x= -2;
       System.out.println(x>>>1);
 }
}