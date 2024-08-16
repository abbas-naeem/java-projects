public class Workbook74 {
    public static void main(String[] args) {
        Workbook74_Link rayan = new Workbook74_Link("Rayan Slim", "Canadian", "01/01/1998", 3);
        Workbook74_Link twin = rayan;

        twin.setName("Jad Slim");
        twin.setSeatNumber(32);
    }
}
