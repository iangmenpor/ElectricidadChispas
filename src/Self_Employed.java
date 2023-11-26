public class Self_Employed extends Client {

    public String surname;

    public String dni;

    public Self_Employed(String code, String name, String surname, String dni, String mailingAddress, String population, String province, String email, String phoneNumber) {
        super(code, name, mailingAddress, population, province, email, phoneNumber);
        this.surname=surname;
        this.dni=dni;

    }

    @Override
    public String toString() {
        return  dni + " | " + name + " | " + mailingAddress + " | " + population + " | " + province + " | " + email + " | " + phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
