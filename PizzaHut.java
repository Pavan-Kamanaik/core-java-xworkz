class PizzaHut {
    public static double pizzaorg(String orderFood) {
        double costIn$ = 0.0;
        System.out.println("pizzaOrg started");
        if (orderFood == "PepperoniPizza") {
            costIn$ = 170;
            return costIn$;
        }
        if (orderFood == "MargheritaPizza") {
            costIn$ = 150;
            return costIn$;
        }
        if (orderFood == "VeggieSupremePizza") {
            costIn$ = 160;
            return costIn$;
        }

        if (orderFood == "HawaiianPizza") {
            costIn$ = 175;
            return costIn$;
        }
        if (orderFood == "BBQChickenPizza") {
            costIn$ = 180;
            return costIn$;
        }

        if (orderFood == "MushroomPizza") {
            costIn$ = 155;
            return costIn$;
        }
        if (orderFood == "SpinachAlfredoPizza") {
            costIn$ = 165;
            return costIn$;
        }

        if (orderFood == "SupremePizza") {
            costIn$ = 190;
            return costIn$;
        }
        if (orderFood == "MeatLoversPizza") {
            costIn$ = 200;
            return costIn$;
        }
        if (orderFood == "BuffaloChickenPizza") {
            costIn$ = 185;
            return costIn$;
        }
        if (orderFood == "ChickenAlfredoPizza") {
            costIn$ = 195;
            return costIn$;
        }
        if (orderFood == "BaconCheeseburgerPizza") {
            costIn$ = 205;
            return costIn$;
        }
        if (orderFood == "SuperSupremePizza") {
            costIn$ = 210;
            return costIn$;
        }
        if (orderFood == "GardenPartyPizza") {
            costIn$ = 175;
            return costIn$;
        }
        if (orderFood == "SpicyChickenRanchPizza") {
            costIn$ = 180;
            return costIn$;
        }
        if (orderFood == "UltimateCheeseLoversPizza") {
            costIn$ = 160;
            return costIn$;
        }
        if (orderFood == "GarlicParmesanPizza") {
            costIn$ = 170;
            return costIn$;
        }
        if (orderFood == "PepperoniLoversPizza") {
            costIn$ = 175;
            return costIn$;
        }
        if (orderFood == "CheesePizza") {
            costIn$ = 140;
            return costIn$;
        }
        if (orderFood == "MediterraneanVeggiePizza") {
            costIn$ = 165;
            return costIn$;
        }
        if (orderFood == "PepperoniAndMushroomPizza") {
            costIn$ = 175;
            return costIn$;
        }
        if (orderFood == "VeggieLoversPizza") {
            costIn$ = 170;
            return costIn$;
        }
        if (orderFood == "PineappleAndHamPizza") {
            costIn$ = 160;
            return costIn$;
        }
        if (orderFood == "BuffaloRanchChickenPizza") {
            costIn$ = 190;
            return costIn$;
        }
        if (orderFood == "ItalianSausageAndRedOnionPizza") {
            costIn$ = 180;
            return costIn$;
        }
        if (orderFood == "GarlicBreadsticks") {
            costIn$ = 3.99;
            return costIn$;
        }
        if (orderFood == "CaesarSalad") {
            costIn$ = 5.29;
            return costIn$;
        }
        // Add more menu items
        if (orderFood == "StuffedCrustPizza") {
            costIn$ = 14.99;
            return costIn$;
        }
        if (orderFood == "BBQMeatLoversPizza") {
            costIn$ = 15.79;
            return costIn$;
        }
        if (orderFood == "MediterraneanVeggiePizza") {
            costIn$ = 12.49;
            return costIn$;
        }
        if (orderFood == "PastaBake") {
            costIn$ = 8.99;
            return costIn$;
        }
        if (orderFood == "TacoPizza") {
            costIn$ = 13.29;
            return costIn$;
        }
        if (orderFood == "BreadedBone-OutWings") {
            costIn$ = 8.79;
            return costIn$;
        }
        if (orderFood == "CheeseSticks") {
            costIn$ = 6.99;
            return costIn$;
        }
        if (orderFood == "VeggieBakedPasta") {
            costIn$ = 9.49;
            return costIn$;
        }
        if (orderFood == "CinnamonSticks") {
            costIn$ = 4.99;
            return costIn$;
        }
        if (orderFood == "GardenSalad") {
            costIn$ = 4.49;
            return costIn$;
        }
        if (orderFood == "VeggiePizza") {
            costIn$ = 11.79;
            return costIn$;
        }
        if (orderFood == "WingsStreetWings") {
            costIn$ = 9.99;
            return costIn$;
        }
        if (orderFood == "HutFavoritePizza") {
            costIn$ = 11.99;
            return costIn$;
        }
        if (orderFood == "AppleCrisp") {
            costIn$ = 4.99;
            return costIn$;
        }
        if (orderFood == "UltimateCheeseLoversPizza") {
            costIn$ = 12.99;
            return costIn$;
        }
        if (orderFood == "MushroomLoversPizza") {
            costIn$ = 11.49;
            return costIn$;
        }
        if (orderFood == "SuperSupremePizza") {
            costIn$ = 14.29;
            return costIn$;
        }
        if (orderFood == "ChickenAlfredoPasta") {
            costIn$ = 10.79;
            return costIn$;
        }
        if (orderFood == "VeggiePizza") {
            costIn$ = 11.79;
            return costIn$;
        }
        if (orderFood == "WingsStreetWings") {
            costIn$ = 9.99;
            return costIn$;
        }
        if (orderFood == "HutFavoritePizza") {
            costIn$ = 11.99;
            return costIn$;
        }
        if (orderFood == "AppleCrisp") {
            costIn$ = 5.05;
            return costIn$;
        }
        if (orderFood == "GarlicMushroomPizza") {
            costIn$ = 4.99;
            return costIn$;
        }

        System.out.println("pizzaOrg ended");

        return costIn$;
    }

     public static double pizzaorg(String orderFood,int quantity) {
        double costIn$ = 0.0;
        System.out.println("pizzaOrg started");
        if (orderFood == "PepperoniPizza") {
            costIn$ = 170*quantity;
            return costIn$;
        }
        if (orderFood == "MargheritaPizza") {
            costIn$ = 150*quantity;
            return costIn$;
        }
        if (orderFood == "VeggieSupremePizza") {
            costIn$ = 160*quantity;
            return costIn$;
        }

        if (orderFood == "HawaiianPizza") {
            costIn$ = 175*quantity;
            return costIn$;
        }
        if (orderFood == "BBQChickenPizza") {
            costIn$ = 180*quantity;
            return costIn$;
        }

        if (orderFood == "MushroomPizza") {
            costIn$ = 155*quantity;
            return costIn$;
        }
        if (orderFood == "SpinachAlfredoPizza") {
            costIn$ = 165*quantity;
            return costIn$;
        }

        if (orderFood == "SupremePizza") {
            costIn$ = 190*quantity;
            return costIn$;
        }
        if (orderFood == "MeatLoversPizza") {
            costIn$ = 200*quantity;
            return costIn$;
        }
        if (orderFood == "BuffaloChickenPizza") {
            costIn$ = 185*quantity;
            return costIn$;
        }
        if (orderFood == "ChickenAlfredoPizza") {
            costIn$ = 195*quantity;
            return costIn$;
        }
        if (orderFood == "BaconCheeseburgerPizza") {
            costIn$ = 205*quantity;
            return costIn$;
        }
        if (orderFood == "SuperSupremePizza") {
            costIn$ = 210*quantity;
            return costIn$;
        }
        if (orderFood == "GardenPartyPizza") {
            costIn$ = 175*quantity;
            return costIn$;
        }
        if (orderFood == "SpicyChickenRanchPizza") {
            costIn$ = 180*quantity;
            return costIn$;
        }
        if (orderFood == "UltimateCheeseLoversPizza") {
            costIn$ = 160*quantity;
            return costIn$;
        }
        if (orderFood == "GarlicParmesanPizza") {
            costIn$ = 170*quantity;
            return costIn$;
        }
        if (orderFood == "PepperoniLoversPizza") {
            costIn$ = 175*quantity;
            return costIn$;
        }
        if (orderFood == "CheesePizza") {
            costIn$ = 140*quantity;
            return costIn$;
        }
        if (orderFood == "MediterraneanVeggiePizza") {
            costIn$ = 165*quantity;
            return costIn$;
        }
        if (orderFood == "PepperoniAndMushroomPizza") {
            costIn$ = 175*quantity;
            return costIn$;
        }
        if (orderFood == "VeggieLoversPizza") {
            costIn$ = 170*quantity;
            return costIn$;
        }
        if (orderFood == "PineappleAndHamPizza") {
            costIn$ = 160*quantity;
            return costIn$;
        }
        if (orderFood == "BuffaloRanchChickenPizza") {
            costIn$ = 190*quantity;
            return costIn$;
        }
        if (orderFood == "ItalianSausageAndRedOnionPizza") {
            costIn$ = 180*quantity;
            return costIn$;
        }
        if (orderFood == "GarlicBreadsticks") {
            costIn$ = 3.99*quantity;
            return costIn$;
        }
        if (orderFood == "CaesarSalad") {
            costIn$ = 5.29*quantity;
            return costIn$;
        }
        // Add more menu items
        if (orderFood == "StuffedCrustPizza") {
            costIn$ = 14.99*quantity;
            return costIn$;
        }
        if (orderFood == "BBQMeatLoversPizza") {
            costIn$ = 15.79*quantity;
            return costIn$;
        }
        if (orderFood == "MediterraneanVeggiePizza") {
            costIn$ = 12.49*quantity;
            return costIn$;
        }
        if (orderFood == "PastaBake") {
            costIn$ = 8.99*quantity;
            return costIn$;
        }
        if (orderFood == "TacoPizza") {
            costIn$ = 13.29*quantity;
            return costIn$;
        }
        if (orderFood == "BreadedBone-OutWings") {
            costIn$ = 8.79*quantity;
            return costIn$;
        }
        if (orderFood == "CheeseSticks") {
            costIn$ = 6.99*quantity;
            return costIn$;
        }
        if (orderFood == "VeggieBakedPasta") {
            costIn$ = 9.49*quantity;
            return costIn$;
        }
        if (orderFood == "CinnamonSticks") {
            costIn$ = 4.99*quantity;
            return costIn$;
        }
        if (orderFood == "GardenSalad") {
            costIn$ = 4.49*quantity;
            return costIn$;
        }
        if (orderFood == "VeggiePizza") {
            costIn$ = 11.79*quantity;
            return costIn$;
        }
        if (orderFood == "WingsStreetWings") {
            costIn$ = 9.99*quantity;
            return costIn$;
        }
        if (orderFood == "HutFavoritePizza") {
            costIn$ = 11.99*quantity;
            return costIn$;
        }
        if (orderFood == "AppleCrisp") {
            costIn$ = 4.99*quantity;
            return costIn$;
        }
        if (orderFood == "UltimateCheeseLoversPizza") {
            costIn$ = 12.99*quantity;
            return costIn$;
        }
        if (orderFood == "MushroomLoversPizza") {
            costIn$ = 11.49*quantity;
            return costIn$;
        }
        if (orderFood == "SuperSupremePizza") {
            costIn$ = 14.29*quantity;
            return costIn$;
        }
        if (orderFood == "ChickenAlfredoPasta") {
            costIn$ = 10.79*quantity;
            return costIn$;
        }
        if (orderFood == "VeggiePizza") {
            costIn$ = 11.79*quantity;
            return costIn$;
        }
        if (orderFood == "WingsStreetWings") {
            costIn$ = 9.99*quantity;
            return costIn$;
        }
        if (orderFood == "HutFavoritePizza") {
            costIn$ = 11.99*quantity;
            return costIn$;
        }
        if (orderFood == "AppleCrisp") {
            costIn$ = 5.05*quantity;
            return costIn$;
        }
        if (orderFood == "GarlicMushroomPizza") {
            costIn$ = 4.99*quantity;
            return costIn$;
        }

        System.out.println("pizzaOrg ended");

        return costIn$;
    }
}
