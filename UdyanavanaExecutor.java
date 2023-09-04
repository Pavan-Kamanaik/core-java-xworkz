
class UdyanavanaExecutor {
    public static void main(String arg[]) {
        String flowers1[] = {"Rose", "Tulip", "Daisy", "Lily", "Sunflower", "Carnation", "Orchid", "Daffodil", "Hydrangea", "Chrysanthemum"};
		String flowers2[] = {"Peony", "Marigold", "Dahlia", "Snapdragon", "Iris","Magnolia", "Lavender", "Poppy", "Freesia", "Bougainvillea"};
		String flowers3[] = {"Tulip", "Daisy", "Sunflower", "Carnation", "Orchid","Daffodil", "Hydrangea", "Chrysanthemum", "Peony", "Lavender"};
		String flowers4[] = {"Lilac", "Tulip", "Daisy", "Carnation", "Azalea","Hyacinth", "Aster", "Marigold", "Zinnia", "Hibiscus"};
		String flowers5[] = {"Dahlia", "Peony", "Lily of the Valley", "Bluebell", "Snapdragon","Amaryllis", "Anemone", "Sweet Pea", "Ranunculus", "Foxglove"};


        Udyanavana park1 = new Udyanavana(12, "Cubbon Park", "Bengaluru", flowers1, 10, 1);
        park1.getFlowers1();
		Udyanavana park2=new Udyanavana(54,"Brindavan Gardens","Mysore",flowers2,15,5);
		park2.getFlowers2();
		Udyanavana park3=new Udyanavana(49,"Lalbagh","Bengaluru",flowers3,25,2);
		park3.getFlowers3();
		Udyanavana park4=new Udyanavana(49,"Government Botonical Garden","Ooty",flowers4,40,5);
		park4.getFlowers3();
		Udyanavana park5=new Udyanavana(49,"Jaya ChamaRajendra Park","Mysore",flowers5,60,6);
		park5.getFlowers3();
		
    }
}
