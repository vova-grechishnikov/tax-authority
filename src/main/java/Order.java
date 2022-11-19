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
        return id == order.id && Objects.equals(createdAtUtc, order.createdAtUtc) && Objects.equals(completedAtUtc, order.completedAtUtc) && Objects.equals(orderStatus, order.orderStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAtUtc, completedAtUtc, orderStatus);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createdAtUtc=" + createdAtUtc +
                ", completedAtUtc=" + completedAtUtc +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
