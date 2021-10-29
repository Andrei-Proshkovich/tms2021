public abstract class Transport {
    double power;
    int maxSpeed;
    int weight;
    String brand;

    public double powerInKB(int powerKB) {
        return powerKB * 0.74;
    }

}
