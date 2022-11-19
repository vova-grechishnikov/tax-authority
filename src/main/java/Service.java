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
        return id == service.id && serviceName == service.serviceName && sum == service.sum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serviceName, sum);
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", serviceName=" + serviceName +
                ", sum=" + sum +
                '}';
    }

}
