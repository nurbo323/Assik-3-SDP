public class Main {
    public static void main(String[] args) {
        Product originalIphone = new OriginalIphone();
        Product fakeIphoneAsOriginal = new FakeIphoneAdapter(new FakeIphone());

        displayProduct("Original Product", originalIphone);
        displayProduct("Fake Product", fakeIphoneAsOriginal);
    }

    private static void displayProduct(String title, Product product) {
        System.out.println(" " + title + " ");
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Warranty: " + product.getWarranty() + " months");
        System.out.println();
    }
}