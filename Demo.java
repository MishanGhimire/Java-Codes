class Calculator {
    public int add(int num1, int num2, int num3) {
//        int r = num1 + num2;
        return num1+num2+num3;
    }
    public int add1(int num1,int num2){
        return num1+num2;
    }
    public double add2(double num1,double num2){
        return num1+num2;
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add1(3,4);
        System.out.println(r1);
    }
}