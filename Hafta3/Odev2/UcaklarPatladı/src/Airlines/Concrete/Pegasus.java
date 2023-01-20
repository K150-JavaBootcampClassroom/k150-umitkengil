package Airlines.Concrete;

import Airlines.Abstract.IPegasus;
import Seat.Seat;
import Seat.SeatType;
public class Pegasus extends Company implements IPegasus {
    public Pegasus() {}
    public Pegasus(String _companyName) {
        super("Pegasus");
    }

}
