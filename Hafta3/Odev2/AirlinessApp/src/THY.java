public class THY implements ITicketPrice{
    @Override
    public double TicketPrice(FlyType flyType, SeatType seatType) {
        if(flyType==FlyType.YurtDışı){
            System.out.println("Yurtdışı Seçildi");
            System.out.println("Bilet Türünü Seçiniz");
            if(seatType == SeatType.Economy){
                return 60.000;
            } else if (seatType == SeatType.Business) {
                return 150.000;
            }
            else
                System.out.println("Hatalı Seçim--Çıkış Yapıldı");
        }
        else if (flyType==FlyType.Yurtiçi) {
            System.out.println("Yurtiçi Seçildi");
            System.out.println("Bilet Türünü Seçiniz");
            if(seatType == SeatType.Economy){
                return 5000;
            } else if (seatType == SeatType.Business) {
                return 50000;
            }
        }
        return 0;
    }
}
