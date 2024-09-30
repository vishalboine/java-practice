enum Status {
    Running, Pending, Failed, Success;
}

enum Laptop{
    MacBook(1000), AcerNitro(500), ThinkPad(), AlienWare(800);

    private int price;


    Laptop(){
        price=300;
    }
    

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumEg {
    public static void main(String[] args) {
        Status[] s = Status.values();
        System.out.println(s[0].ordinal());

        for(Status item : s){
            System.out.println(item + " : "+item.ordinal());
        }
        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : "+lap.getPrice());
        }
    }
}
