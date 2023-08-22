 class Swiggy {
    // public static void search(String foodName){
    public static double search(String foodName){
        System.out.println(" Invoked search Method");
        double price=0.0;
        if(foodName=="Pizza"){
            // System.out.println("The price of "+foodName+ " is 99");
            price=99;
            // return price;

        }
        if(foodName=="Veg Biriyani"){
            // System.out.println("The price of "+foodName+ " is 260");
            price=260.00;
            // return price;
        }
        System.out.println("Search method Ended");

        return price;
    }

        public static double search(String foodName,int quantity){
        System.out.println(" Invoked search Method");
        double price=0.0;
        if(foodName=="Pizza"){
            // System.out.println("The price of "+foodName+ " is 99");
            price=99*quantity;
            // return price;

        }
        if(foodName=="Veg Biriyani"){
            // System.out.println("The price of "+foodName+ " is 260");
            price=260.00*quantity;
            // return price;
        }
        System.out.println("Search method Ended");

        return price;
    }
    
}
