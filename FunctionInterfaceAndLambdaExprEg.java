@FunctionalInterface
interface A{
    void show();
}


public class FunctionInterfaceAndLambdaExprEg {
    public static void main(String[] args) {        //lambda expression
        A a = () ->{    
            System.out.println("in show");
        };

        a.show();
    }
}
