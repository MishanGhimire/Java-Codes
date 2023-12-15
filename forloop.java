public class forloop {
    public static void main(String[] args) {
    //    for(int i=1;i<=5;i++){
    //        System.out.println("DAY " + i);

    //        for (int j=1;j<=9;j++){
    //            System.out.println(" " + (j+8) + " - " + (j+9));
    //        }

    //    }

    //Program to print pattern
        int n = 4;
        int m = 5;

        //outer loop
        for(int i = 1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
