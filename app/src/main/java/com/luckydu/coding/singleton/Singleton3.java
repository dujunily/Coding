package com.luckydu.coding.singleton;

/**
 * @author dujun
 * @since 2017-08-07 15:48
 *
 * 懒汉模式加载单例（线程安全的）
 * 这种写法能够在多线程中很好的工作，但是每次调用getInstance方法时都需要进行同步，造成不必要的同步开销，而且大部分时候我们是用不到同步的，所以不建议用这种模式。
 */

class Singleton3 {
    private static Singleton3 ourInstance ;

    synchronized static Singleton3 getInstance () {
        if (ourInstance == null) {
            ourInstance = new Singleton3();
        }
        return ourInstance;
    }

    private Singleton3 () {
    }
}
