import java.util.Objects;

public class OrderContentLink {
    private Long orderId;
    private Long contentId;

    public OrderContentLink(Long orderId, Long contentId) {
        this.orderId = orderId;
        this.contentId = contentId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public Long getContentId() {
        return contentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderContentLink that = (OrderContentLink) o;
        return orderId == that.orderId && contentId == that.contentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, contentId);
    }

    @Override
    public String toString() {
        return "OrderContentLink{" +
                "orderId=" + orderId +
                ", contentId=" + contentId +
                '}';
    }
}
