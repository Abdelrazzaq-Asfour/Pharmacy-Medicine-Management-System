public class Medicine {
    private String commercialName;
    private String scientificName;
    private String id;
    private int quantity;
    private String manufactureDate;
    private String expiryDate;

    public Medicine(String id, String commercialName, String scientificName, int quantity, String manufactureDate, String expiryDate) {
        this.id = id;
        this.commercialName = commercialName;
        this.scientificName = scientificName;
        this.quantity = quantity;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
    }

    public String getId() {
        return id;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int amount) {
        if (amount > 0) quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        if (amount > 0 && quantity >= amount) quantity -= amount;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public boolean isExpired(String todayDate) {
        return expiryDate.compareTo(todayDate) < 0;
    }

    @Override
    public String toString() {
        return commercialName + " (" + scientificName + ") - Qty: " + quantity + ", Exp: " + expiryDate;
    }
}
