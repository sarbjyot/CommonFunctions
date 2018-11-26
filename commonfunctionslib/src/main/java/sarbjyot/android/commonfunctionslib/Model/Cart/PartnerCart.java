package sarbjyot.android.commonfunctionslib.Model.Cart;

import sarbjyot.android.commonfunctionslib.Model.Order.PartnerOrderDetail;
import sarbjyot.android.commonfunctionslib.Model.Store.SearchParams;



/**
 * Created by Desk71 on 11/17/2017.
 */

public class PartnerCart {
    private SearchParams search_params;
    private PartnerOrderDetail order_details;

    public SearchParams getSearch_params() {
        return search_params;
    }

    public void setSearch_params(SearchParams search_params) {
        this.search_params = search_params;
    }

    public PartnerOrderDetail getOrder_details() {
        return order_details;
    }

    public void setOrder_details(PartnerOrderDetail order_details) {
        this.order_details = order_details;
    }
}
