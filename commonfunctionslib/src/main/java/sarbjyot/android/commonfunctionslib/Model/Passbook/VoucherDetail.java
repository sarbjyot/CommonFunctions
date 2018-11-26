package sarbjyot.android.commonfunctionslib.Model.Passbook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Desk71 on 2018-10-11.
 */

public class VoucherDetail {

    private List<OrderVoucherEntries> order_voucher_entries = new ArrayList<>();

    public List<OrderVoucherEntries> getOrder_voucher_entries() {
        return order_voucher_entries;
    }

    public void setOrder_voucher_entries(List<OrderVoucherEntries> order_voucher_entries) {
        this.order_voucher_entries = order_voucher_entries;
    }
}
