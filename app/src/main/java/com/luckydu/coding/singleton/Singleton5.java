package com.luckydu.coding.singleton;

/**
 * @author dujun
 * @since 2017-08-07 15:54
 *
 * 静态内部类单例模式
 *
 * 第一次加载Singleton类时并不会初始化sInstance，只有第一次调用getInstance方法时虚拟机加载SingletonHolder 并初始化sInstance ，这样不仅能确保线程安全也能保证Singleton类的唯一性，所以推荐使用静态内部类单例模式。
 */

public class Singleton5 {

    private Singleton5 () {
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final Singleton5 sInstance = new Singleton5();
    }
}
