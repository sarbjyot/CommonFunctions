package sarbjyot.android.commonfunctionslib.Model.Platform;

/**
 * Created by Desk71 on 2/9/2018.
 */

public class DerivedSettings {

    private String currency_symbol = "";
    private String site_name = "";
    private String site_slogan = "";
    private String logo_url = "";
    private String logo_url_absolute = "";

    public String getCurrency_symbol() {
        return currency_symbol;
    }

    public void setCurrency_symbol(String currency_symbol) {
        this.currency_symbol = currency_symbol;
    }

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getSite_slogan() {
        return site_slogan;
    }

    public void setSite_slogan(String site_slogan) {
        this.site_slogan = site_slogan;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    public String getLogo_url_absolute() {
        return logo_url_absolute;
    }

    public void setLogo_url_absolute(String logo_url_absolute) {
        this.logo_url_absolute = logo_url_absolute;
    }
}

