public class Person_Link {

    private String name;
    private String nationality;
    private String dob;
    private int seatNumber;

    private Boolean accepted;

    public Person_Link(String name, String nationality, String dob, int seatNumber, Boolean accepted) {
        this.name = name;
        this.nationality = nationality;
        this.dob = dob;
        this.seatNumber = seatNumber;
        this.accepted = accepted;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public static Boolean applyPassport() {
        int number = (int) (Math.random() * 2);
        if (number == 1) {
            return true;
        } else if (number == 2) {
            return false;
        } else {
            return null;
        }
    }

    public static int chooseSeat() {
        int seat = (int) (Math.random() * (11 + 1));
        return seat;
    }

}

