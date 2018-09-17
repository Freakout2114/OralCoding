package component.classes;

import syntax.Access;
import syntax.Identifier;

public class ClassObject {
    private Access access;
    private Identifier id;

    public ClassObject(Access access, Identifier id) {
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
        String output = "";

        output += access + " class " + id + " { }";

        return output;
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