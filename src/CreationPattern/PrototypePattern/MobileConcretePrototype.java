package CreationPattern.PrototypePattern;

public class MobileConcretePrototype extends MobilePrototype {
    public String type;
    public String info;

    @Override
    public void call(){
        System.out.println("type:"+type+",info:"+info+"尝试呼叫");
    }

    @Override
    public void mail(){
        System.out.println("type:"+type+",info:"+info+"尝试发送信息");
    }

    public void show(){
        System.out.println("prototype");
    }

    public Object myClone(){
        try {
            return this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
