package sarbjyot.android.commonfunctionslib.Model.Location;

/**
 * Created by Desk71 on 2018-07-27.
 */

public class FeaturedArea {

    private String address = "";
    private String image_url = "";
    private String name = "";
    private double latitude = 0.0;
    private double longitude = 0.0;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
