class Zomato {
    public static double find(String foodName){
        System.out.println(" Invoked search Method");
        double price=0.0;
        if(foodName=="Mushroom Biriyani"){
            // System.out.println("The price of "+foodName+ " is 99");
            price=170.00;
            // return price;

        }
        if(foodName=="Hyderabad Biriyani"){
            // System.out.println("The price of "+foodName+ " is 260");
            price=310.00;
            // return price;
        }
        System.out.println("Search method Ended");

        return price;
    }

        public static double find(String foodName,int quantity){
        System.out.println(" Invoked search Method");
        double price=0.0;
        if(foodName=="Mushroom Biriyani"){
            // System.out.println("The price of "+foodName+ " is 99");
            price=170.00*quantity;
            // return price;

        }
        if(foodName=="Hyderabad Biriyani"){
            // System.out.println("The price of "+foodName+ " is 260");
            price=310.00*quantity;
            // return price;
        }
        System.out.println("Search method Ended");

        return price;
    }
    
}
