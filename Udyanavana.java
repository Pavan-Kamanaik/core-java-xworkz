class Udyanavana {

    int id;
    String name;
    String location;
    String flowers[];
    int noOfWorkers;
    int noOfGates;

    public Udyanavana(int id, String name, String location, String flowers[], int noOfWorkers, int noOfGates) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.flowers = flowers;
        this.noOfWorkers = noOfWorkers;
        this.noOfGates = noOfGates;

        System.out.println("Udyanavana ID : " + id);
        System.out.println("Udyanavana name : " + name);
        System.out.println("Udyanavana location : " + location);

        System.out.println("Number of Workers in Udyanavana : " + noOfWorkers);
        System.out.println("Gate Number  : " + noOfGates);
    }

    public void getFlowers1() {
		System.out.println("The flowers are : ");
        for (int index = 0; index < flowers.length; index++) {
            System.out.println(flowers[index]);
        }
    } 
	public void getFlowers2() {
		System.out.println("The flowers are : ");
        for (int index = 0; index < flowers.length; index++) {
            System.out.println(flowers[index]);
        }
    }
	public void getFlowers3() {
		System.out.println("The flowers are : ");
        for (int index = 0; index < flowers.length; index++) {
            System.out.println(flowers[index]);
        }
    }
	public void getFlowers4() {
		System.out.println("The flowers are : ");
        for (int index = 0; index < flowers.length; index++) {
            System.out.println(flowers[index]);
        }
    }
	public void getFlowers5() {
		System.out.println("The flowers are : ");
        for (int index = 0; index < flowers.length; index++) {
            System.out.println(flowers[index]);
        }
    }
}


