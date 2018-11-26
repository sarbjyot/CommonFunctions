package sarbjyot.android.commonfunctionslib.Model.Platform;

/**
 * Created by Desk71 on 2/5/2018.
 */

public class PlatformSettings {

    private GeneralSettings general_settings;
    private LabelSettings label_settings;
    private ContactSettings contact_settings;
    private PlatformGoogleSettings platform_google_settings;
    private OrderSettings order_settings;
    private PaymentSettings payment_settings;
    private DerivedSettings derived_settings;
    private ApiSetting api_settings;
    private FacebookSettings facebook_settings;
    private GoogleSettings google_settings;
    private RazorpaySettings razorpay_settings;
    private PaytmSettings paytm_settings;


    public GeneralSettings getGeneral_settings() {
        return general_settings;
    }

    public void setGeneral_settings(GeneralSettings general_settings) {
        this.general_settings = general_settings;
    }

    public LabelSettings getLabel_settings() {
        return label_settings;
    }

    public void setLabel_settings(LabelSettings label_settings) {
        this.label_settings = label_settings;
    }

    public ContactSettings getContact_settings() {
        return contact_settings;
    }

    public void setContact_settings(ContactSettings contact_settings) {
        this.contact_settings = contact_settings;
    }

    public PlatformGoogleSettings getPlatform_google_settings() {
        return platform_google_settings;
    }

    public void setPlatform_google_settings(PlatformGoogleSettings platform_google_settings) {
        this.platform_google_settings = platform_google_settings;
    }

    public OrderSettings getOrder_settings() {
        return order_settings;
    }

    public void setOrder_settings(OrderSettings order_settings) {
        this.order_settings = order_settings;
    }

    public PaymentSettings getPayment_settings() {
        return payment_settings;
    }

    public void setPayment_settings(PaymentSettings payment_settings) {
        this.payment_settings = payment_settings;
    }

    public DerivedSettings getDerived_settings() {
        return derived_settings;
    }

    public void setDerived_settings(DerivedSettings derived_settings) {
        this.derived_settings = derived_settings;
    }

    public ApiSetting getApi_settings() {
        return api_settings;
    }

    public void setApi_settings(ApiSetting api_settings) {
        this.api_settings = api_settings;
    }

    public FacebookSettings getFacebook_settings() {
        return facebook_settings;
    }

    public void setFacebook_settings(FacebookSettings facebook_settings) {
        this.facebook_settings = facebook_settings;
    }

    public GoogleSettings getGoogle_settings() {
        return google_settings;
    }

    public void setGoogle_settings(GoogleSettings google_settings) {
        this.google_settings = google_settings;
    }

    public RazorpaySettings getRazorpay_settings() {
        return razorpay_settings;
    }

    public void setRazorpay_settings(RazorpaySettings razorpay_settings) {
        this.razorpay_settings = razorpay_settings;
    }

    public PaytmSettings getPaytm_settings() {
        return paytm_settings;
    }

    public void setPaytm_settings(PaytmSettings paytm_settings) {
        this.paytm_settings = paytm_settings;
    }
}
