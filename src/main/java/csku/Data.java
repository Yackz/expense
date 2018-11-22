package csku;

public class Data {
    private String type, description;
    private String amount;

    public Data(String type, String description, String amount) {
        this.amount = amount;
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        String record = "";
        record += type + " : ";
        record += description + " ";
        record += type.equals("Income")?"+" + amount:"-" + amount;
        return record;
    }
}
