class Mobile{
    String Brand;
    int Price;
    static String Name;         //creating static variables


    static{     // static block will before constructor.
        Name = "Phone";
        System.out.println("Inside static block");
    }

    Mobile(){       // constructor will call whenever any object created from this class
        Brand = "";
        Price = 0;
        System.out.println("Inside constructor");
    }

    void show(){
        System.out.println( Brand + " : "+ Price+ " : "+ Name);  // we can use static variables inside non static methods
    }

    public static void show1(Mobile m){ //can't access not static var inside static method
        System.out.println( m.Brand + " : "+ m.Price+ " : "+ Name); 
    }
}




public class StaticEg {
    public static void main(String[] args) throws ClassNotFoundException {


        Class.forName("Mobile");  // it will just load the class for executing static block
        Mobile m1 = new Mobile();
        m1.Brand = "Apple";
        m1.Price = 1500;
        Mobile.Name = "SmartPhone";     //accessing and changing value of static variables

        Mobile m2 = new Mobile();
        m2.Brand = "Samsung";
        m2.Price = 1600;
        
        m1.show();
        m2.show();
        Mobile.Name = "MyPhone";       //accessing and changing value of static variables

        m1.show();
        m2.show();

        Mobile.show1(m2);
    }
}
