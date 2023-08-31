class Fastrack {
    int itemId;
    String itemType;
    String model;
    String color;
    double price;
    boolean isAvailable;

    public Fastrack(int Id,String type,String modelNumber,String clr,double cost,boolean availability){
		itemId=Id;
		itemType=type;
		model=modelNumber;
		color=clr;
		price=cost;
		isAvailable=availability;
		  System.out.println("Item ID: " +itemId);
        System.out.println("Item Type: " +itemType);
        System.out.println("Model: " +model);
        System.out.println("Color: " +color);
        System.out.println("Price: $" +price);
        System.out.println("Availability: " +isAvailable);
        System.out.println("Fastrack Object Created");
    }

    public void displayWatchDetails() {
        System.out.println("Details of the Watch");
    }
    
}
