class Chain {
    int chainId;
    String chainDesign;
    String color;
    double weight;
    String material;

public Chain(int ID,String cdesign,String clr,double wght,String materialType){
	chainId=ID;
	chainDesign=cdesign;
	color=clr;
	weight=wght;
	material=materialType;
	System.out.println("Chain ID: " +chainId);
        System.out.println("Chain Design: " +chainDesign );
        System.out.println("Chain Color: " +color);
        System.out.println("Chain Weight: " +weight +" grams");
        System.out.println("Chain Material: " +material);
	System.out.println("Chain Constructor invoked");
	
	
}

    public void chainProperties(){
        System.out.println("Properties of Chain");
    }
    
}
