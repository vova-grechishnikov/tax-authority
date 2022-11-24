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

    public Long  getServiceId() {
        return serviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return Objects.equals(this.id, content.id) &&
               Objects.equals(this.quantity, content.quantity) &&
               Objects.equals(this.serviceId, content.serviceId);
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
