package com.luckydu.coding.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dujun
 * @since 2017-08-07 16:01
 */

public class SingletonManager {

    private static Map<String,Object> objMap = new HashMap<>();

    private SingletonManager() {}

    public static void registerService(String key, Object instance){
        if (!objMap.containsKey(key)) {
            objMap.put(key,instance);
        }
    }

    public static Object getService(String key){
        return objMap.get(key);
    }
}
