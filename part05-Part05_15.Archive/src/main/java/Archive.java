public class Archive {
    private String name, identifier;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedItem = (Archive) compared;

        return this.identifier.equals(comparedItem.identifier);
    }
}


