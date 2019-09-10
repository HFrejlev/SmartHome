public class Main {
    public static void main(String[] args) {
        SmartLock frontDoorLock = new SmartLock();
        String device = "OnePlus5";
        System.out.println("Is the front door locked?: " + frontDoorLock.isLocked());
        System.out.println("Let's try unlocking it with our " + device + ".");
        frontDoorLock.attemptUnlock(device);
        System.out.println("Is the front door locked now?: " + frontDoorLock.isLocked());
        System.out.println("Let's add our " + device + " to the whitelist.");
        frontDoorLock.addToWhitelist(device);
        System.out.println("Let's try unlocking again.");
        frontDoorLock.attemptUnlock(device);
        System.out.println("Is the front door locked now?: " + frontDoorLock.isLocked());
    }
}
