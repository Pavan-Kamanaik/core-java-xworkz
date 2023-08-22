class DivisionMethod {
    public static void main(String[] args) {
        System.out.println("Main Started");
        calculateDivision(20, 4);
        calculateDivision(10, 2);
        calculateDivision(15, 3);
        calculateDivision(50, 10);
        calculateDivision(64, 8);
        calculateDivision(18, 3);
        calculateDivision(21, 7);
        calculateDivision(35, 5);
        calculateDivision(49, 7);
        calculateDivision(30, 6);
        calculateDivision(27, 9);
        calculateDivision(12, 4);
        calculateDivision(88, 11);
        calculateDivision(45, 15);
        calculateDivision(64, 16);
        calculateDivision(72, 8);
        calculateDivision(90, 10);
        calculateDivision(25, 5);
        calculateDivision(36, 6);
        calculateDivision(40, 8);
        calculateDivision(81, 9);


        calculateDivision(20, 4,843);
        calculateDivision(10, 2,327);
        calculateDivision(15, 3,23);
        calculateDivision(50, 10,38);
        calculateDivision(64, 8,38);
        calculateDivision(18, 3,38);
        calculateDivision(21, 7,29);
        calculateDivision(35, 5,39);
        calculateDivision(49, 7,30);
        calculateDivision(30, 6,58);
        calculateDivision(27, 9,28);
        calculateDivision(12, 4,28);
        calculateDivision(88, 11,29);
        calculateDivision(45, 15,328);
        calculateDivision(64, 16,3);
        calculateDivision(72, 8,38);
        calculateDivision(90, 10,39);
        calculateDivision(25, 5,39);
        calculateDivision(36, 6,19);
        calculateDivision(40, 8,37);
        calculateDivision(81, 9,39);
                System.out.println("Main Ended");


    }

    public static void calculateDivision(int num1, int num2) {
        int division = num1/ num2;
        System.out.println("The division of " + num1 + " - " + num2 + " = " + division);
    }
    public static void calculateDivision(int num1, int num2,int num3) {
        int division = num1/ num2/num3;
        System.out.println("The division of " + num1 + " - " + num2 + " num3" +"="+ division);
    }
}
