package Car.Abstract;

public abstract class AbstractBaseCar{
    private double daily_or_monthly_fee; // günlük yada aylık ücret
    private double car_trunk; // araba bagajı - (hacim/litre)
    private String color;// araba rengi
    private int day; // gün
    public AbstractBaseCar(){}
    public AbstractBaseCar(double daily_or_monthly_fee, double car_trunk, String color, int day) {
        this.daily_or_monthly_fee = daily_or_monthly_fee;
        this.car_trunk = car_trunk;
        this.color = color;
        this.day = day;
    }

    /**
     * Getter - Setter Metotlar aşağıdadır.
     *
     * */
    public double getDaily_or_monthly_fee() { return daily_or_monthly_fee; }

    public void setDaily_or_monthly_fee(double daily_or_monthly_fee) {
        this.daily_or_monthly_fee = daily_or_monthly_fee;
    }
    public double getCar_trunk() {
        return car_trunk;
    }
    public void setCar_trunk(double car_trunk) {
        this.car_trunk = car_trunk;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getDay() { return day; }
    public void setDay(int day) { this.day = day; }

}
