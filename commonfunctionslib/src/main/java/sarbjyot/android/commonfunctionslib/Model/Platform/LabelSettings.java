package sarbjyot.android.commonfunctionslib.Model.Platform;

import android.app.Activity;

import org.atteo.evo.inflector.English;
import org.json.JSONException;

import tech.imbibe.mart.android.app.user.MVC.Controller.CartHelper;

/**
 * Created by Desk71 on 2/5/2018.
 */

public class LabelSettings {

    private String store_label = "";
    private String store_category_label = "";
    private String catalog_label = "";
    private String item_label = "";
    private String item_category_label = "";
    private String cart_label = "";

    public String getStore_label() {
        return store_label;
    }

    public void setStore_label(String store_label) {
        this.store_label = store_label;
    }

    public String getStore_category_label() {
        return store_category_label;
    }

    public void setStore_category_label(String store_category_label) {
        this.store_category_label = store_category_label;
    }

    public String getCatalog_label() {
        return catalog_label;
    }

    public void setCatalog_label(String catalog_label) {
        this.catalog_label = catalog_label;
    }

    public String getItem_label() {
        return item_label;
    }

    public void setItem_label(String item_label) {
        this.item_label = item_label;
    }

    public String getItem_category_label() {
        return item_category_label;
    }

    public void setItem_category_label(String item_category_label) {
        this.item_category_label = item_category_label;
    }

    public String getCart_label() {
        return cart_label;
    }

    public void setCart_label(String cart_label) {
        this.cart_label = cart_label;
    }

    public static String applyStoreLabel(String storeLabel, Activity mActivity) {
        try {
            PlatformSettings platformSetting = CartHelper.getPlatformSetting(mActivity);
            String lable = platformSetting.getLabel_settings().getStore_label();
            storeLabel  =  storeLabel.replace("@Stores", English.plural(lable.substring(0, 1).toUpperCase() + lable.substring(1)));// first letter capital
            storeLabel =  storeLabel.replace("@Store", lable.substring(0, 1).toUpperCase() + lable.substring(1));
            storeLabel =  storeLabel.replace("@stores", English.plural(lable.toLowerCase()));
            storeLabel =  storeLabel.replace("@store", lable.toLowerCase());
           // storeLabel =  storeLabel.replace("@STORES", English.plural(lable.toUpperCase()));
           // storeLabel =  storeLabel.replace("@STORE", lable.toUpperCase());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return (storeLabel);
    }



    public static String applyStoreCategoryLabel(String storeCategoryLabel, Activity mActivity){
        try {
            PlatformSettings platformSetting = CartHelper.getPlatformSetting(mActivity);
            String lable = platformSetting.getLabel_settings().getStore_category_label();
            storeCategoryLabel  =  storeCategoryLabel.replace("@StoreCategories", English.plural(lable.substring(0, 1).toUpperCase() + lable.substring(1)));// first letter capital
            storeCategoryLabel =  storeCategoryLabel.replace("@StoreCategory", lable.substring(0, 1).toUpperCase() + lable.substring(1));
            storeCategoryLabel =  storeCategoryLabel.replace("@storeCategories", English.plural(lable.toLowerCase()));
            storeCategoryLabel =  storeCategoryLabel.replace("@storeCategory", lable.toLowerCase());
            //storeCategoryLabel =  storeCategoryLabel.replace("@STORECATEGORIES", English.plural(lable.toUpperCase()));
           // storeCategoryLabel =  storeCategoryLabel.replace("@STORECATEGORY", lable.toUpperCase());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return (storeCategoryLabel);
    }


    public static String applyCatalogLabel(String catalogLabel, Activity mActivity){
        try {
            PlatformSettings platformSetting = CartHelper.getPlatformSetting(mActivity);
            String lable = platformSetting.getLabel_settings().getCatalog_label();
            catalogLabel  =  catalogLabel.replace("@Catalogs", English.plural(lable.substring(0, 1).toUpperCase() + lable.substring(1)));// first letter capital
            catalogLabel =  catalogLabel.replace("@Catalog", lable.substring(0, 1).toUpperCase() + lable.substring(1));
            catalogLabel =  catalogLabel.replace("@catalogs", English.plural(lable.toLowerCase()));
            catalogLabel =  catalogLabel.replace("@catalog", lable.toLowerCase());
           // catalogLabel =  catalogLabel.replace("@CATALOGS", English.plural(lable.toUpperCase()));
           // catalogLabel =  catalogLabel.replace("@CATALOG", lable.toUpperCase());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return (catalogLabel);
    }


    public static String applyItemLabel(String itemLabel, Activity mActivity){
        try {
            PlatformSettings platformSetting = CartHelper.getPlatformSetting(mActivity);
            String lable = platformSetting.getLabel_settings().getItem_label();
            itemLabel  =  itemLabel.replace("@Items", English.plural(lable.substring(0, 1).toUpperCase() + lable.substring(1)));// first letter capital
            itemLabel =  itemLabel.replace("@Item", lable.substring(0, 1).toUpperCase() + lable.substring(1));
            itemLabel =  itemLabel.replace("@items", English.plural(lable.toLowerCase()));
            itemLabel =  itemLabel.replace("@item", lable.toLowerCase());
           // itemLabel =  itemLabel.replace("@ITEMS", English.plural(lable.toUpperCase()));
           // itemLabel =  itemLabel.replace("@ITEM", lable.toUpperCase());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return (itemLabel);
    }


    public static String applyItemCategoryLabel(String itemCategoryLabel, Activity mActivity){
        try {
            PlatformSettings platformSetting = CartHelper.getPlatformSetting(mActivity);
            String lable = platformSetting.getLabel_settings().getItem_category_label();
            itemCategoryLabel  =  itemCategoryLabel.replace("@ItemCategories", English.plural(lable.substring(0, 1).toUpperCase() + lable.substring(1)));// first letter capital
            itemCategoryLabel =  itemCategoryLabel.replace("@ItemCategorie", lable.substring(0, 1).toUpperCase() + lable.substring(1));
            itemCategoryLabel =  itemCategoryLabel.replace("@itemCategories", English.plural(lable.toLowerCase()));
            itemCategoryLabel =  itemCategoryLabel.replace("@itemCategorie", lable.toLowerCase());
            //itemCategoryLabel =  itemCategoryLabel.replace("@ITEMCATEGORIES", English.plural(lable.toUpperCase()));
           // itemCategoryLabel =  itemCategoryLabel.replace("@ITEMCATEGORIE", lable.toUpperCase());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return (itemCategoryLabel);
    }


    public static String applyCartLabel(String cartlabel, Activity mActivity){
        try {
            PlatformSettings platformSetting = CartHelper.getPlatformSetting(mActivity);
            String lable = platformSetting.getLabel_settings().getCart_label();
            cartlabel  =  cartlabel.replace("@CartLabels", English.plural(lable.substring(0, 1).toUpperCase() + lable.substring(1)));// first letter capital
            cartlabel =  cartlabel.replace("@CartLabel", lable.substring(0, 1).toUpperCase() + lable.substring(1));
            cartlabel =  cartlabel.replace("@cartLabel", English.plural(lable.toLowerCase()));
            cartlabel =  cartlabel.replace("@cartLabels", lable.toLowerCase());
            //itemCategoryLabel =  itemCategoryLabel.replace("@ITEMCATEGORIES", English.plural(lable.toUpperCase()));
            // itemCategoryLabel =  itemCategoryLabel.replace("@ITEMCATEGORIE", lable.toUpperCase());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return (cartlabel);
    }
}
