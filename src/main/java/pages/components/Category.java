package pages.components;

public enum Category {
    UMSCHULDUNG("Umschuldung"),
    AUTO_MOTORRAD("Auto / Motorrad"),
    WOHNEN("Wohnen"),
    GEWERBE("Gewerbe"),
    FREIE_VERWENDUNG("Freie Verwendung");

    private String category;

    Category(String category) {
        this.category = category;
    }

    public String getValue(){
        return category;
    }
}
