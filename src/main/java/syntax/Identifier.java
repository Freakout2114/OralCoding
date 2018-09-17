package syntax;

public class Identifier {
    private String id;

    public Identifier(String id) {
        setId(id);
    }

    // ----- Getters -----

    public String getId() {
        return id;
    }

    public String toString() {
        return id;
    }

    // ----- Setters -----

    public void setId(String id) {
        this.id = id;
    }
}
