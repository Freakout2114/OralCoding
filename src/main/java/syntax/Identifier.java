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
        id = id.substring(0, 1).toUpperCase() + id.substring(1);
        this.id = id;
    }
}
