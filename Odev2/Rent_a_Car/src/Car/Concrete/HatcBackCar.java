package Car.Concrete;

import Car.Abstract.AbstractBaseCar;
import Car.Abstract.ICalculate;
import Car.Abstract.IHatcBackCar;

public class HatcBackCar extends AbstractBaseCar implements IHatcBackCar, ICalculate {
    public HatcBackCar() {
        super(); // super() ile AbstractBaseCar classındaki tüm alanları HatcBackCar classına alıyorum
    }
    public HatcBackCar(double daily_or_monthly_fee, double car_trunk, String color, int day){
        super(daily_or_monthly_fee,car_trunk,color,day);
    }

    /*
    *   Getter- Setter Metotları
    * */
    @Override
    public double getDaily_or_monthly_fee() { return super.getDaily_or_monthly_fee(); }
    @Override
    public void setDaily_or_monthly_fee(double daily_or_monthly_fee) {
        super.setDaily_or_monthly_fee(daily_or_monthly_fee);
    }
    @Override
    public double getCar_trunk() { return super.getCar_trunk(); }
    @Override
    public void setCar_trunk(double car_trunk) { super.setCar_trunk(car_trunk); }
    @Override
    public String getColor() { return super.getColor();}
    @Override
    public void setColor(String color) { super.setColor(color);}
    @Override
    public int getDay() { return super.getDay();}
    @Override
    public void setDay(int day) { super.setDay(day);}
    //Getter - Setter metot sonu

    //implemente edilen ICalculate
    @Override
    public double Calculate(int day, double fee) {
        this.setDay(day);
        if(day<1){
            System.out.println("Araç kiralama 1 günden az olamaz");
        } else{
            double calc = day*fee;
            System.out.println("Ödemeniz gereken ücret: ${0}"+calc);
            return calc;
        }
        return fee;
    }
}
