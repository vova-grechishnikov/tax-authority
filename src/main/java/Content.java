import java.util.Objects;

public class Content {
    private Long id;
    private Integer quantity;
    private Long serviceId;

    public Content(Long id, Integer quantity, Long serviceId) {
        this.id = id;
        this.quantity = quantity;
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

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return id == content.id && quantity == content.quantity && serviceId == content.serviceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, serviceId);
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", serviceId=" + serviceId +
                '}';
    }
}
