package component.classes;

import syntax.Access;
import syntax.Identifier;

public class ClassObject {
    private Access access;
    private Identifier id;
    private Constructor constructor;

    public ClassObject(Access access, Identifier id) {
        setAccess(access);
        setId(id);
        constructor = new Constructor(id);
    }

    // ----- Getters -----

    public Access getAccess() {
        return access;
    }

    public Identifier getId() {
        return id;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public String toString() {
        String output = access + " class " + id + " {\n" +
                constructor +
                "\n}";

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

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }
}