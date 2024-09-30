abstract class A{
    public abstract void show();
    public abstract void config();
}

public class AbstractInnerClassEg {


    public static void main(String[] args) {
        
        A a = new A(){          //creating an object of anonymous inner class
            public void show(){
                System.out.println("In main show");
            }

            public void config() {
                System.out.println("In main config");
            }
        };
    
        a.show();
        a.config();
    }
}
