package net.burningtnt.crowdinsynchronizer.crowdin.objects;

public final class CrowdinTranslationKeyItemObject {
    private final int id;

    private final String identifier;

    private CrowdinTranslationKeyItemObject(int id, String identifier) {
        this.id = id;
        this.identifier = identifier;
    }

    public int getID() {
        return this.id;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CrowdinTranslationKeyItemObject that = (CrowdinTranslationKeyItemObject) o;

        if (id != that.id) return false;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + identifier.hashCode();
        return result;
    }
}
