public class Postman extends Person{
    private  String adress_client;
    private  String price;

    public Postman() {
    }

    public Postman(String name, int age, String adress_client, String price) {
        super(name, age);
        this.adress_client = adress_client;
        this.price = price;
    }

    public String getAdress_client() {
        return adress_client;
    }

    public void setAdress_client(String adress_client) {
        this.adress_client = adress_client;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Postman{" +
                "adress_client='" + adress_client + '\'' +
                ", price='" + price + '\'' + super.toString();
    }
}
