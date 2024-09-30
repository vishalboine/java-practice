class A{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("In B show");
    }
}



public class AnnotationEg {
    public static void main(String[] args) {
        B b =new B();
        b.show();
    }
}
