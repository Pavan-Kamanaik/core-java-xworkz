class GrabHub {
    public static double orderFood(String itemName) {
        double costIn$ = 0.0;
        System.out.println("GrabHub order started");

        if (itemName == "Pizza") {
            costIn$ = 10.99;
            return costIn$;
        }
        if (itemName == "Burger") {
            costIn$ = 7.49;
            return costIn$;
        }
        if (itemName == "Sushi") {
            costIn$ = 12.29;
            return costIn$;
        }
        if (itemName == "Pasta") {
            costIn$ = 9.99;
            return costIn$;
        }
        if (itemName == "Salad") {
            costIn$ = 6.99;
            return costIn$;
        }
        if (itemName == "Burrito") {
            costIn$ = 8.79;
            return costIn$;
        }
        if (itemName == "FriedChicken") {
            costIn$ = 8.49;
            return costIn$;
        }
        if (itemName == "ThaiCurry") {
            costIn$ = 11.59;
            return costIn$;
        }
        if (itemName == "SushiRolls") {
            costIn$ = 13.49;
            return costIn$;
        }
        if (itemName == "IceCream") {
            costIn$ = 4.99;
            return costIn$;
        }
        if (itemName == "Taco") {
            costIn$ = 5.79;
            return costIn$;
        }
        if (itemName == "Sandwich") {
            costIn$ = 6.29;
            return costIn$;
        }
        if (itemName == "Ramen") {
            costIn$ = 10.49;
            return costIn$;
        }
        if (itemName == "Steak") {
            costIn$ = 15.99;
            return costIn$;
        }
        if (itemName == "ChickenRice") {
            costIn$ = 7.99;
            return costIn$;
        }
        if (itemName == "Cheeseburger") {
            costIn$ = 8.99;
            return costIn$;
        }
        if (itemName == "MargheritaPizza") {
            costIn$ = 10.49;
            return costIn$;
        }
        if (itemName == "SushiRolls") {
            costIn$ = 12.79;
            return costIn$;
        }
        if (itemName == "PadThai") {
            costIn$ = 11.99;
            return costIn$;
        }
        if (itemName == "ChickenTenders") {
            costIn$ = 9.29;
            return costIn$;
        }
        if (itemName == "FriedRice") {
            costIn$ = 8.49;
            return costIn$;
        }
        if (itemName == "CaesarSalad") {
            costIn$ = 6.99;
            return costIn$;
        }
        if (itemName == "SushiCombo") {
            costIn$ = 15.99;
            return costIn$;
        }
        if (itemName == "ChocolateCake") {
            costIn$ = 5.49;
            return costIn$;
        }

        if (itemName == "BBQChickenSandwich") {
            costIn$ = 10.99;
            return costIn$;
        }
        if (itemName == "MargaritaCocktail") {
            costIn$ = 8.99;
            return costIn$;
        }
        if (itemName == "SpaghettiBolognese") {
            costIn$ = 11.79;
            return costIn$;
        }
        if (itemName == "AvocadoToast") {
            costIn$ = 7.49;
            return costIn$;
        }
        if (itemName == "ShrimpScampi") {
            costIn$ = 14.29;
            return costIn$;
        }
        if (itemName == "Pho") {
            costIn$ = 9.79;
            return costIn$;
        }
        if (itemName == "GreekSalad") {
            costIn$ = 8.49;
            return costIn$;
        }
        if (itemName == "CrispyTofuStirFry") {
            costIn$ = 10.99;
            return costIn$;
        }
        if (itemName == "TurkeyClubSandwich") {
            costIn$ = 9.89;
            return costIn$;
        }
        if (itemName == "NewYorkCheesecake") {
            costIn$ = 6.99;
            return costIn$;
        }
        if (itemName == "BBQRibs") {
            costIn$ = 12.99;
            return costIn$;
        }
        if (itemName == "CapreseSalad") {
            costIn$ = 8.99;
            return costIn$;
        }
        if (itemName == "VeganBowl") {
            costIn$ = 9.79;
            return costIn$;
        }
        if (itemName == "LobsterRoll") {
            costIn$ = 15.49;
            return costIn$;
        }
        if (itemName == "RedVelvetCake") {
            costIn$ = 6.49;
            return costIn$;
        }
        if (itemName == "BBQChickenWrap") {
            costIn$ = 8.99;
            return costIn$;
        }
        if (itemName == "MangoSmoothie") {
            costIn$ = 5.79;
            return costIn$;
        }
        if (itemName == "SteakFajitas") {
            costIn$ = 12.49;
            return costIn$;
        }
        if (itemName == "GreekYogurtParfait") {
            costIn$ = 4.99;
            return costIn$;
        }
        if (itemName == "SeafoodTacos") {
            costIn$ = 11.29;
            return costIn$;
        }
        if (itemName == "TomatoSoup") {
            costIn$ = 6.49;
            return costIn$;
        }
        if (itemName == "BanhMiSandwich") {
            costIn$ = 9.99;
            return costIn$;
        }
        if (itemName == "EggplantParmesan") {
            costIn$ = 10.79;
            return costIn$;
        }
        if (itemName == "ChocolateChipCookies") {
            costIn$ = 4.49;
            return costIn$;
        }
        if (itemName == "VeganRoll") {
            costIn$ = 8.79;
            return costIn$;
        }
        if (itemName == "SushiCake") {
            costIn$ = 5.49;
            return costIn$;
        }

        System.out.println("GrabHub order ended");

        return costIn$;
    }

    public static double orderFood(String itemName,int quantity) {
        double costIn$ = 0.0;
        System.out.println("GrabHub order started");

        if (itemName == "Pizza") {
            costIn$ = 10.99*quantity;
            return costIn$;
        }
        if (itemName == "Burger") {
            costIn$ = 7.49*quantity;
            return costIn$;
        }
        if (itemName == "Sushi") {
            costIn$ = 12.29*quantity;
            return costIn$;
        }
        if (itemName == "Pasta") {
            costIn$ = 9.99*quantity;
            return costIn$;
        }
        if (itemName == "Salad") {
            costIn$ = 6.99*quantity;
            return costIn$;
        }
        if (itemName == "Burrito") {
            costIn$ = 8.79*quantity;
            return costIn$;
        }
        if (itemName == "FriedChicken") {
            costIn$ = 8.49*quantity;
            return costIn$;
        }
        if (itemName == "ThaiCurry") {
            costIn$ = 11.59*quantity;
            return costIn$;
        }
        if (itemName == "SushiRolls") {
            costIn$ = 13.49*quantity;
            return costIn$;
        }
        if (itemName == "IceCream") {
            costIn$ = 4.99*quantity;
            return costIn$;
        }
        if (itemName == "Taco") {
            costIn$ = 5.79*quantity;
            return costIn$;
        }
        if (itemName == "Sandwich") {
            costIn$ = 6.29*quantity;
            return costIn$;
        }
        if (itemName == "Ramen") {
            costIn$ = 10.49*quantity;
            return costIn$;
        }
        if (itemName == "Steak") {
            costIn$ = 15.99*quantity;
            return costIn$;
        }
        if (itemName == "ChickenRice") {
            costIn$ = 7.99*quantity;
            return costIn$;
        }
        if (itemName == "Cheeseburger") {
            costIn$ = 8.99*quantity;
            return costIn$;
        }
        if (itemName == "MargheritaPizza") {
            costIn$ = 10.49*quantity;
            return costIn$;
        }
        if (itemName == "SushiRolls") {
            costIn$ = 12.79*quantity;
            return costIn$;
        }
        if (itemName == "PadThai") {
            costIn$ = 11.99*quantity;
            return costIn$;
        }
        if (itemName == "ChickenTenders") {
            costIn$ = 9.29*quantity;
            return costIn$;
        }
        if (itemName == "FriedRice") {
            costIn$ = 8.49*quantity;
            return costIn$;
        }
        if (itemName == "CaesarSalad") {
            costIn$ = 6.99*quantity;
            return costIn$;
        }
        if (itemName == "SushiCombo") {
            costIn$ = 15.99*quantity;
            return costIn$;
        }
        if (itemName == "ChocolateCake") {
            costIn$ = 5.49*quantity;
            return costIn$;
        }

        if (itemName == "BBQChickenSandwich") {
            costIn$ = 10.99*quantity;
            return costIn$;
        }
        if (itemName == "MargaritaCocktail") {
            costIn$ = 8.99*quantity;
            return costIn$;
        }
        if (itemName == "SpaghettiBolognese") {
            costIn$ = 11.79*quantity;
            return costIn$;
        }
        if (itemName == "AvocadoToast") {
            costIn$ = 7.49*quantity;
            return costIn$;
        }
        if (itemName == "ShrimpScampi") {
            costIn$ = 14.29*quantity;
            return costIn$;
        }
        if (itemName == "Pho") {
            costIn$ = 9.79*quantity;
            return costIn$;
        }
        if (itemName == "GreekSalad") {
            costIn$ = 8.49*quantity;
            return costIn$;
        }
        if (itemName == "CrispyTofuStirFry") {
            costIn$ = 10.99*quantity;
            return costIn$;
        }
        if (itemName == "TurkeyClubSandwich") {
            costIn$ = 9.89*quantity;
            return costIn$;
        }
        if (itemName == "NewYorkCheesecake") {
            costIn$ = 6.99*quantity;
            return costIn$;
        }
        if (itemName == "BBQRibs") {
            costIn$ = 12.99*quantity;
            return costIn$;
        }
        if (itemName == "CapreseSalad") {
            costIn$ = 8.99*quantity;
            return costIn$;
        }
        if (itemName == "VeganBowl") {
            costIn$ = 9.79*quantity;
            return costIn$;
        }
        if (itemName == "LobsterRoll") {
            costIn$ = 15.49*quantity;
            return costIn$;
        }
        if (itemName == "RedVelvetCake") {
            costIn$ = 6.49*quantity;
            return costIn$;
        }
        if (itemName == "BBQChickenWrap") {
            costIn$ = 8.99*quantity;
            return costIn$;
        }
        if (itemName == "MangoSmoothie") {
            costIn$ = 5.79*quantity;
            return costIn$;
        }
        if (itemName == "SteakFajitas") {
            costIn$ = 12.49*quantity;
            return costIn$;
        }
        if (itemName == "GreekYogurtParfait") {
            costIn$ = 4.99*quantity;
            return costIn$;
        }
        if (itemName == "SeafoodTacos") {
            costIn$ = 11.29*quantity;
            return costIn$;
        }
        if (itemName == "TomatoSoup") {
            costIn$ = 6.49*quantity;
            return costIn$;
        }
        if (itemName == "BanhMiSandwich") {
            costIn$ = 9.99*quantity;
            return costIn$;
        }
        if (itemName == "EggplantParmesan") {
            costIn$ = 10.79*quantity;
            return costIn$;
        }
        if (itemName == "ChocolateChipCookies") {
            costIn$ = 4.49*quantity;
            return costIn$;
        }
        if (itemName == "VeganRoll") {
            costIn$ = 8.79*quantity;
            return costIn$;
        }
        if (itemName == "SushiCake") {
            costIn$ = 5.49*quantity;
            return costIn$;
        }

        System.out.println("GrabHub order ended");

        return costIn$;
    }
}
