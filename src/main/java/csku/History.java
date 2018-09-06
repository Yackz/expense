package csku;

public class History {

    private int money;
    private String description;
    private String typeAccount;

    public History(int money, String description, String typeAccount) {
        this.money = money;
        this.description = description;
        this.typeAccount = typeAccount;
    }

    public int getMoney() {
        return money;
    }

    public String getDescription() {
        return description;
    }

    public String getTypeAccount() {
        return typeAccount;
    }
}
