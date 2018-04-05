package CreationPattern;

/**
 * 创建型模式
 * 单例模式 -- 懒汉式
 * 在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
 * 如果单例模式实例在系统中经常会被用到，饿汉式是一个不错的选择。
 * 反之如果单例模式在系统中会很少用到或者几乎不会用到，那么懒汉式是一个不错的选择。
 */
public class SingletonMode2 {
    // 定义一个实例 ( 没有初始化 )
    private static SingletonMode2 singletonMode = null;
    // 定义一个访问点 synchronized 保证同步
    public static synchronized SingletonMode2 getSingletonMode2(){
        if ( singletonMode == null ) {
            singletonMode = new SingletonMode2();
        }
        return singletonMode;
    }
    // 私有化构造器
    private SingletonMode2(){}
}
