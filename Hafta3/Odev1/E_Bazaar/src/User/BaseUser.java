package User;

public class BaseUser {
    private String name; //kullanıcı adı -
    private String role; // kullanıcı rolü

    /*
    * Bunlara ait getter&setter metotları
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
