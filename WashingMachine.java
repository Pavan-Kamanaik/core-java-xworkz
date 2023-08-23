class WashingMachine {
    static boolean isPowerOnorOff;
    static int currentSpeed = 10;
    static int minSpeed = 0;
    static int maxSpeed = 20;

    public static boolean onOrOff() {
        System.out.println("Invoked onOrOff");
        if (isPowerOnorOff == false) {
            isPowerOnorOff = true;
            System.out.println("The washing machine is turned On. Ready to wash!");
        } else if (isPowerOnorOff == true) {
            isPowerOnorOff = false;
            System.out.println("The washing machine is turned Off");
        }
        System.out.println("End of onOrOff");

        return isPowerOnorOff;
    }

    public static void increaseSpeed() {
        System.out.println("Start of increase speed");
        if (isPowerOnorOff == true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed += 1;
                System.out.println("The current speed is " + currentSpeed);
            } else {
                System.out.println("Maximum speed reached");
            }
        } else {
            System.out.println("First turn on the washing machine");
        }
    }

    public static void decreaseSpeed() {
        System.out.println("Start of decrease speed");
        if (isPowerOnorOff == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed -= 1;
                System.out.println("The current speed is " + currentSpeed);
            } else {
                System.out.println("Minimum speed reached");
            }
        } else {
            System.out.println("First turn on the washing machine");
        }
    }
}
