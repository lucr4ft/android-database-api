package lucraft.database;

import android.util.Log;

public class DataStorage {

    private static DataStorage instance;

    //---------------------------------------

    public static DataStorage getInstance() {
        return instance;
    }

    public static void setInstance(String host, int port) {

    }

    public static void test(Object test) {
        Log.e("TEST-ERROR", test.toString());
    }

}
