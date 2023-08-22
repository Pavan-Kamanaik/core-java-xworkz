class RemainderMethod {
    public static void main(String[] args) {
        System.out.println("Main Started");
        calculateRemainder(20, 4);
        calculateRemainder(15, 6);
        calculateRemainder(10, 3);
        calculateRemainder(27, 5);
        calculateRemainder(64, 8);
        calculateRemainder(18, 5);
        calculateRemainder(21, 7);
        calculateRemainder(35, 12);
        calculateRemainder(49, 9);
        calculateRemainder(30, 7);
        calculateRemainder(27, 9);
        calculateRemainder(12, 5);
        calculateRemainder(88, 11);
        calculateRemainder(45, 15);
        calculateRemainder(64, 11);
        calculateRemainder(72, 8);
        calculateRemainder(90, 13);
        calculateRemainder(25, 7);
        calculateRemainder(36, 6);
        calculateRemainder(40, 9);
        calculateRemainder(81, 14);

        calculateRemainder(20, 4,47);
        calculateRemainder(15, 6,28);
        calculateRemainder(10, 3,28);
        calculateRemainder(27, 5,58);
        calculateRemainder(64, 8,7);
        calculateRemainder(18, 5,52);
        calculateRemainder(21, 7,72);
        calculateRemainder(35, 12,83);
        calculateRemainder(49, 9,8);
        calculateRemainder(30, 7,28);
        calculateRemainder(27, 9,19);
        calculateRemainder(12, 5,59);
        calculateRemainder(88, 11,29);
        calculateRemainder(45, 15,17);
        calculateRemainder(64, 11,64);
        calculateRemainder(72, 8,27);
        calculateRemainder(90, 13,28);
        calculateRemainder(25, 7,2);
        calculateRemainder(36, 6,48);
        calculateRemainder(40, 9,95);
        calculateRemainder(81, 14,48);
    }

    public static void calculateRemainder(int num1, int num2) {
        if (num2 != 0) {
            int remainder = num1 % num2;
            System.out.println("The remainder of " + num1 + " % " + num2 + " = " + remainder);
        } 
    
    }
     public static void calculateRemainder(int num1, int num2,int num3) {
        if (num2 != 0) {
            int remainder = num1 % num2%num3;
            System.out.println("The remainder of " + num1 + " % " + num2 + " num3 " + remainder);
        } 
    
    }
}
