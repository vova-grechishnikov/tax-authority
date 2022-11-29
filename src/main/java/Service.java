import java.util.Objects;

public class Service {
    private Long id;
    private Character serviceName;
    private Long sum;

    public Service(Long id, Character serviceName, Long sum) {
        this.id = id;
        this.serviceName = serviceName;
        this.sum = sum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getServiceName() {
        return serviceName;
    }

    public void setServiceName(Character serviceName) {
        this.serviceName = serviceName;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(this.id, service.id) &&
                Objects.equals(this.serviceName, service.serviceName) &&
                Objects.equals(this.sum, service.sum);
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
