class FinalCalc{                // if I declare class with final keyword then no other can class can extend this class(stopping inheritance)
    public final void show(){
        System.out.println("By Vishal");
    }

    public void add(int x, int y){
        System.out.println(x+y);
    }
}

class FinalAdvCalc extends FinalCalc{
    // public void show(){             // we can override parent methods if the method is defined with final(stopping method overriding)
    //    System.out.println("By John");
    // } 
}








public class FinalEg {
    public static void main(String[] args) {
        final int num = 10;
        // num = 11;        cannot re-assign value to final variable

        FinalAdvCalc ad = new FinalAdvCalc();
        ad.show();
        ad.add(1,3);
    }
}
