package syntax;

public enum AccessType {
    PUBLIC ("public"),
    PROTECTED ("protected"),
    PRIVATE ("private"),
    NOMODIFIER ("");

    private String value;

    AccessType(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    /**
     * Returns boolean if the value passed in matches one of the access types.
     * @param value variable to match against
     * @return boolean
     */
    public static boolean contains(String value) {
        for (AccessType accessType : AccessType.values()) {
            if (accessType.value().equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the AccessType if it exists
     * @param value
     * @return
     */
    public static AccessType getType(String value) {
        for (AccessType accessType : AccessType.values()) {
            if (accessType.value().equals(value)) {
                return accessType;
            }
        }
        throw new IllegalArgumentException("AccessType does not contain the type " + value);
    }
}
