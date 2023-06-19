public class Client extends  Person{
    private  String address;
    private String price_postman;

    public Client() {
    }

    public Client(String name, int  age, String address, String price_postman) {
        super(name, age);
        this.address = address;
        this.price_postman = price_postman;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice_postman() {
        return price_postman;
    }

    public void setPrice_postman(String price) {
        this.price_postman = price;
    }

    @Override
    public String toString() {
        return "Client{" +
                "address='" + address + '\'' +
                ", price_postman='" + price_postman + '\'' + super.toString();
    }
}
