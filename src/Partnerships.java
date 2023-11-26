public class Partnerships extends Client {

    public String cif;

    public Partnerships(String code, String name, String cif, String mailingAddress, String population, String province, String email, String phoneNumber) {
        super(code, name, mailingAddress, population, province, email, phoneNumber);
        this.cif=cif;
    }

    @Override
    public String toString() {
        return  cif + " | " + name + " | " + mailingAddress + " | " + population + " | " + province + " | " + email + " | " + phoneNumber;

    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
