class Calc{
    public int add(int x, int y){
        return x + y;
    }
    public int sub(int x, int y){
        return x - y;
    }
}
class AdvCalc extends Calc{
    public int multi(int x, int y){
        return x * y;
    }
    public int div(int x, int y){
        return x / y;
    }
}
class VeryAdvCalc extends AdvCalc{
    public int power(int x, int y){
        return (int)Math.pow(x, y);         //type casting
    }
}

public class InheritanceEg {
    public static void main(String[] args) {
        VeryAdvCalc ac = new VeryAdvCalc();
        int r1 = ac.add(3,2);
        int r2 = ac.sub(4,2);
        int r3 = ac.multi(6,2);
        int r4 = ac.div(15,5);
        int r5 = ac.power(2,3);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}
