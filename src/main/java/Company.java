import java.util.Objects;

public class Company {
    private Long id;
    private String taxNumber;
    private String companyName;
    private Long userId;
    private Short isGovernmentAgency;

    public Company(Long id, String taxNumber, String companyName, Long userId, Short isGovernmentAgency) {
        this.id = id;
        this.taxNumber = taxNumber;
        this.companyName = companyName;
        this.userId = userId;
        this.isGovernmentAgency = isGovernmentAgency;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setIsGovernmentAgency(Short isGovernmentAgency) {
        this.isGovernmentAgency = isGovernmentAgency;
    }

    public Short getIsGovernmentAgency() {
        return isGovernmentAgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(this.id, company.id) &&
               Objects.equals(this.taxNumber, company.taxNumber) &&
               Objects.equals(this.companyName, company.companyName) &&
               Objects.equals(this.userId, company.userId) &&
               Objects.equals(this.isGovernmentAgency, company.isGovernmentAgency);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (id == null ? 0 : id.hashCode());
        result = (int) (31 * result + id);
        return result;
    }
    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
