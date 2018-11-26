package sarbjyot.android.commonfunctionslib.Model.Catalog;

import java.util.List;

/**
 * Created by Desk71 on 11/29/2017.
 */

public class ItemVariations {

    private List<ItemSize> sizes;
    private List<ItemVariationCategory> categories;


    public List<ItemSize> getSizes() {
        return sizes;
    }

    public void setSizes(List<ItemSize> sizes) {
        this.sizes = sizes;
    }

    public List<ItemVariationCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<ItemVariationCategory> categories) {
        this.categories = categories;
    }
}
