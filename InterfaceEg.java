interface ComputerInt{

    int age = 44;           //variable are by default static and final inside interface
    String area = "Mumbai";
    public abstract void code();        //we don't neeed to mention public abstract for methods inside interface. It will be available by default.
}

interface X{
    void run();
}

interface Y extends X{
    void walk();
}

class Laptop implements ComputerInt,X{
    public void code(){
        System.out.println("Coding..");
    }
    public void run(){
        System.out.println("Running in Laptop..");
    }
}
class Desktop implements ComputerInt,Y{
    public void code(){
        System.out.println("Coding Faster..");
    }
    public void run(){
        System.out.println("Running in Desktop..");
    }
    public void walk(){
        System.out.println("Walking in Desktop..");
    }
}

public class InterfaceEg {
    public static void main(String[] args) {
        ComputerInt cl = new Laptop();
        cl.code();
        Desktop cd = new Desktop();
        cd.code();
        cd.run();
        cd.walk();
        // ComputerInt.age = 42;       // can't re-assign final variable (inside interface)
        System.out.println(ComputerInt.area);
    }
}
