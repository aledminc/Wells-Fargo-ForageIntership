import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @OneToMany
    private List<Security> securities;

    protected Portfolio(){

    }

    public Portfolio() {
        this.securities = new ArrayList<>();
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

    public void addSecurity(Security security) {
        this.securities.add(security);
    }

    public void removeSecurity(Security security) {
        this.securities.remove(security);
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (Security security : securities) {
            totalValue += security.getPurchasePrice() * security.getQuantity();
        }
        return totalValue;
    }
}
