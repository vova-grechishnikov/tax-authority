import java.util.Objects;

public class Company {
    private Long id;
    private String taxNumber;
    private String companyName;
    private Long userId;
    private Boolean isGovernmentAgency;

    public Company(Long id, String taxNumber, String companyName, Long userId, Boolean isGovernmentAgency) {
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

    public void setIsGovernmentAgency(Boolean isGovernmentAgency) {
        this.isGovernmentAgency = isGovernmentAgency;
    }

    public Boolean getIsGovernmentAgency() {
        return isGovernmentAgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (this == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Company company = (Company) o;
        return id.equals(company.id) &&
                taxNumber.equals(company.taxNumber) &&
                companyName.equals(company.companyName) &&
                userId.equals(company.userId) &&
                isGovernmentAgency.equals(company.isGovernmentAgency);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (id == null ? 0 : id.hashCode());
        result = (int) (31 * result + id);
        result = 31 * result + (taxNumber == null ? 0 : taxNumber.hashCode());
        result = 31 * result + (companyName == null ? 0 : companyName.hashCode());
        result = 31 * result + (userId == null ? 0 : userId.hashCode());
        result = 31 * result + (isGovernmentAgency == null ? 0 : isGovernmentAgency.hashCode());
        return result;
    }
    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
