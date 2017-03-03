package fr.epsi.poe.hardis.tu;

/**
 * @author Yannis Mazzer <yannis@ioweb.fr>
 * @created_on 28/02/2017
 */
public class Restaurant {

    private String name;
    private String address;
    private String zipCode;
    private String phone;
    private boolean open = true;

    public Restaurant() {

    }

    public Restaurant(boolean open) {
        this.open = open;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        assert(phone != null && !"".equals(phone) && phone.startsWith("+33"));

        this.phone = phone;

    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
