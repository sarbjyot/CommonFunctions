package sarbjyot.android.commonfunctionslib.Model.Platform;

/**
 * Created by Desk71 on 2/5/2018.
 */

public class ContactSettings {

    private String country_calling_code = "";
    private String partner_support_phone_number = "";
    private String user_support_phone_number = "";
    private String email = "";
    private String address = "";

    public String getCountry_calling_code() {
        return country_calling_code;
    }

    public void setCountry_calling_code(String country_calling_code) {
        this.country_calling_code = country_calling_code;
    }

    public String getPartner_support_phone_number() {
        return partner_support_phone_number;
    }

    public void setPartner_support_phone_number(String partner_support_phone_number) {
        this.partner_support_phone_number = partner_support_phone_number;
    }

    public String getUser_support_phone_number() {
        return user_support_phone_number;
    }

    public void setUser_support_phone_number(String user_support_phone_number) {
        this.user_support_phone_number = user_support_phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
