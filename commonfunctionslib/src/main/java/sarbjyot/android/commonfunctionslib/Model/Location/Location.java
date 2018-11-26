package sarbjyot.android.commonfunctionslib.Model.Location;

/**
 * Created by Desk71 on 1/30/2018.
 */

public class Location {

    private double latitude = 0;
    private double longitude = 0;
    private String name = "";

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
