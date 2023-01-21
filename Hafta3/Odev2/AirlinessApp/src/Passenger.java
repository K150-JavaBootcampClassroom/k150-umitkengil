public class Passenger {
    private String firstName;
    private String lastName;
    private Seat seat;
    public Seat getSeat() {
        return seat;
    }
    public void setSeat(Seat seat) {
        this.seat = seat;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName;
    }

    public void showEmptySeat(){
        seat.emptySeat();
    }

}
