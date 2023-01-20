package Passenger;

public class Passenger {
    private String _firstName;
    private String _lastName;

    public Passenger() {
    }

    public Passenger(String _firstName, String _lastName) {
        this._firstName = _firstName;
        this._lastName = _lastName;
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    @Override
    public String toString() {
        return _firstName +" "+ _lastName;
    }
}
