class Sensors {
    int sensorId;
    String type;
    String location;
    boolean isActive;
    double readingValue;
    public Sensors(int Id,String sensType,String area,boolean active,double value){
		sensorId=Id;
		type=sensType;
		location=area;
		isActive=active;
		readingValue=value;
        System.out.println("Sensor Object Created");
		System.out.println("Sensor ID: " +sensorId);
        System.out.println("Sensor Type: " +type);
        System.out.println("Location: " +location);
        System.out.println("Active: " +isActive);
        System.out.println("Reading Value: " +readingValue);
    }
    public void sensorAttributes(){
        System.out.println("Displaying the sensor attributes");
    }
    
}
