import java.util.ArrayList;
import java.util.List;

public class SmartLock {

    private boolean locked = true;
    // List of device identifiers that are allowed to unlock
    private List<String> whitelist = new ArrayList<>();

    public SmartLock() {
    }

    public SmartLock(boolean locked, List<String> whitelist) {
        this.locked = locked;
        this.whitelist = whitelist;
    }

    public boolean isLocked() {
        return locked;
    }

    public void addToWhitelist(String device) {
        this.whitelist.add(device);
    }

    public void attemptUnlock(String device) {

        boolean result = true;

        for (String s : this.whitelist) {
            if (s.equals(device)) {
                result = false;
                break;
            }
        }

        this.locked = result;

    }

}
