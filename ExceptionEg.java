public class ExceptionEg {
    public static void main(String[] args) {
        int i = 2 ;
        int j = 18;
        int a[] = new int[5];
        String name = null; 
        
        try{
            j = j / i;
            System.out.println(j);
            System.out.println(a[4]);
            System.out.println(name.length());
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide number by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limit");
        }
        catch(NullPointerException e){
            System.out.println("Cannot read length of null");
        }
        catch(Exception e){
            System.out.println("Something went wrong.."+ e);
        }

        System.out.println("Bye!");     //will execute even if there is exception or not.

    }
}
