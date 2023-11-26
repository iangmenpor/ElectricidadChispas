public class Services {
    private String code;
    private String name;
    private double price;
    private double iva;



    public Services(String code, String name, double price, double iva){
        this.code=code;
        this.name=name;
        this.price=price;
        this.iva=iva;
    }

    @Override
    public String toString() {
        return "Servicio | " + code + " | " + name + " | " + price + " | " + iva;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}
