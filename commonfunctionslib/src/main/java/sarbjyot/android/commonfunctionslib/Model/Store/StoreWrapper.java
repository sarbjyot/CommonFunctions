package sarbjyot.android.commonfunctionslib.Model.Store;


import java.util.List;

import tech.imbibe.mart.android.app.user.MVC.Model.Catalog.CatalogItem;


/**
 * Created by Desk71 on 11/23/2017.
 */

public class StoreWrapper {
    private Store store = new Store();
    private List<StoreCatalog> store_catalogs;
    private List<StoreCatalogSection> store_catalog_sections;
    private List<CatalogItem> store_catalog_items;

    private List<Condimment> condiments;
    private List<TipPercentage> tip_pcts;
    private List<PlatformDeal> platform_deals;

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public List<StoreCatalog> getStore_catalogs() {
        return store_catalogs;
    }

    public void setStore_catalogs(List<StoreCatalog> store_catalogs) {
        this.store_catalogs = store_catalogs;
    }

    public List<StoreCatalogSection> getStore_catalog_sections() {
        return store_catalog_sections;
    }

    public void setStore_catalog_sections(List<StoreCatalogSection> store_catalog_sections) {
        this.store_catalog_sections = store_catalog_sections;
    }

    public List<CatalogItem> getStore_catalog_items() {
        return store_catalog_items;
    }

    public void setStore_catalog_items(List<CatalogItem> store_catalog_items) {
        this.store_catalog_items = store_catalog_items;
    }

    public List<Condimment> getCondiments() {
        return condiments;
    }

    public void setCondiments(List<Condimment> condiments) {
        this.condiments = condiments;
    }

    public List<TipPercentage> getTip_pcts() {
        return tip_pcts;
    }

    public void setTip_pcts(List<TipPercentage> tip_pcts) {
        this.tip_pcts = tip_pcts;
    }

    public List<PlatformDeal> getPlatform_deals() {
        return platform_deals;
    }

    public void setPlatform_deals(List<PlatformDeal> platform_deals) {
        this.platform_deals = platform_deals;
    }
}
