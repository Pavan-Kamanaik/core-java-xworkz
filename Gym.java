class Gym {
    int gymId;
    String gymName;
    String location;
    int noOfEquipments;
    int currentMembers;

    public Gym(int gymId, String gymName, String location, int noOfEquipments, int currentMembers) {
        this.gymId = gymId;
        this.gymName = gymName;
        this.location = location;
        this.noOfEquipments = noOfEquipments;
        this.currentMembers = currentMembers;

        System.out.println("Gym ID: " + gymId);
        System.out.println("Gym Name: " + gymName);
        System.out.println("Location: " + location);
        System.out.println("Number of Equipments " + noOfEquipments);
        System.out.println("Current Members: " + currentMembers);
        System.out.println("\n");
    }
}


