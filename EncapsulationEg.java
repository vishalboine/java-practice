class Human{
    private int age;        // encapsulation instance var using private 
    private String name;     //encapsulation instance var using private

    Human(){        //default constructor
        System.out.println("in constructor");
        age = 12;
        name = "John";
    }

    

    public Human(String name) {        //parameterized constructor
        this.name = name;
    }

    

    public Human(int age, String name) {        //parameterized constructor
        this.age = age;
        this.name = name;
    }



    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;     // this keyword is used to refer the object which is calling setAge method
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;   // this keyword is used to refer the object which is calling setName method
    }

}



class EncapsulationEg{
    public static void main(String[] args) {
        Human h = new Human();
        Human h1 = new Human("Vishal");
        System.out.println(h1.getAge());
        // h.setAge(24);
        // h.setName("Boine");
        // System.out.println(h.getName() + " : " + h.getAge());
        // System.out.println(h1.getName() + " : " + h1.getAge());
    }
}