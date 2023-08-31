class GmartClothsExecutor {

    public static void main(String clothing[]) {
		String[] brands = { "Puma", "Zoara", "Arrows", "Levis" };
		
        GmartCloths cloths = new GmartCloths(1,5,brands,"Nagarabhavi");

        // purpose of constructor :-initialisation of instance variables

        
/*
        cloths.id = 1;
        cloths.noOfWorkers = 5;
        cloths.location = "Nagarabhavi";
		
        System.out.println(cloths.id + " " + cloths.noOfWorkers + " " + cloths.location);
        cloths.brands = brands;
        System.out.println("Lists of brands available :");*/
        cloths.getAllBrands(cloths.brands);

    }
}
