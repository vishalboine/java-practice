class Operations {

    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b, int c){
        return a+b+c;
    }

    public double add(double a,int b){
        return a+b;
    }

}





public class Calc {
    public static void main(String a[]){
        Operations c = new Operations();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2,3));
        System.out.println(c.add(999999,2));
    }
}
