class KFCexe {
    public static void main(String foodorder[]) {
        System.out.println("Main Started");

        double cost1 = KFCHut.kfcorp("OriginalRecipeChicken");

        System.out.println("The cost of OriginalRecipeChicken is : " + cost1);
        
        double costWithPrice = KFCHut.kfcorp("OriginalRecipeChicken",5);

        System.out.println("The cost of OriginalRecipeChicken with price is : " + costWithPrice);

        System.out.println("Main Ended");
    }

}
