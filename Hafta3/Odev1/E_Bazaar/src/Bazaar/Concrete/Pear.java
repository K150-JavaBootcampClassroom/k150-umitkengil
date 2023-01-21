package Bazaar.Concrete;

import Bazaar.Abstract.ICalculate;
import Bazaar.Abstract.IPear;

public class Pear implements IPear, ICalculate {

    @Override
    public double kg(double kgCalc) {
        return 0;
    } // kaç kilo armut

    @Override
    public double stock(double stock) {
        return 0;
    } //alım sonrası armut deposunu güncelle
}
