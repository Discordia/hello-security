package hello.security;

import java.util.Map;
import java.util.Objects;

public class HelloResponse {
    private String id;
    private Map<String,String> properties;

    public HelloResponse() {
    }

    public HelloResponse(String id, Map<String, String> properties) {
        this.id = id;
        this.properties = properties;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloResponse that = (HelloResponse) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, properties);
    }

    @Override
    public String toString() {
        return "HelloResponse{" +
                "id='" + id + '\'' +
                ", properties=" + properties +
                '}';
    }
}
