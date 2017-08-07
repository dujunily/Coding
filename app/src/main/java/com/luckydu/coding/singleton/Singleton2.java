package com.luckydu.coding.singleton;

/**
 * @author dujun
 * @since 2017-08-07 15:45
 *
 * 懒汉模式加载单例（线程不安全）
 *
 * 懒汉模式申明了一个静态对象，在用户第一次调用时初始化，虽然节约了资源，但第一次加载时需要实例化，反映稍慢一些，而且在多线程不能正常工作。
 */

class Singleton2 {
    private static Singleton2 ourInstance;

    static Singleton2 getInstance () {
        if (ourInstance == null) {
            new Singleton2();
        }
        return ourInstance;
    }

    private Singleton2 () {
    }
}
