class A{
    public void show() throws ClassNotFoundException{
        Class.forName("ABC");
    }
}


public class ExceptionThrowSEg {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
