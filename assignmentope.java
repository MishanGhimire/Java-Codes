class assignmentope {
    public static void main(String[] args) {
        int num1 = 10;
        // int num2 = 5;

        // int result = num1 + num2;
        // num1 = num1 + 1
        // num1 += 1;
        // num1 *= 3; //This is operator overloading.
        // num1++; // Post - Increment
        ++num1; // Pre - Increment
        // num1--; // Decrement
        int result = num1++; // fetch the value and then increment
        // int result == ++num1; //increment and then fetch the value
        System.out.println(result);
    }
}
