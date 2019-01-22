package hello.security;

import java.util.Objects;

public class GameReference {
    private String referenceId;
    private String name;

    public GameReference(String referenceId, String name) {
        this.referenceId = referenceId;
        this.name = name;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameReference that = (GameReference) o;
        return Objects.equals(referenceId, that.referenceId) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referenceId, name);
    }

    @Override
    public String toString() {
        return "GameReference{" +
                "referenceId='" + referenceId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
