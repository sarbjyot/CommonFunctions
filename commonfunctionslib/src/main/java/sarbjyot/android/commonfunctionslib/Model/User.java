package sarbjyot.android.commonfunctionslib.Model;

import android.app.Activity;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import tech.imbibe.mart.android.app.user.MVC.Controller.CartHelper;
import tech.imbibe.mart.android.app.user.MVC.Controller.HelperClasses.CommonFunctions;

/**
 * Created by Desk71 on 11/17/2017.
 */

public class User {


    private String user_id;

    private String username;

    private String token;

    private String user_first_name;

    private String user_last_name;

    private String email;

    private String image_url;

    private String field_phone_number;

    private String[] role_names;

    public String[] getRole_names() {
        return role_names;
    }

    public void setRole_names(String[] role_names) {
        this.role_names = role_names;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_first_name() {
        return user_first_name;
    }

    public void setUser_first_name(String user_first_name) {
        this.user_first_name = user_first_name;
    }

    public String getUser_last_name() {
        return user_last_name;
    }

    public void setUser_last_name(String user_last_name) {
        this.user_last_name = user_last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getField_phone_number() {
        return field_phone_number;
    }

    public void setField_phone_number(String field_phone_number) {
        this.field_phone_number = field_phone_number;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static String userFormattedName(User user) {
        String userFormattedName = "";
        if (!CommonFunctions.isNullValue(user.getUser_first_name())) {
            userFormattedName = user.getUser_first_name();
        } else {
            userFormattedName = "";
        }

        if (!CommonFunctions.isNullValue(user.getUser_last_name())) {
            userFormattedName = userFormattedName+" "+user.getUser_last_name();
        } else {
            userFormattedName = userFormattedName;
        }
        return userFormattedName;
    }

    public static boolean isPlatformOrPatner (Activity mActivity) {
        List<String> roleList = new ArrayList<>();
        User currentUser = null;
        try {
            currentUser = CartHelper.getCurrentUser(mActivity);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if(currentUser!=null) {
            String[] role_names = currentUser.getRole_names();
            if (role_names != null) {
                roleList.clear();
                for (int i = 0; i < currentUser.getRole_names().length; i++) {
                    roleList.add(currentUser.getRole_names()[i]);
                }
                if (roleList.contains("platform") || roleList.contains("partner")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }


    }
    public static boolean isPlatformOrPatnerOrDelivery (Activity mActivity) {
        List<String> roleList = new ArrayList<>();
        User currentUser = null;
        try {
            currentUser = CartHelper.getCurrentUser(mActivity);
        } catch (JSONException e) {
            CommonFunctions.showToast(mActivity,""+e.getMessage());
        }
        if(currentUser!=null) {
            String[] role_names = currentUser.getRole_names();
            if (role_names != null) {
                roleList.clear();
                for (int i = 0; i < currentUser.getRole_names().length; i++) {
                    roleList.add(currentUser.getRole_names()[i]);
                }
                if (roleList.contains("platform") || roleList.contains("partner") || roleList.contains("deliverer")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isPlatform (Activity mActivity) {
        List<String> roleList = new ArrayList<>();
        User currentUser = null;
        try {
            currentUser = CartHelper.getCurrentUser(mActivity);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if(currentUser!=null) {
            String[] role_names = currentUser.getRole_names();
            if (role_names != null) {
                roleList.clear();
                for (int i = 0; i < currentUser.getRole_names().length; i++) {
                    roleList.add(currentUser.getRole_names()[i]);
                }
                if (roleList.contains("platform")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isPatner (Activity mActivity) {
        List<String> roleList = new ArrayList<>();
        User currentUser = null;
        try {
            currentUser = CartHelper.getCurrentUser(mActivity);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if(currentUser!=null) {
            String[] role_names = currentUser.getRole_names();
            if (role_names != null) {
                roleList.clear();
                for (int i = 0; i < currentUser.getRole_names().length; i++) {
                    roleList.add(currentUser.getRole_names()[i]);
                }
                if(roleList.size()==1) {
                    if (roleList.contains("partner")) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }

            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isPlatformOrDeliverer (Activity mActivity) {
        List<String> roleList = new ArrayList<>();
        User currentUser = null;
        try {
            currentUser = CartHelper.getCurrentUser(mActivity);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if(currentUser!=null) {
            String[] role_names = currentUser.getRole_names();
            if (role_names != null) {
                roleList.clear();
                for (int i = 0; i < currentUser.getRole_names().length; i++) {
                    roleList.add(currentUser.getRole_names()[i]);
                }
                if (roleList.contains("deliverer") && roleList.contains("platform")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isDeliverer (Activity mActivity) {
        List<String> roleList = new ArrayList<>();
        User currentUser = null;
        try {
            currentUser = CartHelper.getCurrentUser(mActivity);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if(currentUser!=null) {
            String[] role_names = currentUser.getRole_names();
            if (role_names != null) {
                roleList.clear();
                for (int i = 0; i < currentUser.getRole_names().length; i++) {
                    roleList.add(currentUser.getRole_names()[i]);
                }
                if (roleList.contains("deliverer")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isAuthenticatedUser (Activity mActivity) {
        User currentUser = null;
        try {
            currentUser = CartHelper.getCurrentUser(mActivity);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if(currentUser!=null) {
            String[] role_names = currentUser.getRole_names();
            if (role_names != null) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
