class Factorial {
    public static void main(String fact[]){
        System.out.println("Main started");
        // int dummy=1;
        getFact(5);
        getFact(6);
        getFact(7);
        getFact(0);
                System.out.println("Main ended");


        // for(int factNum=1;factNum<=factNumber;factNum++){
            // dummy=dummy*factNum;

        }
                // System.out.println("The factorial of "+factNumber  +" is : "+dummy);

    
    public static void getFact( int factNumber){
                System.out.println("getFact started");

        int fact=1;
        for(int n=1;n<=factNumber;n++){
            fact=n*fact;
        }
        System.out.print("The factorial of "+factNumber + " is :" +fact+ "\n");
                System.out.println("getFact ended");

    }
    
}
