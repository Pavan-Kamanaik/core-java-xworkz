class DifferenceMethod {
    public static void main(String[] diff) {
        System.out.println("Main Started");
        calculateDifference(56, 24);
        calculateDifference(90, 53);
        calculateDifference(200, 123);
        calculateDifference(58, 17);
        calculateDifference(154, 75);
        calculateDifference(35, 18);
        calculateDifference(59, 11);
        calculateDifference(302, 95);
        calculateDifference(84, 32);
        calculateDifference(56, 3);
        calculateDifference(87, 43);
        calculateDifference(27, 10);
        calculateDifference(85, 72);
        calculateDifference(12, 6);
        calculateDifference(75, 38);
        calculateDifference(23, 10);
        calculateDifference(45, 33);
        calculateDifference(52, 29);
        calculateDifference(29, 14);
        calculateDifference(26, 17);
        calculateDifference(85, 60);

        calculateDifference(56, 24,87);
        calculateDifference(90, 53,34);
        calculateDifference(200, 123,4327);
        calculateDifference(58, 17,37);
        calculateDifference(154, 75,28);
        calculateDifference(35, 18,28);
        calculateDifference(59, 11,4);
        calculateDifference(302, 95,3);
        calculateDifference(84, 32,287);
        calculateDifference(56, 3,28);
        calculateDifference(87, 43,327);
        calculateDifference(27, 10,238);
        calculateDifference(85, 72,7);
        calculateDifference(12, 6,27);
        calculateDifference(75, 38,28);
        calculateDifference(23, 10,38);
        calculateDifference(45, 33,238);
        calculateDifference(52, 29,28);
        calculateDifference(29, 14,323);
        calculateDifference(26, 17,238);
        calculateDifference(85, 60,328);
        System.out.println("Main Ended");

    }

    public static void calculateDifference(int num1, int num2) {
        int difference = num1 - num2;
        System.out.println("The difference between " + num1 + " - " + num2 + " = " + difference);
    }
    public static void calculateDifference(int num1, int num2,int num3) {
        int difference = num1 - num2-num3;
        System.out.println("The difference between " + num1 + " - " + num2 + " num3 "+"=" + difference);
    }
}
