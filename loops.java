public class loops {
    public static void main(String[] args) {
        // repeat this statements 4 times
        // loop - while,do while,for

        // 100 -  based on some Conditions
        int i = 1;

        while(i<=4)
        {
            System.out.println("Hello " + i);
            int j = 1;
            while (j<=3) {
                System.out.println("Hi" + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye" + i);
    }
}
