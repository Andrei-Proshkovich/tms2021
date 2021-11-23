import java.io.Serializable;

public class Car implements Serializable {

    private String model;
    private String marka;
    private String color;
    public Engine engine;
    public GasTank benzobak;

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", benzobak=" + benzobak +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GasTank getBenzobak() {
        return benzobak;
    }

    public void setBenzobak(GasTank benzobak) {
        this.benzobak = benzobak;
    }

    public Car(String model, String marka, String color, Engine engine, GasTank benzobak) {
        this.model = model;
        this.marka = marka;
        this.color = color;
        this.engine = engine;
        this.benzobak = benzobak;
    }

    static class Engine implements Serializable {
        private transient int countOfCylinders;
        private String type;

        public int getCountOfCylinders() {
            return countOfCylinders;
        }

        public void setCountOfCylinders(int countOfCylinders) {
            this.countOfCylinders = countOfCylinders;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "countOfCylinders=" + countOfCylinders +
                    ", type='" + type + '\'' +
                    '}';
        }

        public Engine(int countOfCylinders, String type) {
            this.countOfCylinders = countOfCylinders;
            this.type = type;
        }
    }

    static class GasTank implements Serializable {
        public GasTank(int volumeGastank, String type) {
            this.volumeGastank = volumeGastank;
            this.type = type;
        }

        private int volumeGastank;
        private String type;

        public int getVolumeGastank() {
            return volumeGastank;
        }

        public void setVolumeGastank(int volumeGastank) {
            this.volumeGastank = volumeGastank;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }


        @Override
        public String toString() {
            return "GasTank{" +
                    "volumeGastank=" + volumeGastank +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}