package Models;

public class OpcionesCustomers {

    public String customerID,companyName,contactName,contactTitle,address,country,city,region,postalCode;
    public String phone,lastContactBy,email;


    public OpcionesCustomers(String customerID, String companyName, String contactName, String contactTitle,
                             String address, String country, String city, String region, String postalCode,
                             String phone, String lastContactBy, String email) {

        this.customerID = customerID;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.country = country;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.phone = phone;
        this.lastContactBy = lastContactBy;
        this.email = email;

    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastContactBy() {
        return lastContactBy;
    }

    public String getEmail() {
        return email;
    }

}
