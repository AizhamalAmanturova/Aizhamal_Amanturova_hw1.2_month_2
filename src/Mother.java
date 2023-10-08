public class Mother {
    private int year;
    private String name;
    private String address;

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public Mother(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public String getInfo() {
        return "Year: " + year +
                "\nName: " + name +
                "\nAddress: " + address;
    }


}
