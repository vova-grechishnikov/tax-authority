import java.util.Objects;

public class Document {
    private Long id;
    private Long orderId;
    private String document;

    public Document(Long id, Long orderId, String document) {
        this.id = id;
        this.orderId = orderId;
        this.document = document;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document1 = (Document) o;
        return id == document1.id && orderId == document1.orderId && Objects.equals(document, document1.document);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, document);
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", document='" + document + '\'' +
                '}';
    }
}
