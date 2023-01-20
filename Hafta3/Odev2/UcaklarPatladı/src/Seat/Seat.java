package Seat;

import java.util.HashMap;
import Seat.SeatType;
public class Seat {
    private SeatType _type; //uçuş tipi
    private HashMap<String,Boolean> _seatList; //koltuk listesi ve boş/dolu durumu
    public Seat() {
    }
    public Seat(SeatType _type, HashMap<String, Boolean> _seatList) {
        this._type = _type;
        this._seatList = _seatList;
    }

    public SeatType get_type() {
        return _type;
    }
    public void set_type(SeatType _type) {
        this._type = _type;
    }
    public HashMap<String, Boolean> get_seatList() {
        return _seatList;
    }
    public void set_seatList(HashMap<String, Boolean> _seatList) {
        _seatList.put("A1",false);
        _seatList.put("A2",true);
        _seatList.put("A3",true);
        _seatList.put("B1",true);
        _seatList.put("B2",false);
        _seatList.put("B3",false);
        this._seatList = _seatList;
    }

}
