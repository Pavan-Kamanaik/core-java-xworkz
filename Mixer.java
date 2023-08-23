class Mixer {
    static boolean isSwitch;
    static int currentSpeed;
    static int minSpeed = 0;
    static int maxSpeed = 4;

    public static boolean onOrOff() {
        System.out.println("Invoked onOrOff");
        if (isSwitch == false) {
            isSwitch = true;
            System.out.println("The mixer is turned On. Ready to mix!" + isSwitch);
        } else if (isSwitch == true) {
            isSwitch = false;
            System.out.println("The mixer is turned Off");
        }
        System.out.println("End of onOrOff");

        return isSwitch;
    }

    public static void increaseSpeed() {
        System.out.println("Start of increase speed");
        if (isSwitch == true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed += 1;
                System.out.println("The current speed is " + currentSpeed);
            } else {
                System.out.println("Maximum speed reached");
            }
        } else {
            System.out.println("First turn on the mixer");
        }
    }

    public static void decreaseSpeed() {
        System.out.println("Start of decrease speed");
        if (isSwitch == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed -= 1;
                System.out.println("The current speed is " + currentSpeed);
            } else {
                System.out.println("Minimum speed reached");
            }
        } else {
            System.out.println("First turn on the mixer");
        }
    }
}
