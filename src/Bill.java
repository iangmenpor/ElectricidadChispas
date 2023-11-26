public class Bill {
    private String code;
    private String date;
    private double taxBase;
    private double totalBill;


    public Bill(String code, String date, double taxBase, double totalBill) {
        this.code = code;
        this.date = date;
        this.taxBase = taxBase;
        this.totalBill = totalBill;
    }


    @Override
    public String toString() {
        return getCode()+ " | "+ getDate();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTaxBase() {
        return taxBase;
    }

    public void setTaxBase(double taxBase) {
        this.taxBase = taxBase;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}
