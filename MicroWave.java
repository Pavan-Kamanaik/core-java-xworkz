class MicroWave {
    static boolean isOn;
    static int currentPowerLevel = 10;
    static int minPowerLevel = 0;
    static int maxPowerLevel = 35;

    public static boolean onOrOff() {
        System.out.println("Invoked onOrOff");
        if (isOn == false) {
            isOn = true;
            System.out.println("The microwave is turned On. Ready to heat!");
        } else if (isOn == true) {
            isOn = false;
            System.out.println("The microwave is turned Off");
        }
        System.out.println("End of onOrOff");

        return isOn;
    }

    public static void increasePowerLevel() {
        System.out.println("Start of increase power level");
        if (isOn == true) {
            if (currentPowerLevel < maxPowerLevel) {
                currentPowerLevel += 1;
                System.out.println("The current power level is " + currentPowerLevel);
            } else {
                System.out.println("Maximum power level reached");
            }
        } else {
            System.out.println("First turn on the microwave");
        }
    }

    public static void decreasePowerLevel() {
        System.out.println("Start of decrease power level");
        if (isOn == true) {
            if (currentPowerLevel > minPowerLevel) {
                currentPowerLevel -= 1;
                System.out.println("The current power level is " + currentPowerLevel);
            } else {
                System.out.println("Minimum power level reached");
            }
        } else {
            System.out.println("First turn on the microwave");
        }
    }
}
