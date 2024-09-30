class MyException extends RuntimeException{
    MyException(String message){
        super(message);
    }
}



public class ExceptionThrowEg {
    public static void main(String[] args) {
        int i = 20;
        int j = 30;
        try{
            j = i/j;
            if(j==0){
                throw new MyException("value of J can't be zero");
            }
        }catch(MyException e){
            j=30;
            System.out.println("Showing default value of J as "+ e);
        }catch(Exception e){
            System.out.println("Something went wrong!");
        }
        System.out.println("J: "+j);
    }
}
