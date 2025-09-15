public class BuddyInfo {

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    private String name;

    public String getAddress() {
        return address;
    }

    private String address;

    public String getNumber() {
        return number;
    }

    private String number;

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Homer", "123 aaa", "1234567");
        System.out.println("Hello " + buddy1.getName());
    }
}





