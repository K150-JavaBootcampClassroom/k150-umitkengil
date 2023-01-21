import java.util.HashMap;

public class Seat {
    private HashMap<String,Boolean> seatList;
    {
        seatList = new HashMap<>();
        seatList.put("A1",true);
        seatList.put("A2",false);
        seatList.put("A3",true);
        seatList.put("B1",false);
        seatList.put("B2",false);
        seatList.put("B3",true);
    }

    public HashMap<String, Boolean> getSeatList() {
        return seatList;
    }
    public void setSeatList(HashMap<String, Boolean> seatList) {
        this.seatList = seatList;
    }

    public void emptySeat(){
        seatList.forEach((key,value)->{
            if(value==true){
                System.out.println("Boş Koltukar"+key);
            }
        });
    }
}
