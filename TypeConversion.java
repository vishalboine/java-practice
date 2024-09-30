public class TypeConversion {
    public static void main(String args[]){
        int num = 257;

        num = (byte)num;

        float f = 5.6f;
        f = (int)f;

        byte num1 = 30;
        byte num2 = 10;

        int result = num1 * num2; //type promotion

        System.out.println(num); 
        System.out.println(f); 
        System.out.println(result); 
    }
}
