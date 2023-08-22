class McDonaldsExe {
    public static void main(String foodorder[]) {
        System.out.println("Main Started");

        double cost = McDonalds.mcorder("BigMac");
        System.out.println("The cost of BigMac is : " + cost);
        double costWithPrice = McDonalds.mcorder("BigMac",4);
        System.out.println("The cost of BigMac with price is : " + costWithPrice);

        System.out.println("Main Ended");
    }

}
