package sarbjyot.android.commonfunctionslib.Model.Cart;

import tech.imbibe.mart.android.app.user.MVC.Model.Order.OrderDetail;
import tech.imbibe.mart.android.app.user.MVC.Model.Store.SearchParams;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class Cart {
    private SearchParams search_params;
    private OrderDetail order_details;

    public SearchParams getSearch_params() {
        return search_params;
    }

    public void setSearch_params(SearchParams search_params) {
        this.search_params = search_params;
    }

    public OrderDetail getOrder_details() {
        return order_details;
    }

    public void setOrder_details(OrderDetail order_details) {
        this.order_details = order_details;
    }
}
