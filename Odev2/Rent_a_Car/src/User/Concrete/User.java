package User.Concrete;

import Car.Abstract.AbstractBaseCar;
import User.Abstract.IUser;

public class User extends AbstractBaseCar implements IUser {


    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public boolean isRegister() {
        return false;
    }

    @Override
    public void rentACarHatchBack() {

    }
}
