package CreationPattern.PrototypePattern;

public class MobileClient {
    public static void main(String[] args) {
        MobileConcretePrototype mobile = new MobileConcretePrototype();
        for (int i=0; i<3; i++) {
            MobileConcretePrototype mobileCopy;
            mobileCopy = (MobileConcretePrototype) mobile.myClone();
            mobileCopy.show();
        }
    }
}
