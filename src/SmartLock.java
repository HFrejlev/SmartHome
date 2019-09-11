import java.util.ArrayList;
import java.util.List;

public class SmartLock {

    // Locked state (true = locked, false = unlocked)
    private boolean locked = true;
    // List of device identifiers that are allowed to unlock
    private List<String> whitelist = new ArrayList<>();

    public SmartLock() {
    }

    public SmartLock(boolean locked, List<String> whitelist) {
        this.locked = locked;
        this.whitelist = whitelist;
    }

    // Check if the lock is locked or not.
    public boolean isLocked() {
        return locked;
    }

    // Add a device identifier to the whitelist.
    public void addToWhitelist(String device) {
        this.whitelist.add(device);
    }

    // Attempt to unlock with the passed in device identifier.
    // Unlock if the identifier is found in the whitelist, lock if it isn't.
    public void attemptUnlock(String device) {

        boolean result = true;

        // Iterate through identifier strings in the whitelist.
        // Break the loop and set locked state to false when the identifier is found.
        for (String s : this.whitelist) {
            if (s.equals(device)) {
                result = false;
                break;
            }
        }

        this.locked = result;

    }

}
