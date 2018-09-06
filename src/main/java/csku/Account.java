package csku;

import java.util.ArrayList;

public class Account {

    private int balanceMoney;
    private ArrayList<History> transactions = new ArrayList<>();

    public Account() {
        this.balanceMoney = 0;
    }

    public Account(int balanceMoney){
        this.balanceMoney = balanceMoney;
    }

    public void income(String des, int money) {
        balanceMoney = balanceMoney + money;
        transactions.add(new History(money, des, "income : "));
    }

    public void expense(String des, int money) {
        if (money > balanceMoney){
            System.out.println("Your have negative balance.");
        }
        balanceMoney = balanceMoney - money;
        transactions.add(new History(money, des, "expense : "));
    }

    public int getBalanceMoney() {
        return balanceMoney;
    }

    public String resultHistory() {
        String result = "";
        for(int loop = 0; loop < transactions.size(); loop++){
            result = result + transactions.get(loop).getTypeAccount() + "" + transactions.get(loop).getMoney()
                    + " , description :  " + transactions.get(loop).getDescription() + "\n";
        }
        return result;
    }
}
