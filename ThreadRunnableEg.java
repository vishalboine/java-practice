public class ThreadRunnableEg {
    public static void main(String[] args) {
        Runnable a = ()->{
                for(int i = 0 ; i<5; i++){
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) { e.printStackTrace();}
                }
            };
            Runnable b = ()->{
                for(int i = 0 ; i<5; i++){
                    System.out.println("hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) { e.printStackTrace();}
                }
            };
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) { e.printStackTrace();}
        t2.start();
    }
}
