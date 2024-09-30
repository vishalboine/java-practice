 class Laptop{
    String model;
    int price;
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    
}




public class ObjectClassEg {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.model = "Acer Nitro" ;
        l1.price = 2010;
        Laptop l2 = new Laptop();
        l2.model = "Acer Nitro" ;
        l2.price = 2010;
        // System.out.println(l1); //will print toString of Object class if Laptop has not having any toString method
        boolean result =  l1.equals(l2);
        System.out.println(result);
    }
}
