public enum RoomTypes {
    STANDARD("Standard", 100, "Стандартный однокомнатный номер"),
    STUDIO("Studio", 120, "Однокомнатный номер с мини-кухней"),
    SUITE("Suite", 150, "Номер улучшенной планировки"),
    SUITE2ROOMS("Suite 2 rooms", 180, "Номер улучшенной планировки, из двух комнат"),
    DELUXE("Deluxe", 250, "Номер повышенного комфорта"),
    PRESIDENT("President", 500, "Самые роскошные номера");

    private final String name;
    private final int price;
    private final String description;

    RoomTypes(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, Цена: %d, Описание: %s", getName(), getPrice(), getDescription());
    }
}
