public class Person {
    private final String firstName;
    private final String lastName;
    private final String passportData;
    private MyDate reservationStart;
    private MyDate reservationEnd;
    private int room;

    public Person(String firstName, String lastName, String passportData, int room, MyDate reservationStart, MyDate reservationEnd) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportData = passportData;
        this.room = room;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPassportData() {
        return passportData;
    }

    public MyDate getReservationStart() {
        return reservationStart;
    }
    public void setReservationStart(MyDate reservationStart) {
        this.reservationStart = reservationStart;
    }
    public MyDate getReservationEnd() {
        return reservationEnd;
    }
    public void setReservationEnd(MyDate reservationEnd) {
        this.reservationEnd = reservationEnd;
    }

    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return String.format("Room '%d'  %s %s, Passport: %s, Reservation: %s -> %s",
                room, firstName, lastName, passportData,
                reservationStart, reservationEnd);
    }
}
