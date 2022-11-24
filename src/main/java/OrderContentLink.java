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
        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(contentId, that.contentId);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (orderId == null ? 0 : orderId.hashCode());
        result = (int) (31 * result + orderId);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + Integer.toHexString(hashCode());
    }
}
