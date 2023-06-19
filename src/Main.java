
public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        client.setName("Genri Ford");
        client.setAge(16);
        client.setAddress(" Fabrica 45");


        Postman postman = new Postman();
        postman.setName("Nikola Tesla");
        postman.setAge(17);
        postman.setPrice("20 usa");



       client.setPrice_postman(postman.getPrice());
        postman.setAdress_client(client.getAddress());
        System.out.println(client);
        System.out.println( postman);
    }
}