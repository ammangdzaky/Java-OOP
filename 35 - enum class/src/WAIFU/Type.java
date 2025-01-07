package WAIFU;

public enum Type {

    TSUNDERE("Malu-malu kucing"),
    KUUDERE("Kuulest"),
    DANDERE("Pemalu");

    public String description;

    Type(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
