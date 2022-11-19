import java.util.Objects;

public class Detail {
    private Long id;
    private Long companyId;
    private Long orderId;
    private OperationType operationType;

    public Detail(Long id, Long companyId, Long orderId, OperationType operationType) {
        this.id = id;
        this.companyId = companyId;
        this.orderId = orderId;
        this.operationType = operationType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detail detail = (Detail) o;
        return id == detail.id && companyId == detail.companyId && orderId == detail.orderId && operationType == detail.operationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyId, orderId, operationType);
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", orderId=" + orderId +
                ", operationType=" + operationType +
                '}';
    }
}
