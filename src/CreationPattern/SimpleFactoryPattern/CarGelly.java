package CreationPattern.SimpleFactoryPattern;

public class CarGelly implements Car {
    public String name;

    public CarGelly(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void showInfo() {
        System.out.println("This car is " + name);
    }
}
