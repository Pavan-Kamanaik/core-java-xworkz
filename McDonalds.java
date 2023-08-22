class McDonalds {
    public static double mcorder(String orderFood) {
        double costIn$ = 0.0;
        System.out.println("mcorder started");

        if (orderFood == "BigMac") {
            costIn$ = 4.99;
            return costIn$;
        }
        if (orderFood == "McChicken") {
            costIn$ = 3.79;
            return costIn$;
        }
        if (orderFood == "FiletOFish") {
            costIn$ = 4.29;
            return costIn$;
        }
        if (orderFood == "QuarterPounder") {
            costIn$ = 4.39;
            return costIn$;
        }
        if (orderFood == "ChickenNuggets") {
            costIn$ = 3.99;
            return costIn$;
        }
        if (orderFood == "Cheeseburger") {
            costIn$ = 1.19;
            return costIn$;
        }
        if (orderFood == "Hamburger") {
            costIn$ = 1.00;
            return costIn$;
        }
        if (orderFood == "DoubleCheeseburger") {
            costIn$ = 2.19;
            return costIn$;
        }
        if (orderFood == "FrenchFries") {
            costIn$ = 1.89;
            return costIn$;
        }
        if (orderFood == "ApplePie") {
            costIn$ = 0.99;
            return costIn$;
        }
        if (orderFood == "McFlurry") {
            costIn$ = 2.49;
            return costIn$;
        }
        if (orderFood == "SausageMcMuffin") {
            costIn$ = 2.99;
            return costIn$;
        }
        if (orderFood == "EggMcMuffin") {
            costIn$ = 3.39;
            return costIn$;
        }
        if (orderFood == "BigBreakfast") {
            costIn$ = 4.79;
            return costIn$;
        }
        if (orderFood == "ChickenMcNuggetMeal") {
            costIn$ = 6.49;
            return costIn$;
        }
        if (orderFood == "QuarterPounderMeal") {
            costIn$ = 6.79;
            return costIn$;
        }
        if (orderFood == "PremiumGrilledChickenClassic") {
            costIn$ = 5.09;
            return costIn$;
        }
        if (orderFood == "HappyMeal") {
            costIn$ = 2.02;
            return costIn$;
        }
        if (orderFood == "MightyKidsMeal") {
            costIn$ = 2.02;
            return costIn$;
        }
        if (orderFood == "BaconMcDouble") {
            costIn$ = 2.89;
            return costIn$;
        }
        if (orderFood == "DoubleFiletOFish") {
            costIn$ = 21.9;
            return costIn$;
        }

        if (orderFood == "ArtisanGrilledChickenClub") {
            costIn$ = 5.59;
            return costIn$;
        }
        if (orderFood == "LargeFrenchFries") {
            costIn$ = 2.49;
            return costIn$;
        }
        if (orderFood == "ChocolateShake") {
            costIn$ = 2.39;
            return costIn$;
        }
        if (orderFood == "StrawberryBananaSmoothie") {
            costIn$ = 2.89;
            return costIn$;
        }
        if (orderFood == "Hotcakes") {
            costIn$ = 2.79;
            return costIn$;
        }
        if (orderFood == "Hashbrowns") {
            costIn$ = 1.09;
            return costIn$;
        }
        if (orderFood == "BaconEggAndCheeseBiscuit") {
            costIn$ = 2.99;
            return costIn$;
        }
        if (orderFood == "EggWhiteDelightMcMuffin") {
            costIn$ = 2.89;
            return costIn$;
        }
        if (orderFood == "FruitAndYogurtParfait") {
            costIn$ = 2.39;
            return costIn$;
        }
        if (orderFood == "SideSalad") {
            costIn$ = 1.59;
            return costIn$;
        }
        if (orderFood == "FruitAndWalnutSalad") {
            costIn$ = 4.79;
            return costIn$;
        }
        if (orderFood == "MochaFrappé") {
            costIn$ = 3.49;
            return costIn$;
        }
        if (orderFood == "Hashbrowns") {
            costIn$ = 1.09;
            return costIn$;
        }
        if (orderFood == "BaconEggAndCheeseBiscuit") {
            costIn$ = 2.99;
            return costIn$;
        }
        if (orderFood == "EggWhiteDelightMcMuffin") {
            costIn$ = 2.89;
            return costIn$;
        }
        if (orderFood == "HotFudgeSundae") {
            costIn$ = 1.49;
            return costIn$;
        }
        if (orderFood == "SausageBurrito") {
            costIn$ = 1.29;
            return costIn$;
        }
        if (orderFood == "Hotcakes") {
            costIn$ = 2.79;
            return costIn$;
        }
        if (orderFood == "SideSalad") {
            costIn$ = 1.59;
            return costIn$;
        }
        if (orderFood == "FruitAndWalnutSalad") {
            costIn$ = 4.79;
            return costIn$;
        }
        if (orderFood == "MochaFrappé") {
            costIn$ = 3.49;
            return costIn$;
        }
        if (orderFood == "VanillaCone") {
            costIn$ = 1.00;
            return costIn$;
        }
        if (orderFood == "McDouble") {
            costIn$ = 2.69;
            return costIn$;
        }
        if (orderFood == "BaconRanchSalad") {
            costIn$ = 5.29;
            return costIn$;
        }
        if (orderFood == "CrispyChickenSandwich") {
            costIn$ = 4.29;
            return costIn$;
        }
        if (orderFood == "HotCaramelSundae") {
            costIn$ = 1.49;
            return costIn$;
        }
        if (orderFood == "SideSalad") {
            costIn$ = 1.59;
            return costIn$;
        }
        if (orderFood == "ChocolateShake") {
            costIn$ = 2.39;
            return costIn$;
        }
        if (orderFood == "EggMcMeal") {
            costIn$ = 2.56;
            return costIn$;
        }

        

        System.out.println("mcorder ended");
        return costIn$;
    }

    public static double mcorder(String orderFood,int quantity) {
        double costIn$ = 0.0;
        System.out.println("mcorder started");

        if (orderFood == "BigMac") {
            costIn$ = 4.99*quantity;
            return costIn$;
        }
        if (orderFood == "McChicken") {
            costIn$ = 3.79*quantity;
            return costIn$;
        }
        if (orderFood == "FiletOFish") {
            costIn$ = 4.29*quantity;
            return costIn$;
        }
        if (orderFood == "QuarterPounder") {
            costIn$ = 4.39*quantity;
            return costIn$;
        }
        if (orderFood == "ChickenNuggets") {
            costIn$ = 3.99*quantity;
            return costIn$;
        }
        if (orderFood == "Cheeseburger") {
            costIn$ = 1.19*quantity;
            return costIn$;
        }
        if (orderFood == "Hamburger") {
            costIn$ = 1.00*quantity;
            return costIn$;
        }
        if (orderFood == "DoubleCheeseburger") {
            costIn$ = 2.19*quantity;
            return costIn$;
        }
        if (orderFood == "FrenchFries") {
            costIn$ = 1.89*quantity;
            return costIn$;
        }
        if (orderFood == "ApplePie") {
            costIn$ = 0.99*quantity;
            return costIn$;
        }
        if (orderFood == "McFlurry") {
            costIn$ = 2.49*quantity;
            return costIn$;
        }
        if (orderFood == "SausageMcMuffin") {
            costIn$ = 2.99*quantity;
            return costIn$;
        }
        if (orderFood == "EggMcMuffin") {
            costIn$ = 3.39*quantity;
            return costIn$;
        }
        if (orderFood == "BigBreakfast") {
            costIn$ = 4.79*quantity;
            return costIn$;
        }
        if (orderFood == "ChickenMcNuggetMeal") {
            costIn$ = 6.49*quantity;
            return costIn$;
        }
        if (orderFood == "QuarterPounderMeal") {
            costIn$ = 6.79*quantity;
            return costIn$;
        }
        if (orderFood == "PremiumGrilledChickenClassic") {
            costIn$ = 5.09*quantity;
            return costIn$;
        }
        if (orderFood == "HappyMeal") {
            costIn$ = 2.02*quantity;
            return costIn$;
        }
        if (orderFood == "MightyKidsMeal") {
            costIn$ = 2.02*quantity;
            return costIn$;
        }
        if (orderFood == "BaconMcDouble") {
            costIn$ = 2.89*quantity;
            return costIn$;
        }
        if (orderFood == "DoubleFiletOFish") {
            costIn$ = 21.9*quantity;
            return costIn$;
        }

        if (orderFood == "ArtisanGrilledChickenClub") {
            costIn$ = 5.59*quantity;
            return costIn$;
        }
        if (orderFood == "LargeFrenchFries") {
            costIn$ = 2.49*quantity;
            return costIn$;
        }
        if (orderFood == "ChocolateShake") {
            costIn$ = 2.39*quantity;
            return costIn$;
        }
        if (orderFood == "StrawberryBananaSmoothie") {
            costIn$ = 2.89*quantity;
            return costIn$;
        }
        if (orderFood == "Hotcakes") {
            costIn$ = 2.79*quantity;
            return costIn$;
        }
        if (orderFood == "Hashbrowns") {
            costIn$ = 1.09*quantity;
            return costIn$;
        }
        if (orderFood == "BaconEggAndCheeseBiscuit") {
            costIn$ = 2.99*quantity;
            return costIn$;
        }
        if (orderFood == "EggWhiteDelightMcMuffin") {
            costIn$ = 2.89*quantity;
            return costIn$;
        }
        if (orderFood == "FruitAndYogurtParfait") {
            costIn$ = 2.39*quantity;
            return costIn$;
        }
        if (orderFood == "SideSalad") {
            costIn$ = 1.59*quantity;
            return costIn$;
        }
        if (orderFood == "FruitAndWalnutSalad") {
            costIn$ = 4.79*quantity;
            return costIn$;
        }
        if (orderFood == "MochaFrappé") {
            costIn$ = 3.49*quantity;
            return costIn$;
        }
        if (orderFood == "Hashbrowns") {
            costIn$ = 1.09*quantity;
            return costIn$;
        }
        if (orderFood == "BaconEggAndCheeseBiscuit") {
            costIn$ = 2.99*quantity;
            return costIn$;
        }
        if (orderFood == "EggWhiteDelightMcMuffin") {
            costIn$ = 2.89*quantity;
            return costIn$;
        }
        if (orderFood == "HotFudgeSundae") {
            costIn$ = 1.49*quantity;
            return costIn$;
        }
        if (orderFood == "SausageBurrito") {
            costIn$ = 1.29*quantity;
            return costIn$;
        }
        if (orderFood == "Hotcakes") {
            costIn$ = 2.79*quantity;
            return costIn$;
        }
        if (orderFood == "SideSalad") {
            costIn$ = 1.59*quantity;
            return costIn$;
        }
        if (orderFood == "FruitAndWalnutSalad") {
            costIn$ = 4.79*quantity;
            return costIn$;
        }
        if (orderFood == "MochaFrappé") {
            costIn$ = 3.49*quantity;
            return costIn$;
        }
        if (orderFood == "VanillaCone") {
            costIn$ = 1.00*quantity;
            return costIn$;
        }
        if (orderFood == "McDouble") {
            costIn$ = 2.69*quantity;
            return costIn$;
        }
        if (orderFood == "BaconRanchSalad") {
            costIn$ = 5.29*quantity;
            return costIn$;
        }
        if (orderFood == "CrispyChickenSandwich") {
            costIn$ = 4.29*quantity;
            return costIn$;
        }
        if (orderFood == "HotCaramelSundae") {
            costIn$ = 1.49*quantity;
            return costIn$;
        }
        if (orderFood == "SideSalad") {
            costIn$ = 1.59*quantity;
            return costIn$;
        }
        if (orderFood == "ChocolateShake") {
            costIn$ = 2.39*quantity;
            return costIn$;
        }
        if (orderFood == "EggMcMeal") {
            costIn$ = 2.56*quantity;
            return costIn$;
        }

        

        System.out.println("mcorder ended");
        return costIn$;
    }
}


