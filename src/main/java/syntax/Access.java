package syntax;

public class Access {
    private AccessType accessType;

    public Access() {
        this.accessType = AccessType.PUBLIC;
    }

    public Access(AccessType accessType) {
        this.accessType = accessType;
    }

    // ----- Getters -----

    public AccessType getAccessType() {
        return this.accessType;
    }

    public static boolean isAccessKeyword(String keyword) {
        return AccessType.contains(keyword);
    }

    public String toString() {
        return accessType.value();
    }

    // ----- Setters -----

    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }

}
