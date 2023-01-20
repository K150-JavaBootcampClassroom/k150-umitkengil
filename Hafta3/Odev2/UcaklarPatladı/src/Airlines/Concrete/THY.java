package Airlines.Concrete;

import Airlines.Abstract.ICalculate;
import Airlines.Abstract.IThy;
import Seat.Seat;
import Seat.SeatType;
public class THY extends Company implements ICalculate,IThy {
    public THY() {
    }

    public THY(String _companyName) {
        super("THY");
    }

    @Override
    public double EconomyTicket(Seat seat) {
        return 0;
    }

    @Override
    public double BusinessTicket(Seat seat) {
        return 0;
    }
}
