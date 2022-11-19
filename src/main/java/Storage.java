import java.util.Objects;

public class Storage {
    private Long id;
    private Integer quantity;
    private Long companyId;
    private Long serviceId;

    public Storage(Long id, Integer quantity, Long companyId, Long serviceId) {
        this.id = id;
        this.quantity = quantity;
        this.companyId = companyId;
        this.serviceId = serviceId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", companyId=" + companyId +
                ", serviceId=" + serviceId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return id == storage.id && quantity == storage.quantity && companyId == storage.companyId && serviceId == storage.serviceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, companyId, serviceId);
    }
}
