class A{
    A(){
        System.out.println("Object created");
    }

    public void show(){
        System.out.println("show method called");
    }
}



public class AnonymousEg {
    public static void main(String[] args) {
        new A().show();    //anonymous Object---> Object not having any reference. We can't re-use this object
        new A().show();    // creating another anonymous object
    }
}
