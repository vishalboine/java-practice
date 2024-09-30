class A{
    public void show(){
        System.out.println("In A show");
    }
}




public class AnonymousInnerClassEg {
    public static void main(String[] args) {
        A a =new A(){               //Anonymous inner class
            public void show(){
                System.out.println("In main show");
            }
        };

        a.show();
    }
}
