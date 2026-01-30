public enum SlotType {
    SMALL(100),
    MEDIUM(150),
    LARGE(200);

    private final int pricePerHour;

    SlotType(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }
}
