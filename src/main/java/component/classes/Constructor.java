package component.classes;

import syntax.Access;
import syntax.Identifier;

public class Constructor {
    private Access access;
    private Identifier id;

    public Constructor(Identifier id) {
        this(null, id);
    }

    public Constructor(Access access, Identifier id) {
        setAccess(access);
        setId(id);
    }


    // ----- Getters -----

    public Access getAccess() {
        return access;
    }

    public Identifier getId() {
        return id;
    }

    public String toString() {
        String out = "\t" + access + " " + id + "() {\n\t}";

        return out;
    }

    // ----- Setters -----

    public void setAccess(Access access) {
        if (access == null) {
            this.access = new Access();
        } else {
            this.access = access;
        }
    }

    public void setId(Identifier id) {
        this.id = id;
    }
}
