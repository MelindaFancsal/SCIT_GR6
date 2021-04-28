package nestedclass;

public class MainTest {
    public static void main(String[] args) {
        Car car1 = new Car("4WD", "Mazda");
        Car.Engine engine = car1.new Engine();
        engine.setEngine();

        System.out.println(engine.getEngineType());

        //v2
        Car2 car2= new Car2("4WD", "Mazda");
        System.out.println( car2.getEngine().getType());
    }
}
