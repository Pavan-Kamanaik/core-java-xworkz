class AddMethod{
    public static void main(String add[]){
        System.out.println("Main Started");
        add(56,54);
        add(23,21);
        add(89,12);
        add(58,86);
        add(154,51);
        add(35,74);
        add(59,79);
        add(302,45);
        add(84,68);
        add(56,25);
        add(87,23);
        add(27,95);
        add(85,55);
        add(12,56);
        add(75,15);
        add(23,89);
        add(45,56);
        add(52,23);
        add(29,87);
        add(26,43);
        add(85,39);

        add(56,54,47);
        add(23,21,57);
        add(89,12,28);
        add(58,89,4);
        add(154,51,58);
        add(35,74,35);
        add(59,79,56);
        add(302,45,48);
        add(84,68,154);
        add(56,25,36);
        add(87,23,27);
        add(27,95298);
        add(85,55,382);
        add(12,56,28);
        add(75,15,28);
        add(23,89,37);
        add(45,56,8);
        add(52,23,29);
        add(29,87,27);
        add(26,43,28);
        add(85,39,28);

       

    }
    public static void add(int num1,int num2){
         int addition=num1+num2;
        //  System.out.println("addMethod started");
        System.out.println("The addition of " + num1 + " + " +num2 +" = " +addition);

    }
    public static void add(int num1,int num2,int num3){
         int addition=num1+num2+num3;
        //  System.out.println("addMethod started");
        System.out.println("The addition of " + num1 + " + " +num2 +" num3 "+"=" +addition);

    }
}