package Bazaar.Concrete;

import Bazaar.Abstract.IApple;
import Bazaar.Abstract.ICalculate;

public class Apple implements IApple, ICalculate {
    @Override
    public double kg(double kgCalc) {
        return 0;
    } // elmadan kaç kilo alınacağını tutar
    @Override
    public double stock(double appStock) {
        return 0;
    } // alım sonrası elma deposu miktarını gösterir
}
