class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");    //child show method will override parent show method
    }
}


public class MethodOverridingEg {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
