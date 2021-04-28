package nestedclass;

public class Car {
    private String type;
    private String name;

    public Car(String type, String name) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    class Engine {
        private String type;

        void setEngine() {
            if (Car.this.type.equalsIgnoreCase("4WD")) {
                if (Car.this.name.equalsIgnoreCase("BMW")) {
                    this.type = "mic";
                } else {
                    this.type = "mare";
                }
            } else {
                this.type = "mare";
            }
        }

        public String getEngineType() {
            return type;
        }
    }
}
