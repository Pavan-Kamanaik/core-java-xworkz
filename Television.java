class Television {
    static boolean isOn;
    static int minVolume = 0;
    static int maxVolume = 100;
    static int currentVolume = 50;
    static int minChannel = 100;
    static int maxChannel = 999;
    static int currentChannel = 508;;

    public static boolean onOrOff() {
        System.out.println("Invoked onOrOff");
        if (isOn == false) {
            isOn = true;
            System.out.println("The television is turned On. Enjoy your shows!" + isOn);
        } else if (isOn == true) {
            isOn = false;
            System.out.println("The television is turned Off");
        }
        System.out.println("End of onOrOff");

        return isOn;
    }

    public static void increaseVolume() {
        System.out.println("Start of increase volume");
        if (isOn == true) {
            if (currentVolume < maxVolume) {
                currentVolume += 1;
                System.out.println("The current volume is " + currentVolume);
            } else {
                System.out.println("Maximum volume reached");
            }
        } else {
            System.out.println("First turn on the television");
        }
    }

    public static void decreaseVolume() {
        System.out.println("Start of decrease volume");
        if (isOn == true) {
            if (currentVolume > minVolume) {
                currentVolume -= 1;
                System.out.println("The current volume is " + currentVolume);
            } else {
                System.out.println("Minimum volume reached");
            }
        } else {
            System.out.println("First turn on the television");
        }
    }

    public static void increaseChannel() {
        System.out.println("Start of Increase channel");
        if (isOn == true) {
            if (currentChannel < maxChannel) {
                currentChannel += 1;
                System.out.println("The current channel is " + currentChannel);
            } else {
                System.out.println("Maximum channel reached");
            }
        } else {
            System.out.println("First turn on the television");
        }
    }

    public static void decreaseChannel() {
        System.out.println("Start of decrease channel");
        if (isOn == true) {
            if (currentChannel > minChannel) {
                currentChannel -= 1;
                System.out.println("The current channel is " + currentChannel);
            } else {
                System.out.println("minimum channel reached");
            }
        } else {
            System.out.println("First turn on the television");
        }
    }
}
