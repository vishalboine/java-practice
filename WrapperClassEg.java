
public class WrapperClassEg {
    public static void main(String[] args) {
        // Integer num =new Integer(4);     old way of doing
        int n = 3;
        Integer num1 = n;       //auto boxing--assigning primitive type value to object type

        int num2 = num1;        //auto-unboxing--assigning object type value to primitive type 
        String str = "12";
        Integer num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}
