package Airlines.Abstract;

import Seat.Seat;
import Seat.SeatType;
public interface ICalculate {
    public double EconomyTicket(Seat seat);
    public double BusinessTicket(Seat seat);
}
