class PizzaHutExecutor {
    public static void main(String order[]) {
        System.out.println("Main Started");

        double cost1 = PizzaHut.pizzaorg("PepperoniPizza");

        System.out.println("The cost of PepperoniPizza is : " + cost1);
        double costWithPrice = PizzaHut.pizzaorg("PepperoniPizza",4);

        System.out.println("The cost of PepperoniPizza with price is : " + costWithPrice);

        System.out.println("Main Ended");
    }

}
