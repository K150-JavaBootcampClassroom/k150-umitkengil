package Airlines.Concrete;

public class Company {
    private String _companyName;

    public Company() {
    }
    public Company(String _companyName) {
        this._companyName = _companyName;
    }

    public String get_companyName() {
        return _companyName;
    }

    public void set_companyName(String _companyName) {
        this._companyName = _companyName;
    }
}

