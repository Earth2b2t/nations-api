package earth2b2t.nations.api.model;

public enum MemberRole {
    KING(2, "nations.general.king"),
    MINISTER(1, "nations.general.minister"),
    CITIZEN(0, "nations.general.citizen");

    private final int level;
    private final String translationKey;

    MemberRole(int level, String translationKey) {
        this.level = level;
        this.translationKey = translationKey;
    }

    public int getLevel() {
        return level;
    }

    public String getTranslationKey() {
        return translationKey;
    }
}
