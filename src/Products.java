public class Products {
    private String code;
    private String name;
    private String brand;
    private String model;
    private double price;
    private double iva;

    //-Constructor
    public Products (String code, String name, String brand, String model, double price, double iva) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.iva = iva;
    }

    @Override
    public String toString() {
            return "Producto | " + code + " | " + name + " | " +brand + " | " + model + " | "+ price + " | " + iva;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
