class EatFitExe {
    public static void main(String order[]) {
        System.out.println("Main Started");

        double cost = EatFit.ordFood("AvocadoToast");

        System.out.println("The cost of AvocadoToast is : " + cost);
        double costWithPrice = EatFit.ordFood("AvocadoToast",2);

        System.out.println("The cost of AvocadoToast with price is : " + costWithPrice);

        System.out.println("Main Ended");
    }

}
