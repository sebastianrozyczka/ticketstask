public enum TicketType {
    ONLINE("Online", "bilet wysyłany drogą elektroniczną (email)"),
    STANDARD("Standard", "bilet papierowy, wysyłany tradycyjną pocztą"),
    GIFT("Gift", "bilet prezentowy, który jest pakowany w " +
            "ozdobne opakowanie i może zawierać np. autograf artysty"),
    NONE("NONE", "");

    private String name;
    private String description;

    TicketType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
