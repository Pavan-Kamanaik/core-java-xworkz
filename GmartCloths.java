class GmartCloths {

    int id;
    int noOfWorkers;
    String[] brands;
    String location;


    public GmartCloths(int clothID,int workers,String[] bnds,String area){
		id=clothID;
		noOfWorkers=workers;
		brands=bnds;
		location=area;
		System.out.println("Gmart Obeject Created");
		System.out.println("Cloth ID : "+id +"\n"+"Number of Workers : "+noOfWorkers +" \n"+"Gmart Location : "+location);
        
		
    }
    public void sellingCloths() {

    }

    public void doBusiness() {

    }

    public void getAllBrands(String brands[]) {
        for (int index = 0; index < brands.length; index++) {
            System.out.println(brands[index]);
        }
    }
}
