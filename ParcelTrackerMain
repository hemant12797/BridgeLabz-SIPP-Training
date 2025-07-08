class ParcelStage {
    String stage;
    ParcelStage next;

    ParcelStage(String stage) {
        this.stage = stage;
        this.next = null;
    }
}

class ParcelTracker {
    private ParcelStage head;

    public void addStage(String stage) {
        ParcelStage newStage = new ParcelStage(stage);
        if (head == null) {
            head = newStage;
            return;
        }
        ParcelStage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
    }

    public void insertCheckpoint(String afterStage, String checkpoint) {
        ParcelStage temp = head;
        while (temp != null && !temp.stage.equals(afterStage)) {
            temp = temp.next;
        }
        if (temp != null) {
            ParcelStage newStage = new ParcelStage(checkpoint);
            newStage.next = temp.next;
            temp.next = newStage;
        }
    }

    public void markAsLost(String stageName) {
        ParcelStage temp = head;
        while (temp != null) {
            if (temp.stage.equals(stageName)) {
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
    }

    public void trackParcel() {
        ParcelStage temp = head;
        while (temp != null) {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

public class ParcelTrackerMain {
    public static void main(String[] args) {
        ParcelTracker tracker = new ParcelTracker();
        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        tracker.insertCheckpoint("Shipped", "Custom Checkpoint A");

        tracker.markAsLost("In Transit");

        tracker.trackParcel();
    }
}
