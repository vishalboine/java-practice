class A extends Object{        //parent class for B         every class in java extends Object class   
    A(){
        super();        //super method is used to call the default constructor of super class that is parent class
        System.out.println("in A");
    }
    A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A{      //child class for A
    B(){
        super();
        // super(5);       // will call the parameterized the constructor of A
        System.out.println("in B");
    }
    B(int n){
        // super(n);       //changed the default super method. It will call the parent parameterized constructor
        this();     //this method executes the constructor of the same class
        System.out.println("in B int");
    }
}




public class SuperThisEg {
    public static void main(String[] args) {
        B b = new B(1);      
        // B b = new B();      
    }
}
