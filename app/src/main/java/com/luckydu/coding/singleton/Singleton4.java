package com.luckydu.coding.singleton;

/**
 * @author dujun
 * @since 2017-08-07 15:51
 *
 * 双重检查模式 （DCL）
 * 这种写法在getSingleton方法中对singleton进行了两次判空，第一次是为了不必要的同步，第二次是在singleton等于null的情况下才创建实例。
 */

class Singleton4 {
    private static volatile Singleton4 ourInstance ;

    static Singleton4 getInstance () {
        if (ourInstance == null) {
            synchronized (Singleton4.class) {
                if (ourInstance != null) {
                    ourInstance = new Singleton4();
                }
            }
        }
        return ourInstance;
    }

    private Singleton4 () {
    }
}
