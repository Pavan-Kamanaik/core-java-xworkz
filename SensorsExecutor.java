class SensorsExecutor {
    public static void main(String sense[]) {
        Sensors sensor1 = new Sensors();
        sensor1.sensorId = 254;
        sensor1.type = "Temperature";
        sensor1.location = "Living Room";
        sensor1.isActive = true;
        sensor1.readingValue = 23.5;
        System.out.println("Sensor ID: " + sensor1.sensorId);
        System.out.println("Sensor Type: " + sensor1.type);
        System.out.println("Location: " + sensor1.location);
        System.out.println("Active: " + sensor1.isActive);
        System.out.println("Reading Value: " + sensor1.readingValue);
        sensor1.sensorAttributes();
        System.out.println("\n");

        Sensors sensor2 = new Sensors();
        sensor2.sensorId = 56;
        sensor2.type = "Humidity";
        sensor2.location = "Kitchen";
        sensor2.isActive = false;
        sensor2.readingValue = 65.2;
        System.out.println("Sensor ID: " + sensor2.sensorId);
        System.out.println("Sensor Type: " + sensor2.type);
        System.out.println("Location: " + sensor2.location);
        System.out.println("Active: " + sensor2.isActive);
        System.out.println("Reading Value: " + sensor2.readingValue);
        sensor2.sensorAttributes();
        System.out.println("\n");

        Sensors sensor3 = new Sensors();
        sensor3.sensorId = 82;
        sensor3.type = "Motion";
        sensor3.location = "Bedroom";
        sensor3.isActive = true;
        sensor3.readingValue = 0;
        System.out.println("Sensor ID: " + sensor3.sensorId);
        System.out.println("Sensor Type: " + sensor3.type);
        System.out.println("Location: " + sensor3.location);
        System.out.println("Active: " + sensor3.isActive);
        System.out.println("Reading Value: " + sensor3.readingValue);
        sensor3.sensorAttributes();
        System.out.println("\n");

        Sensors sensor4 = new Sensors();
        sensor4.sensorId = 56;
        sensor4.type = "Light";
        sensor4.location = "Office";
        sensor4.isActive = true;
        sensor4.readingValue = 820.0;
        System.out.println("Sensor ID: " + sensor4.sensorId);
        System.out.println("Sensor Type: " + sensor4.type);
        System.out.println("Location: " + sensor4.location);
        System.out.println("Active: " + sensor4.isActive);
        System.out.println("Reading Value: " + sensor4.readingValue);
        sensor4.sensorAttributes();
        System.out.println("\n");

        Sensors sensor5 = new Sensors();
        sensor5.sensorId = 58;
        sensor5.type = "CO2";
        sensor5.location = "Conference Room";
        sensor5.isActive = true;
        sensor5.readingValue = 450.0;
        System.out.println("Sensor ID: " + sensor5.sensorId);
        System.out.println("Sensor Type: " + sensor5.type);
        System.out.println("Location: " + sensor5.location);
        System.out.println("Active: " + sensor5.isActive);
        System.out.println("Reading Value: " + sensor5.readingValue);
        sensor5.sensorAttributes();
        System.out.println("\n");

    }

}
