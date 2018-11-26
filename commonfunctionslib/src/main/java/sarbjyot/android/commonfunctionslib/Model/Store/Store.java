package sarbjyot.android.commonfunctionslib.Model.Store;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class Store implements Serializable {

    private int store_id = 0;
    private String owner_user_id ;
    private int status = 0;
    private String name;
    private String phone_number;
    private String fax_number;
    private String email;
    private String address_line1;
    private String address_line2;
    private String city;
    private String state;
    private String postal_code;
    private String country;
    private double latitude = 0;
    private double longitude = 0;
    private String about_summary;
    private String about_detailed;
    private String speciality;
    private OrderTypeSettings order_types;
    private String timings;
    private int delivery_area_type = 0;
    private double delivery_radius = 0.0;
    private UserPaymentSettings user_payment_settings;
    private PlatformSetting platform_settings = null;
    private List<StoreDeal> deals = null;
    private double tax_pct = 0;
    private float user_rating_count = 0;
    private float user_rating_total = 0;
    private int is_test = 0;
    private StoreDerivedFields derived_fields;
    private boolean isOpen = false;
    private String formatted_address;
    private String image_url = null;
    private double distance = 0;

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getOwner_user_id() {
        return owner_user_id;
    }

    public void setOwner_user_id(String owner_user_id) {
        this.owner_user_id = owner_user_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getFax_number() {
        return fax_number;
    }

    public void setFax_number(String fax_number) {
        this.fax_number = fax_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getAbout_summary() {
        return about_summary;
    }

    public void setAbout_summary(String about_summary) {
        this.about_summary = about_summary;
    }

    public String getAbout_detailed() {
        return about_detailed;
    }

    public void setAbout_detailed(String about_detailed) {
        this.about_detailed = about_detailed;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public OrderTypeSettings getOrder_types() {
        return order_types;
    }

    public void setOrder_types(OrderTypeSettings order_types) {
        this.order_types = order_types;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public int getDelivery_area_type() {
        return delivery_area_type;
    }

    public void setDelivery_area_type(int delivery_area_type) {
        this.delivery_area_type = delivery_area_type;
    }

    public double getDelivery_radius() {
        return delivery_radius;
    }

    public void setDelivery_radius(double delivery_radius) {
        this.delivery_radius = delivery_radius;
    }

    public UserPaymentSettings getUser_payment_settings() {
        return user_payment_settings;
    }

    public void setUser_payment_settings(UserPaymentSettings user_payment_settings) {
        this.user_payment_settings = user_payment_settings;
    }

    public PlatformSetting getPlatform_settings() {
        return platform_settings;
    }

    public void setPlatform_settings(PlatformSetting platform_settings) {
        this.platform_settings = platform_settings;
    }

    public List<StoreDeal> getDeals() {
        return deals;
    }

    public void setDeals(List<StoreDeal> deals) {
        this.deals = deals;
    }

    public double getTax_pct() {
        return tax_pct;
    }

    public void setTax_pct(double tax_pct) {
        this.tax_pct = tax_pct;
    }

    public float getUser_rating_count() {
        return user_rating_count;
    }

    public void setUser_rating_count(float user_rating_count) {
        this.user_rating_count = user_rating_count;
    }

    public float getUser_rating_total() {
        return user_rating_total;
    }

    public void setUser_rating_total(float user_rating_total) {
        this.user_rating_total = user_rating_total;
    }

    public int getIs_test() {
        return is_test;
    }

    public void setIs_test(int is_test) {
        this.is_test = is_test;
    }

    public StoreDerivedFields getDerived_fields() {
        return derived_fields;
    }

    public void setDerived_fields(StoreDerivedFields derived_fields) {
        this.derived_fields = derived_fields;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
