package CreationPattern.SimpleFactoryPattern;

public class FactoryTest {
    public static void main(String[] args) {
        Car carBMW = CarFactory.produceCar("BMW");
        Car carGelly = CarFactory.produceCar("Gelly");
        Car carMaybach = CarFactory.produceCar("Maybach");
        carBMW.run();
        carBMW.showInfo();
        System.out.println("=========================");
        carGelly.run();
        carGelly.showInfo();
        System.out.println("=========================");
        carMaybach.run();
        carMaybach.showInfo();
    }
}
