package sarbjyot.android.commonfunctionslib.Model.Store;

/**
 * Created by Desk71 on 3/26/2018.
 */

public class StoreRating {

    private String user_name;
    private int user_rating;
    private String user_rating_comments;
    private String user_rating_time;
    private RatingDerivedFields derived_fields;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_rating() {
        return user_rating;
    }

    public void setUser_rating(int user_rating) {
        this.user_rating = user_rating;
    }

    public String getUser_rating_comments() {
        return user_rating_comments;
    }

    public void setUser_rating_comments(String user_rating_comments) {
        this.user_rating_comments = user_rating_comments;
    }

    public String getUser_rating_time() {
        return user_rating_time;
    }

    public void setUser_rating_time(String user_rating_time) {
        this.user_rating_time = user_rating_time;
    }

    public RatingDerivedFields getDerived_fields() {
        return derived_fields;
    }

    public void setDerived_fields(RatingDerivedFields derived_fields) {
        this.derived_fields = derived_fields;
    }
}
