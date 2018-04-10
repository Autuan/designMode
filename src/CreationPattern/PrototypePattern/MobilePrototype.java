package CreationPattern.PrototypePattern;

/**
 * 使用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。原型模式是一种对象创建型模式。
 * （抽象原型类）：它是声明克隆方法的接口，是所有具体原型类的公共父类
 */
public abstract class MobilePrototype implements Cloneable {
    public void call(){};
    public void mail(){};
}
