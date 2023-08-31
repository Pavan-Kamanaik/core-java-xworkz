class Lenskart {
    int productId;
    String productName;
    String brand;
    double price;
    boolean isAvailable;
    int stockQuantity;
    public Lenskart(int Id,String prdtName,String bnd,double cost,boolean availability,int quantity){
		productId=Id;
		productName=prdtName;
		brand=bnd;
		price=cost;
		isAvailable=availability;
		stockQuantity=quantity;
		
        System.out.println("Lenskart object constructor is created");
		 System.out.println("Product ID: " +productId);
        System.out.println("Product Name: " +productName);
        System.out.println("Brand: " +brand);
        System.out.println("Price: $" +price);
        System.out.println("Availability: " +isAvailable);
        System.out.println("Stock Quantity: " +stockQuantity);
    }


    public void displayProductDetails(){
        System.out.println("Available Lenskart Products ");
    }
    
}
