package CreationPattern.SimpleFactoryPattern;

public class CarFactory {
    public CarFactory(String name) {

    }

    public static Car produceCar(String name){
        if ( name.equals("BMW")) {
            return new CarBMW("BMW");
        } else if ( name.equals("Gelly")) {
            return new CarGelly("Gelly");
        } else if ( name.equals("Maybach")) {
            return new CarMaybach("Maybach");
        }
        return null;
    }
}
