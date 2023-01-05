package User.Concrete;

import Car.Abstract.AbstractBaseCar;
import Car.Abstract.ICalculate;
import Car.Concrete.HatcBackCar;
import Car.Concrete.SedanCar;
import Car.Concrete.SuvCar;
import User.Abstract.ICompany;

public class Company  extends AbstractBaseCar implements ICompany, ICalculate {
    @Override
    public void rentACarSedan() {

    }

    @Override
    public void rentACarSuv() {

    }

    @Override
    public void rentACarHatchBack() {

    }

    @Override
    public double Calculate(int day, double fee) {
       return day*fee;
    }
}
