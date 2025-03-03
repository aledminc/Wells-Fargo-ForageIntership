import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private long securityId;

    private String name;
    private String category;
    private double purchasePrice;
    private int quantity;
    private String purchaseDate


    protected Security() {
    }
    public Security(String name, String category, double purchasePrice, int quantity, String purchaseDate) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
    }

    // Getter for securityId
    public long getSecurityId() {
        return securityId;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Getter and setter for purchasePrice
    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    // Getter and setter for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    // Method to calculate the total value of this security (purchasePrice * quantity)
    public double getTotalValue() {
        return purchasePrice * quantity;
    }
}
