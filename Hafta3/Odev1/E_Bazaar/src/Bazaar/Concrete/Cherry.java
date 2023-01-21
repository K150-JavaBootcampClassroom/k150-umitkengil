package Bazaar.Concrete;

import Bazaar.Abstract.ICalculate;
import Bazaar.Abstract.ICherry;

public class Cherry implements ICherry, ICalculate {

    @Override
    public double kg(double kgCalc) {
        return 0;
    } // kirazdan kaç kg alınacak

    @Override
    public double stock(double stock) { // alım sonrası güncel kiraz deposu
        return 0;
    }

}
