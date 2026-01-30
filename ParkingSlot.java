import java.util.UUID;

public class ParkingSlot {

    private final String id;
    private final SlotType type;
    private boolean occupied;
    

    public ParkingSlot(SlotType type) {
        this.id = UUID.randomUUID().toString();
        this.type = type;
        this.occupied = false;
    }

    public String getId() {
        return id;
    }

    public SlotType getType() {
        return type;
    }

    public boolean isOccupied() {
        return occupied;
    }

    
}
