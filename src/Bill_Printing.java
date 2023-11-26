import java.util.ArrayList;

public class Bill_Printing {

    /*Esta clase es lo mismo que "InvoicePrinter", le puse un nombre diferente que significa lo mismo*/

    private Client client;
    private Bill bill;
    private ArrayList<Services> services;
    private ArrayList<Products> products;




    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public ArrayList<Services> getServices() {
        return services;
    }

    public void setServices(ArrayList<Services> services) {
        this.services = services;
    }

    public ArrayList<Products> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Products> products) {
        this.products = products;
    }

    public void print(Bill_Printing bill_printing){
    }
}
