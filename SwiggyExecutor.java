 class SwiggyExecutor {
    public static void main(String fooddelivery[]){
        System.out.println("Main Started");

        //ClassName.MethodName(parameter);
        // Swiggy.search("Pizza");
        double price=Swiggy.search("Veg Biriyani");
        System.out.println("The price of the Veg Biriyani is :"+price);

        //This is called method overloading means that ===>>
        // method with same name and having atleast two method with different number of parameters
        double priceWithQuantity=Swiggy.search("Veg Biriyani",3);
        System.out.println("The price of the Veg Biriyani with quanitty  is :"+priceWithQuantity);


        System.out.println("Main Ended");

    }
    
}
