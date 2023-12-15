class Calculator {
    public int add(int num1, int num2) {
        int r = num1 + num2;
        return r;
    }
}

public class Demo {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);

        System.out.println(result);
    }
}