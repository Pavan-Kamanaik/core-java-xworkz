class ApartmentExecutor {

    public static void main(String a[]) {
        // new
        // creating multiple copy of a class ---Object
        // ClassName ReferenceVariable =new Classname();
        Apartment apartment1 = new Apartment();
        apartment1.apartmentId = 1;
        apartment1.apartmentName = "Prestige";
        apartment1.location = "Whitefield";
        apartment1.noOfFloors = 45;
        apartment1.noOfTwoBhkFlats = 150;
        apartment1.noOfThreeBhkFlats = 90;
        System.out.println("Apartment Id = " + apartment1.apartmentId);
        System.out.println("Apartment Name = " + apartment1.apartmentName);
        System.out.println("Apartment is in the  = " + apartment1.location);
        System.out.println("No of Floors in the apartment = " + apartment1.noOfFloors);
        System.out.println("Number of Two BHK Flats = " + apartment1.noOfTwoBhkFlats);
        System.out.println("Number of Three BHK Flats = " + apartment1.noOfThreeBhkFlats);

        apartment1.provideAccomadation();
        System.out.println("\n");

        Apartment apartment2 = new Apartment();
        apartment2.apartmentId = 2;
        apartment2.apartmentName = "Prestige";
        apartment2.location = "JP Nagar";
        apartment2.noOfFloors = 50;
        apartment2.noOfTwoBhkFlats = 250;
        apartment2.noOfThreeBhkFlats = 120;
        System.out.println("Apartment Id = " + apartment2.apartmentId);
        System.out.println("Apartment Name = " + apartment2.apartmentName);
        System.out.println("Apartment is in the  = " + apartment2.location);
        System.out.println("No of Floors in the apartment = " + apartment2.noOfFloors);
        System.out.println("Number of Two BHK Flats = " + apartment2.noOfTwoBhkFlats);
        System.out.println("Number of Three BHK Flats = " + apartment2.noOfThreeBhkFlats);

        apartment2.provideAccomadation();
        System.out.println("\n");

        Apartment apartment3 = new Apartment();
        apartment3.apartmentId = 3;
        apartment3.apartmentName = "Prestige";
        apartment3.location = "Banashankari";
        apartment3.noOfFloors = 59;
        apartment3.noOfTwoBhkFlats = 290;
        apartment3.noOfThreeBhkFlats = 150;
        System.out.println("Apartment Id = " + apartment3.apartmentId);
        System.out.println("Apartment Name = " + apartment3.apartmentName);
        System.out.println("Apartment is in the  = " + apartment3.location);
        System.out.println("No of Floors in the apartment = " + apartment3.noOfFloors);
        System.out.println("Number of Two BHK Flats = " + apartment3.noOfTwoBhkFlats);
        System.out.println("Number of Three BHK Flats = " + apartment3.noOfThreeBhkFlats);

        apartment3.provideAccomadation();
        System.out.println("\n");

        Apartment apartment4 = new Apartment();
        apartment4.apartmentId = 4;
        apartment4.apartmentName = "Prestige";
        apartment4.location = "Yeshwanthpur";
        apartment4.noOfFloors = 48;
        apartment4.noOfTwoBhkFlats = 135;
        apartment4.noOfThreeBhkFlats = 153;
        System.out.println("Apartment Id = " + apartment4.apartmentId);
        System.out.println("Apartment Name = " + apartment4.apartmentName);
        System.out.println("Apartment is in the  = " + apartment4.location);
        System.out.println("No of Floors in the apartment = " + apartment4.noOfFloors);
        System.out.println("Number of Two BHK Flats = " + apartment4.noOfTwoBhkFlats);
        System.out.println("Number of Three BHK Flats = " + apartment4.noOfThreeBhkFlats);

        apartment4.provideAccomadation();
        System.out.println("\n");

        Apartment apartment5 = new Apartment();
        apartment5.apartmentId = 5;
        apartment5.apartmentName = "Prestige";
        apartment5.location = "BTM layout";
        apartment5.noOfFloors = 35;
        apartment5.noOfTwoBhkFlats = 189;
        apartment5.noOfThreeBhkFlats = 269;
        System.out.println("Apartment Id = " + apartment5.apartmentId);
        System.out.println("Apartment Name = " + apartment5.apartmentName);
        System.out.println("Apartment is in the  = " + apartment5.location);
        System.out.println("No of Floors in the apartment = " + apartment5.noOfFloors);
        System.out.println("Number of Two BHK Flats = " + apartment5.noOfTwoBhkFlats);
        System.out.println("Number of Three BHK Flats = " + apartment5.noOfThreeBhkFlats);

        apartment5.provideAccomadation();
        System.out.println("\n");

    }
}
// 5 variables
// lenskart
// chain
// apartment
// fasttrack
// sensors
