import java.util.Objects;

public class Company {
    private Long id;
    private Character taxNumber;
    private Character companyName;
    private Long userId;
    private Short isGovernmentAgency;

    public Company(Long id,Character taxNumber, Character companyName, Long userId, Short isGovernmentAgency){

        this.id = id;
        this.taxNumber = taxNumber;
        this.companyName = companyName;
        this.userId = userId;
        this.isGovernmentAgency = isGovernmentAgency;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTaxNumber(Character taxNumber){
        this.taxNumber = taxNumber;
    }

    public Character getTaxNumber() {
        return taxNumber;
    }

    public void setCompanyName(Character companyName){
        this.companyName = companyName;
    }

    public Character getCompanyName(){
        return companyName;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public Long getUserId(){
        return userId;
    }

    public void setIsGovernmentAgency(Short isGovernmentAgency){
        this.isGovernmentAgency = isGovernmentAgency;
    }

    public Short getIsGovernmentAgency(){
        return isGovernmentAgency;
    }

    public String toString() {
        return "Company{" +
                "id=" + id +
                ", taxNumber=" + taxNumber +
                ", companyName=" + companyName +
                ", userId=" + userId +
                ", isGovernmentAgency=" + isGovernmentAgency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id && taxNumber == company.taxNumber && companyName == company.companyName && userId == company.userId && isGovernmentAgency == company.isGovernmentAgency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taxNumber, companyName, userId, isGovernmentAgency);
    }

}
