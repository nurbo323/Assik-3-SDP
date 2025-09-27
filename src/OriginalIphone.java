public class OriginalIphone implements Product {

    @Override
    public String getName() {
        return "iPhone 15 Pro";
    }

    @Override
    public double getPrice() {
        return 1200.0;
    }

    @Override
    public int getWarranty() {
        return 24; // 2 года гарантии
    }
}