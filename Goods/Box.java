package Goods;

public class Box extends Product {
    private double weightCapacity;

    public Box(double pricePerItem, int count, double weightCapacity) {
        super(pricePerItem, count);
        this.weightCapacity = weightCapacity;
    }

    @Override
    public String toString() {
        return "Box{" + super.toString() +
                ", weightCapacity=" + weightCapacity +
                '}';
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }
}
