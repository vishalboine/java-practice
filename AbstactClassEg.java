abstract class Car{                 //abstract class one
    public abstract void driving();
    public abstract void flying();

    public void playMusic(){
        System.out.println("Playing music..");
    }
}

abstract class Nano extends Car{        //abstract class two

    public void driving() {
        System.out.println("Driving..");
    }

}

class UpdatedNano extends Nano{         //concrete class

    public void flying() {
        System.out.println("Flying..");
    }
    
}



public class AbstactClassEg {
    public static void main(String[] args) {
        // Car c = new Car();          //can't create object of abstract class

        Car c = new UpdatedNano();          // we can create object of concrete class
        c.driving();
        c.playMusic();
        c.flying();
    }
}
