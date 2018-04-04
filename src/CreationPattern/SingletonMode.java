package CreationPattern;

/**
 * 创建型模式
 * 单例模式 -- 饿汉式
 * 在程序启动或单例模式类被加载的时候，单例模式实例就已经被创建。
 * 如果单例模式实例在系统中经常会被用到，饿汉式是一个不错的选择。
 * 反之如果单例模式在系统中会很少用到或者几乎不会用到，那么懒汉式是一个不错的选择。
 */
public class SingletonMode {
    // 定义一个实例
    private static SingletonMode singletonMode = new SingletonMode();
    // 定义一个访问点
    public static SingletonMode getSingletonMode(){
        return singletonMode;
    }

    // 私有化构造器
    private SingletonMode() {

    }
}
