package Goods;

public class Banana extends Product {
    public Banana(double pricePerItem, int count) {
        super(pricePerItem, count);
    }

    @Override
    public String toString() {
        return "Banana{" + super.toString() + "}";
    }
}
