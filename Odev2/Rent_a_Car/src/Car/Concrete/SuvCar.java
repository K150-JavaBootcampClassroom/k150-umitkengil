package Car.Concrete;

import Car.Abstract.AbstractBaseCar;
import Car.Abstract.ICalculate;
import Car.Abstract.ISuvCar;

public class SuvCar extends AbstractBaseCar implements ISuvCar,ICalculate {
    @Override
    public double Calculate(int day,double fee) {
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
