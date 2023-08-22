class MultiplicationMethod {
    public static void main(String[] args) {
        System.out.println("Main Started");
        calculateMultiplication(5, 4);
        calculateMultiplication(7, 9);
        calculateMultiplication(12, 6);
        calculateMultiplication(3, 8);
        calculateMultiplication(10, 15);
        calculateMultiplication(2, 7);
        calculateMultiplication(11, 3);
        calculateMultiplication(20, 4);
        calculateMultiplication(9, 10);
        calculateMultiplication(6, 11);
        calculateMultiplication(8, 2);
        calculateMultiplication(14, 5);
        calculateMultiplication(25, 3);
        calculateMultiplication(16, 2);
        calculateMultiplication(18, 7);
        calculateMultiplication(23, 4);
        calculateMultiplication(30, 5);
        calculateMultiplication(9, 6);
        calculateMultiplication(13, 9);
        calculateMultiplication(17, 4);
        calculateMultiplication(22, 3);

        calculateMultiplication(5, 4,37);
        calculateMultiplication(7, 9,812);
        calculateMultiplication(12, 6,28);
        calculateMultiplication(3, 8,57);
        calculateMultiplication(10, 15,57);
        calculateMultiplication(2, 7,28);
        calculateMultiplication(11, 3,39);
        calculateMultiplication(20, 4,29);
        calculateMultiplication(9, 10,38);
        calculateMultiplication(6, 11,4);
        calculateMultiplication(8, 2,48);
        calculateMultiplication(14, 5,438);
        calculateMultiplication(25, 3,49);
        calculateMultiplication(16, 2,49);
        calculateMultiplication(18, 7,47);
        calculateMultiplication(23, 4,218);
        calculateMultiplication(30, 5,49);
        calculateMultiplication(9, 6,9);
        calculateMultiplication(13, 9,219);
        calculateMultiplication(17, 4,39);
        calculateMultiplication(22, 3,29);
                System.out.println("Main Ended");

        
    }

    public static void calculateMultiplication(int num1, int num2) {
        int product = num1 * num2;
        System.out.println("The product of " + num1 + " * " + num2 + " = " + product);
    }
    public static void calculateMultiplication(int num1, int num2,int num3) {
        int product = num1 * num2*num3;
        System.out.println("The product of " + num1 + " * " + num2 + " num3 " + "="+ product);
    }
}

