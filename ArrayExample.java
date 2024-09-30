public class ArrayExample {
    public static void main(String[] args) {
        int num[] = {1,2,3,4};
        for(int i=0; i<num.length; i++){
            // System.out.println(num[i]);
        }

        int num1[] = new int[4];                //Single-Dimensional Array
        num1[3] = 5;

        System.out.println("For loop with 2D array");

        int num2[][] = new int[3][4];           //2-Dimensional Array
        for (int j=0; j<3; j++){
            for(int k=0; k<4; k++){
                num2[j][k] = (int)(Math.random() * 100);
                System.out.print(num2[j][k] + " ");
            }
            System.out.println();
        }

        System.out.println("Enhanced For loop with 2D array");

        for(int l[] : num2){                //Enhanced for loop
            for(int m : l){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        // System.out.println(num1[3]);

        int num3[][] = new int[3][];        //jagged Array

        num3[0] = new int[4];
        num3[1] = new int[2];
        num3[2] = new int[5];

        System.out.println("For loop with jagged array");

        for (int j=0; j<num3.length; j++){
            for(int k=0; k<num3[j].length; k++){
                num3[j][k] = (int)(Math.random() * 100);
                System.out.print(num3[j][k] + " ");
            }
            System.out.println();
        }

        System.out.println("Enhanced For loop with jagged array");
        for(int l[] : num3){                //Enhanced for loop
            for(int m : l){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        int num4[][][] = new int[3][4][5]; // 3D array

    }
}
