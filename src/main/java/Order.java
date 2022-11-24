import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private Long id;
    private LocalDate createdAtUtc;
    private LocalDate completedAtUtc;
    private String orderStatus;

    public Order(Long id, LocalDate createdAtUtc, LocalDate completedAtUtc, String orderStatus) {
        this.id = id;
        this.createdAtUtc = createdAtUtc;
        this.completedAtUtc = completedAtUtc;
        this.orderStatus = orderStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedAtUtc() {
        return createdAtUtc;
    }

    public void setCreatedAtUtc(LocalDate createdAtUtc) {
        this.createdAtUtc = createdAtUtc;
    }

    public LocalDate getCompletedAtUtc() {
        return completedAtUtc;
    }

    public void setCompletedAtUtc(LocalDate completedAtUtc) {
        this.completedAtUtc = completedAtUtc;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(this.id, order.id) &&
                Objects.equals(this.createdAtUtc, order.createdAtUtc) &&
                Objects.equals(this.completedAtUtc, order.completedAtUtc) &&
                Objects.equals(this.orderStatus, order.orderStatus);
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
