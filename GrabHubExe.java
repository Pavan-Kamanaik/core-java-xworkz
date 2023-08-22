class GrabHubExe {
    public static void main(String order[]) {
        System.out.println("Main Started");

        double cost1 = GrabHub.orderFood("Pasta");

        System.out.println("The cost of Pasta is : " + cost1);
        double costWithPrice = GrabHub.orderFood("Pasta",6);

        System.out.println("The cost of Pasta with price is : " + costWithPrice);

        System.out.println("Main Ended");
    }

}
