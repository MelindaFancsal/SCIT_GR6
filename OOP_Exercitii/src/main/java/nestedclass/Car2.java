package nestedclass;

public class Car2 {
    private String type;
    private String name;
    private final Engine2 engine;

    public Car2(String type, String name) {
        this.name = name;
        this.type = type;
        engine = new Engine2();
        setEngineType();
    }

    private void setEngineType() {
        if (this.type.equalsIgnoreCase("4WD")) {
            if (this.name.equalsIgnoreCase("BMW")) {
                engine.setType("mic");
            } else {
                engine.setType("mare");
            }
        } else {
            engine.setType("mare");
        }
    }

    public Engine2 getEngine() {
        return engine;
    }
}
