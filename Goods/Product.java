package Goods;

public abstract class Product {
    private double pricePerItem;
    private int count;

    public Product(double pricePerItem, int count) {
        this.pricePerItem = pricePerItem;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getSummaryPrice() {
        return pricePerItem * count;
    }

    @Override
    public String toString() {
        return "pricePerItem=" + pricePerItem +
                ", count=" + count +
                ", summary price=" + pricePerItem * count;
    }
}
