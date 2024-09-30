class A{
    int a =10;

    public void show(){
        System.out.println("In show");
    }

    // we can make inner class static and not outer class

    static class B{            //inner class 
        public void config(){
            System.out.println("In config");
        }
    }
}

public class InnerClassEg {
    public static void main(String[] args) {
        A a1 = new A();
        a1.show();


        // class B{            //inner class 
        //     public void config(){
        //         System.out.println("In config");
        //     }
        // }------>for this inner class implementation, we need to use before statement to call inner class
        
        // A.B a2 = a1.new B();
        // a2.config();


        A.B a2 = new A.B();         //for calling static inner class
        a2.config();

    }
}
