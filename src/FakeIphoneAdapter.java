class FakeIphoneAdapter implements Product {
    private final FakeIphone fakeIphone;

    public FakeIphoneAdapter(FakeIphone fakeIphone) {
        this.fakeIphone = fakeIphone;
    }

    @Override
    public String getName() {
        return fakeIphone.title();
    }

    @Override
    public double getPrice() {
        // Мошенники маскируют цену под оригинал
        return 1200.0;
    }

    @Override
    public int getWarranty() {
        // Обманывают: заявляют 24 мес., хотя реальность — 30 дней
        return 24;
    }

}
