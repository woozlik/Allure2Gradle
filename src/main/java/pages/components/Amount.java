package pages.components;

public enum Amount {
    _2750("2.750"),
    _10000("10.000");

    private String amount;

    Amount(String amount) {
        this.amount = amount;
    }
    public String getValue(){
        return amount;
    }
}
