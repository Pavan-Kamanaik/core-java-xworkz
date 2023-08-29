class LenskartExecutor {
    public static void main(String lens[]) {

        Lenskart product1 = new Lenskart();
        product1.displayProductDetails();

        product1.productId = 101;
        product1.productName = "Classic Aviator Glasses";
        product1.brand = "Ray-Ban";
        product1.price = 150.99;
        product1.isAvailable = true;
        product1.stockQuantity = 50;
        System.out.println("Product ID: " + product1.productId);
        System.out.println("Product Name: " + product1.productName);
        System.out.println("Brand: " + product1.brand);
        System.out.println("Price: $" + product1.price);
        System.out.println("Availability: " + product1.isAvailable);
        System.out.println("Stock Quantity: " + product1.stockQuantity);

        System.out.println("\n");

        Lenskart product2 = new Lenskart();
        product2.displayProductDetails();
        product2.productId = 102;
        product2.productName = "Round Retro Sunglasses";
        product2.brand = "Oakley";
        product2.price = 120.50;
        product2.isAvailable = false;
        product2.stockQuantity = 10;
        System.out.println("Product ID: " + product2.productId);
        System.out.println("Product Name: " + product2.productName);
        System.out.println("Brand: " + product2.brand);
        System.out.println("Price: $" + product2.price);
        System.out.println("Availability: " + product2.isAvailable);
        System.out.println("Stock Quantity: " + product2.stockQuantity);
        System.out.println("\n");

        Lenskart product3 = new Lenskart();
        product3.displayProductDetails();

        product3.productId = 103;
        product3.productName = "Square Blue Light Glasses";
        product3.brand = "Felix Gray";
        product3.price = 89.95;
        product3.isAvailable = true;
        product3.stockQuantity = 30;
        System.out.println("Product ID: " + product3.productId);
        System.out.println("Product Name: " + product3.productName);
        System.out.println("Brand: " + product3.brand);
        System.out.println("Price: $" + product3.price);
        System.out.println("Availability: " + product3.isAvailable);
        System.out.println("Stock Quantity: " + product3.stockQuantity);
        System.out.println("\n");

        Lenskart product4 = new Lenskart();
        product4.displayProductDetails();

        product4.productId = 104;
        product4.productName = "Sporty Wraparound Sunglasses";
        product4.brand = "Nike";
        product4.price = 75.20;
        product4.isAvailable = true;
        product4.stockQuantity = 20;
        System.out.println("Product ID: " + product4.productId);
        System.out.println("Product Name: " + product4.productName);
        System.out.println("Brand: " + product4.brand);
        System.out.println("Price: $" + product4.price);
        System.out.println("Availability: " + product4.isAvailable);
        System.out.println("Stock Quantity: " + product4.stockQuantity);
        System.out.println("\n");

        Lenskart product5 = new Lenskart();
        product5.displayProductDetails();

        product5.productId = 105;
        product5.productName = "Cat-Eye Prescription Glasses";
        product5.brand = "Gucci";
        product5.price = 280.00;
        product5.isAvailable = true;
        product5.stockQuantity = 10;
        System.out.println("Product ID: " + product5.productId);
        System.out.println("Product Name: " + product5.productName);
        System.out.println("Brand: " + product5.brand);
        System.out.println("Price: $" + product5.price);
        System.out.println("Availability: " + product5.isAvailable);
        System.out.println("Stock Quantity: " + product5.stockQuantity);

    }

}
