package Goods;

public class SysadminsBeer extends Product {
    private double capacity;

    public SysadminsBeer(double pricePerItem, int count, double capacity) {
        super(pricePerItem, count);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "SysadminsBeer{" +
                super.toString() +
                ", capacity=" + capacity +
                '}';
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
