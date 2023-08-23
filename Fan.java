class Fan {
    static boolean isSwitchOnorOff;
    static int currentSpeed = 2;
    static int minSpeed = 0;
    static int maxSpeed = 4;

    public static boolean onOrOff() {
        System.out.println("Invoked onOrOff");
        if (isSwitchOnorOff == false) {
            isSwitchOnorOff = true;
            System.out.println("The fan is turned On. Enjoy the breeze!");
        } else if (isSwitchOnorOff == true) {
            isSwitchOnorOff = false;
            System.out.println("The fan is turned Off");
        }
        System.out.println("End of onOrOff");

        return isSwitchOnorOff;
    }

    public static void increaseSpeed() {
        System.out.println("Start of increase speed");
        if (isSwitchOnorOff == true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed += 1;
                System.out.println("The current speed is " + currentSpeed);
            } else {
                System.out.println("Maximum speed reached");
            }
        } else {
            System.out.println("First turn on the fan");
        }
    }

    public static void decreaseSpeed() {
        System.out.println("Start of decrease speed");
        if (isSwitchOnorOff == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed -= 1;
                System.out.println("The current speed is " + currentSpeed);
            } else {
                System.out.println("Minimum speed reached");
            }
        } else {
            System.out.println("First turn on the fan");
        }
    }
}
