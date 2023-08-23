class AirConditioner {
    static boolean isOn;
    static int minTemperature = 18;
    static int maxTemperature = 30;
    static int currentTemperature = 24;

    public static boolean onOrOff() {
        System.out.println("Invoked onOrOff");
        if (isOn == false) {
            isOn = true;
            System.out.println("The air conditioner is turned On : " + isOn);
        } else if (isOn == true) {
            isOn = false;
            System.out.println("The air conditioner is turned Off");
        }
        System.out.println("End of onOrOff");

        return isOn;
    }

    public static void increaseTemperature() {
        System.out.println("Start of increase temperature");
        if (isOn == true) {
            if (currentTemperature < maxTemperature) {
                currentTemperature += 1;
                System.out.println("The current temperature is " + currentTemperature);
            } else {
                System.out.println("Maximum temperature reached");
            }
        } else {
            System.out.println("First turn on the air conditioner");
        }
    }

    public static void decreaseTemperature() {
        System.out.println("Start of decrease temperature");
        if (isOn == true) {
            if (currentTemperature > minTemperature) {
                currentTemperature -= 1;
                System.out.println("The current temperature is " + currentTemperature);
            } else {
                System.out.println("Minimum temperature reached");
            }
        } else {
            System.out.println("First turn on the air conditioner");
        }
    }
}
