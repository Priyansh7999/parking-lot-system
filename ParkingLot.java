import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Floor> floors = new ArrayList<>();

    public void addFloor(Floor floor) {
        floors.add(floor);
    }
}
