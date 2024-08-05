public class Workbook73_linkData {
    private String name;
    private String nationality;
    private String dob;
    private String passportNumber;
    private int seatNumber;

    public Workbook73_linkData (String name, String nationality, String dob, String passportNumber, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dob = dob;
        this.passportNumber = passportNumber;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDob() {
        return dob;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}